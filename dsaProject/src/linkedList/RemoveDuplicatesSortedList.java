package linkedList;

public class RemoveDuplicatesSortedList {
	static class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
			next = null;
		}
	}

	public static void main(String[] args) {
		// Create linked list: 1 -> 1 -> 2 -> 3 -> 3
		ListNode head = new ListNode(1);
		head.next = new ListNode(1);
		head.next.next = new ListNode(2);
		head.next.next.next = new ListNode(3);
		head.next.next.next.next = new ListNode(3);

		System.out.print("Original list: ");
		printList(head);

		ListNode newHead = deleteDuplicates(head);

		System.out.print("List after removing duplicates: ");
		printList(newHead);
	}

	// Helper method to print the linked list from a given node
	private static void printList(ListNode head) {
		ListNode current = head;
		while (current != null) {
			System.out.print(current.val + " ");
			current = current.next;
		}
		System.out.println();
	}

	// Method to remove duplicates from a sorted list
	private static ListNode deleteDuplicates(ListNode head) {

		if (head == null)
			return null;

		ListNode current = head;

		while (current != null && current.next != null) {
			if (current.val == current.next.val) {
				// Skip the next node since it is a duplicate
				current.next = current.next.next;
			} else {
				// Move to the next distinct node
				current = current.next;
			}
		}
		// Returns the modified list starting from the head node.
		return head;
	}
}


//Performance: This solution runs in O(n) time complexity where n is the number of nodes in the list, and O(1) space complexity 
//since no additional space is used apart from a few pointers.


