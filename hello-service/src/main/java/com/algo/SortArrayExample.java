package com.algo;

import java.util.Arrays;

/**
 * 
* 快速排序，参考：https://www.runoob.com/w3cnote/quick-sort.html
* 
* @version V1.0
 */
public class SortArrayExample {

	public static void main(String[] args) {
		int[] nums = new int[] { 3, 6, 1, 7, 2, 10 };
		int[] arr = doSort(nums, 0, nums.length - 1);
		System.out.println(Arrays.toString(arr));
	}

	public static int[] doSort(int[] nums, int l, int r) {
		if (l >= r) {
			return nums;
		}
		
		int i = l, j = r, x = nums[l];
		while (i < j) {
			while (nums[j] > x && i < j) {
				j--;
			}
			if (i < j) {
				nums[i++] = nums[j];
			}

			while (nums[i] <= x && i < j) {
				i++;
			}
			if (i < j) {
				nums[j--] = nums[i];
			}
		}
		nums[i] = x;
		
		doSort(nums, l, i - 1);
		doSort(nums, i + 1, r);

		return nums;
	}
}