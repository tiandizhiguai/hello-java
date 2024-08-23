package com.algo.ali;

/**
 * 数组的整数+1。
 */
public class AddOne {
	
	public static int[] addOne(int[] nums) {
		
		int carry = 1;
		for(int i = nums.length - 1; i >= 0; i--) {
			int num = nums[i];
			nums[i] = (num + carry) % 10;
			carry = (num + carry) / 10;
		}
		
		if(carry == 0) {
			return nums;
		}
		
		int[] res = new int[nums.length + 1];
		res[0] = carry;
		for(int i = 1; i < res.length; i++) {
			res[i] = nums[i - 1];
		}
		
		return res;
	}
	
	public static void main(String[] args) {
		System.out.println(addOne(new int[] {9,9,8}));
	}
}
