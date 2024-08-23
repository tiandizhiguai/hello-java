package com.algo.ali;

/**
 * 一对兔子生小兔子，从第三个月开始每个月会生一对，兔子第十个月的时候会死亡。问N个月有多少对兔子。
 */
public class RabbitCount {

	public static int calSquirrelSize(int month) {
		int[] dp = new int[month + 1];
		dp[1] = 1;
		dp[2] = 1;
		
		for(int i = 3; i <= month; i++) {
			dp[i] = dp[i - 1] + dp[i - 2];
		}
		
		for(int i = 0; i <= month; i++) {
			if(i >= 10) {
				dp[i] = dp[i] - ((i - 8) / 2);
			}
		}
		
		return dp[month];
	}
	
	
	public static void main(String[] args) {
		for(int i = 3; i < 20; i++) {
			System.out.print(calSquirrelSize(i) + ",");
		}
	}
}
