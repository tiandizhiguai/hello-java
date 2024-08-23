package com.algo.ali;

import java.util.Stack;

/**
 * 金额转换，例如：12345.63 => 12,345.63
 */
public class AmountConvert {

	public static void main(String[] args) {
		System.out.println(convert(0.63d));
	}

	public static String convert(double amount) {
		String amountStr = String.valueOf(amount);
		if(amount < 1) {
			return amountStr;
		}
		
		String[] strs = amountStr.split("\\.");
		int length = strs[0].length();
		Stack<Character> stack = new Stack<>();
		for(int i = length - 1; i >= 0; i--) {
			stack.push(strs[0].charAt(i));
			if(i % 3 == 0 && i != 0) {
				stack.push(',');
			}
		}
		
		StringBuilder result = new StringBuilder();
		while(!stack.isEmpty()) {
			result.append(stack.pop());
		}
		if(strs.length == 2) {
			result.append(".")
				.append(strs[1]);
		}
		
		return result.toString();
	}
}