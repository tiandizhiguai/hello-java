package com.hello;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Test {

	public static Map<Integer, Set<Integer>> combinationSum2(int[] candidates, int[] targets) {
		Map<Integer, List<Set<Integer>>> ret = new HashMap<>();
        for(int target : targets) {
        	ret.put(target, findAllCombinations(candidates, target));
        }
        
        Map<Integer, Set<Integer>> ret2 = new HashMap<>();
        for(Integer key : ret.keySet()) {
        	List<Set<Integer>> values = ret.get(key);
        	for(Set<Integer> value : values) {
        		ret2.put(key, value);
        		for(Integer key2 : ret.keySet()) {
                	if(key == key2) {
                		continue;
                	}
                	List<Set<Integer>> values2 = ret.get(key2);
                	for(Set<Integer> value2 : values2) {
                		if(!hasSame(ret2.values(), value2)) {
                			ret2.put(key2, value2);
                			break;
                		}
                	}
                }
        		if(ret2.size() == ret.size()) {
        			return ret2;
        		}
        		ret2.clear();
        	}
        }
        
        return ret2;
	}
	
	private static boolean hasSame(Collection<Set<Integer>> all, Set<Integer> s2) {
		for(Set<Integer> item : all) {
			for(Integer s11 : item) {
				if(s2.contains(s11)) {
					return true;
				}
			}
		}
		return false;
	}
	
	public static List<Set<Integer>> findAllCombinations(int[] arr, int target) {
        List<Set<Integer>> result = new ArrayList<>();
        int n = arr.length;
        int total = 1 << n; // 2^n
        
        for (int mask = 0; mask < total; mask++) {
            Set<Integer> combo = new HashSet<>();
            int sum = 0;
            for (int i = 0; i < n; i++) {
                if ((mask & (1 << i)) != 0) {
                    combo.add(i);
                    sum += arr[i];
                }
            }
            if(sum >= target) {
            	result.add(combo);
            }
        }
        
        return result;
    }
    
    public static void main(String[] args) {
        int[] a1 = {6, 6, 5, 4};
        int[] targets1 = {4, 6, 10};
        System.out.println(combinationSum2(a1, targets1));
    }
}