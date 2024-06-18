package linkedList;

public class MergeTwoSortedLists {
	static class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
			next = null;
		}
	}

	public static void main(String[] args) {
		// Create first sorted linked list: 1 -> 2 -> 4
		ListNode list1 = new ListNode(1);
		list1.next = new ListNode(2);
		list1.next.next = new ListNode(4);

		// Create second sorted linked list: 1 -> 3 -> 4
		ListNode list2 = new ListNode(1);
		list2.next = new ListNode(3);
		list2.next.next = new ListNode(4);

		ListNode mergedList = mergeTwoLists(list1, list2);

		printList(mergedList); // Expected output: 1 -> 1 -> 2 -> 3 -> 4 -> 4
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

	// Method to merge two sorted linked lists
	private static ListNode mergeTwoLists(ListNode list1, ListNode list2) {

		 // Create a dummy node to serve as the starting point
		ListNode dummy = new ListNode(-1);
		ListNode current = dummy;

		// Traverse both lists and append the smaller node to the merged list
		//and move  corresponding pointer.
		while (list1 != null && list2 != null) {
			if (list1.val <= list2.val) {
				current.next = list1;
				list1 = list1.next;
			} else {
				current.next = list2;
				list2 = list2.next;

			}
			current = current.next;
		}

		// After one of the lists is exhausted, Append any remaining nodes from either list
		if (list1 != null) {
			current.next = list1;
		} else if (list2 != null) {
			current.next = list2;
		}

		// The merged list is next to the dummy node
		//The merged list starts from the node next to the dummy node
		return dummy.next;
	}

}

//Time Complexity: O(n + m), where n and m are the lengths of the two lists.
//Space Complexity: O(1) additional space, apart from the space used for the input lists.


