package com.algo;

import java.util.Deque;
import java.util.LinkedList;

/**
 * 
 * 找出所有树及子树的路径
 * 
 * @version V1.0
 * @Date 2020年6月30日 下午7:19:55
 * @since JDK 1.8
 */
public class FindAllPathExample {

	static class TreeNode {

		TreeNode left;

		TreeNode right;

		String val;

		TreeNode(String val) {
			this.val = val;
		}
	}

	static void doTraverse(TreeNode node, Deque<String> path) {
		path.addLast(node.val);

		if (node.left == null && node.right == null) {
			System.out.println(path);
			return;
		}

		if (node.left != null) {
			doTraverse(node.left, path);
			path.removeLast();
		}

		if (node.right != null) {
			doTraverse(node.right, path);
			path.removeLast();
		}
	}

	static void traverse(TreeNode node) {
		if (node == null) {
			return;
		}

		Deque<String> path = new LinkedList<String>();
		doTraverse(node, path);

		traverse(node.left);
		traverse(node.right);
	}

	public static void main(String[] args) {
		TreeNode root = new TreeNode("1");
		TreeNode node2 = new TreeNode("2");
		TreeNode node3 = new TreeNode("3");
		TreeNode node4 = new TreeNode("4");
		TreeNode node5 = new TreeNode("5");
		TreeNode node6 = new TreeNode("6");
		TreeNode node7 = new TreeNode("7");

		root.left = node2;
		root.right = node3;
		node2.left = node4;
		node2.right = node5;
		node3.left = node6;
		node3.right = node7;

		traverse(root);
	}

}