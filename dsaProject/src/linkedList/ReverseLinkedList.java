package linkedList;

//define the ListNode class to represent each node in the linked list:
//Definition for singly-linked list.
class ListNode {
	int val;
	ListNode next;

	ListNode(int val) {
		this.val = val;
		this.next = null;
	}
}

public class ReverseLinkedList {

	public static void main(String[] args) {
		// Create the linked list [1, 2, 3, 4, 5]

		ListNode head = new ListNode(1);
		head.next = new ListNode(2);
		head.next.next = new ListNode(3);
		head.next.next.next = new ListNode(4);
		head.next.next.next.next = new ListNode(5);

		ListNode reversedHead = reverseList(head);

		// Print the reversed list
		printList(reversedHead);

		// Since the list is already reversed once, we create it again for recursion
		// test
		head = new ListNode(1);
		head.next = new ListNode(2);
		head.next.next = new ListNode(3);
		head.next.next.next = new ListNode(4);
		head.next.next.next.next = new ListNode(5);

		ListNode recursive = recursiveReverse(head);

		System.out.println("*******");
		printList(recursive);
	}

	// Recursive method to reverse a linked list
	private static ListNode recursiveReverse(ListNode head) {
		// Base case: if head is null or only one node, return head
		if (head == null || head.next == null) {
			return head;
		}
		// Reverse the rest of the list
		ListNode newHead = recursiveReverse(head.next);

		// Put the current node at the end of the reversed list
		// Reverse the current node's pointer
		head.next.next = head;
		head.next = null; //Set head.next to null to mark the new end of the list

		return newHead;
	}

	private static void printList(ListNode head) {
		ListNode current = head;
		while (current != null) {
			System.out.print(current.val + " ");
			current = current.next;

		}
		System.out.println();
	}

	// Iterative method to reverse a linked list
	private static ListNode reverseList(ListNode head) {

		// base condition
		if (head == null || head.next == null) {
			return head;
		}
		ListNode prev = null; // Initialize previous node as null
		ListNode current = head; // Start with the head node

		while (current != null) {
			ListNode nextNode = current.next; // Temporarily store the next node to remember the next node in the list.
			current.next = prev;// Reverse the current node's pointer of current to point to prev.
			prev = current;// Move prev and current one step forward
			current = nextNode;

		}
		return prev;// New head of the reversed list
	}
}
