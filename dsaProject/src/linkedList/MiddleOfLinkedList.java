package linkedList;

//Definition for singly-linked list.

public class MiddleOfLinkedList {
	static class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
			next = null;
		}
	}

	public static void main(String[] args) {
		// Create linked list: 1 -> 2 -> 3 -> 4 -> 5
		ListNode head = new ListNode(1);
		head.next = new ListNode(2);
		head.next.next = new ListNode(3);
		head.next.next.next = new ListNode(4);
		head.next.next.next.next = new ListNode(5);

		// Find and print the middle node
		ListNode middle = middleNode(head);

		printList(middle);
	}

	  // Method to find the middle of the linked list
	private static ListNode middleNode(ListNode head) {

		// base condition
		if (head == null)
			return null;
		// Initialize slow and fast pointers to the head of the list
		ListNode slow = head;
		ListNode fast = head;

		// Move fast pointer by 2 steps and slow pointer by 1 step
		while (fast != null && fast.next != null) { // (fast == null || fast.next == null) null pointer exception
			slow = slow.next;
			fast = fast.next.next;
		}
		// When fast pointer reaches the end, slow pointer is at the middle
		return slow;
	}

	// Helper method to print the linked list from a given node
	private static void printList(ListNode head) {

		ListNode curr = head;
		while (curr != null) {
			System.out.print(curr.val + " ");
			curr = curr.next;
		}
		System.out.println();
	}

}
