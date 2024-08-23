package com.algo;


/***
 * 
 * 整数开平方根，并保留指定的小数，利用二分法近逼实现。
 * 
 */
public class SqrtExample {

	public static double sqrt(int n, int precision) {
		double l = 0, h = n, m = 0.0;
		double threshold = Math.pow(10, -precision);
		while (Math.abs(m * m - n) > threshold) {
			m = l + (h - l) / 2;
			if (m * m > n) {
				h = m;
			} else {
				l = m;
			}
		}
		return m;
	}
	
	public static void main(String[] args) {
		System.out.println(sqrt(6, 10));
		System.out.println(Math.sqrt(6));
	}
}
