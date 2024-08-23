package com.algo;

import java.util.Arrays;

/**
 * 基本思想：把数组下标当做出现的数值，其下标对应的值作为该数值出现的次数，具体做法是依次遍历数组，变量i作为数组的下标，每一步有如下情况：
首先找到i数组值，如果该数组值小于等于0，就代表i出现的次数，否则index = nums[i]，进行如下两种情况：
1.如果index对应的数组值大于0，则把该数组值置为-1；
2.如果index对应的数组值小于等于0，则该数组值减1；
例如，输入数组：[5, 4, 4, 4, 4]
则执行过程如下：
[4, 4, 4, 4, -1]
[4, 4, 4, -1, -1]
[0, 4, 4, -2, -1]
[0, 0, 4, -3, -1]
[0, 0, 0, -4, -1]
[0, 0, 0, -4, -1]
3.最后把得到的数组值转为正整数即可。
 * 
 */
public class ArrayTest {

	public static int[] times(int nums[]) {
		int i = 0;
		while (i < nums.length) {
			if (nums[i] <= 0) {
				i++;
				continue;
			}
			int index = nums[i] - 1;
			if (nums[index] > 0) {
				nums[i] = nums[index];
				nums[index] = -1;
			} else {
				nums[index] -= 1;
				nums[i] = 0;
				i++;
			}
		}
		for (int j = 0; j < nums.length; j++) {
			nums[j] = Math.abs(nums[j]);
		}
		return nums;
	}

	public static void main(String[] args) {
		System.out.println(Arrays.toString(times(new int[] { 2, 1, 3, 1 })));
	}
}