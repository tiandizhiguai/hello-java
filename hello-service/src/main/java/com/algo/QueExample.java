package com.algo;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class QueExample {

	private String[] lettersMap = { " ", "*", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };

	public List<String> letterCombinations(String digits) {
		if (digits == null || digits.length() == 0) {
			return new ArrayList<String>();
		}
		Queue<String> que = new ArrayDeque<>();
		que.offer("");
		for (char digit : digits.toCharArray()) {
			int queSize = que.size();
			for (int i = 0; i < queSize; i++) {
				String tmp = que.poll();
				String letters = lettersMap[digit - '0'];
				for (char letter : letters.toCharArray()) {
					que.offer(tmp + letter);
				}
			}
		}
		return new ArrayList<>(que);
	}
}