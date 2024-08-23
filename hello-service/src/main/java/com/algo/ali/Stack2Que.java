package com.algo.ali;

import java.util.Stack;

/**
 * 用栈实现队列的功能。
 */
public class Stack2Que<T> {

	private Stack<T> stack1;
	private Stack<T> stack2;

	public Stack2Que() {
		stack1 = new Stack<>();
		stack2 = new Stack<>();
	}

	public void push(T x) {
		if (stack2.empty()) {
			stack2.push(x);
		} else {
			while (!stack2.empty()) {
				stack1.push(stack2.pop());
			}
			stack2.push(x);
			while (!stack1.empty()) {
				stack2.push(stack1.pop());
			}
		}
	}

	public T pop() {
		return stack2.pop();
	}

	public T peek() {
		return stack2.peek();
	}

	public boolean empty() {
		return stack2.empty();
	}
}
