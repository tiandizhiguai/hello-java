package com.algo;

import java.util.ArrayList;
import java.util.List;

public class DFSExample {

	//组合
	public static List<List<Integer>> combine(int[] nums) {
		List<List<Integer>> res = new ArrayList<>();
		List<Integer> path = new ArrayList<>();
		dfs(nums, 0, path, res);
		return res;
	}

	private static void dfs(int[] nums, int begin, List<Integer> path, List<List<Integer>> res) {
		res.add(new ArrayList<>(path));
		for (int i = begin; i < nums.length; i++) {
			path.add(nums[i]);
			dfs(nums, i + 1, path, res);
			path.remove(path.size() - 1);
		}
	}
	
	//全排列
	public static List<List<Integer>> permute(int[] nums) {
		boolean[] used = new boolean[nums.length];
		List<Integer> item = new ArrayList<>();
		List<List<Integer>> res = new ArrayList<>();
		dfs(nums, item, res, used);
		return res;
    }
	
	private static void dfs(int[] nums, List<Integer> item, List<List<Integer>> res, boolean[] used){
		if(item.size() == nums.length){
			res.add(new ArrayList<>(item));
			return;
		}
		for(int i = 0; i < nums.length; i++){
			if(used[i]){
				continue;
			}
			used[i] = true;
			item.add(nums[i]);
			dfs(nums, item, res, used);
			item.remove(item.size() - 1);
			used[i] = false;
		}
	}

	public static void main(String[] args) {
		System.out.println(combine(new int[] { 1, 2, 3 }));
	}
}