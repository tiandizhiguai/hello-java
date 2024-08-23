package com.algo;

public class ListNode {

	public int val;

	public ListNode next;

	public ListNode(int val) {
		this.val = val;
	}

	//翻转链表：当我们在反转一个节点的时候，把一个节点的后驱改为指向它前驱就可以了。
	public static ListNode reverse(ListNode head) {
		ListNode pre = null;
		ListNode next = null;
		while(head != null) {
			next = head.next;
			head.next = pre;
			pre = head;
			head = next;
		}
		return pre;
	}
	
	//创建链表
	public static ListNode createList(int num) {
		ListNode node = new ListNode(1);
		ListNode head = node;
		for(int i = 2; i <= num; i++) {
			node.next = new ListNode(i);
			node = node.next;
		}
		
		return head;
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("[").append(val).append(", ");
		ListNode newNext = next;
		while (newNext != null) {
			sb.append(newNext.val).append(", ");
			newNext = newNext.next;
		}
		sb.append("]");
		return sb.toString();
	}

	public static void main(String[] args) {
		ListNode head = new ListNode(1);
		ListNode node2 = new ListNode(2);
		ListNode node3 = new ListNode(3);
		ListNode node4 = new ListNode(4);
		ListNode node5 = new ListNode(5);
		head.next = node2;
		node2.next = node3;
		node3.next = node4;
		node4.next = node5;
		System.out.println(reverse(head));
	}
}
