package com.algo.ali;

import java.util.HashMap;
import java.util.Map;

/**
 * 1. pattern = “abba”, str=“北京 杭州 杭州 北京” 返回 ture
 * 2. pattern = “aabb”, str=“北京杭州 杭州 北京” 返回 false
 */
public class WordPattern {
	
	public static boolean pattern(String pattern, String str) {
		if(pattern == null && str == null) {
			return true;
		}
		if(pattern == null || str == null) {
			return false;
		}
		
		String[] strs = str.split("\\s");
		if(pattern.length() != strs.length) {
			return false;
		}
		
		Map<Character, String> map = new HashMap<>();
		for(int i = 0; i < strs.length; i++) {
			String value = map.get(pattern.charAt(i));
			if(value != null && !value.equals(strs[i])) {
				return false;
			}
			map.put(pattern.charAt(i), strs[i]);
		}
		
		return true;
	}
	
	public static void main(String[] args) {
		String pattern = "baba", str="北京 杭州 杭州 北京";
		System.out.println(pattern(pattern, str));
	}
}