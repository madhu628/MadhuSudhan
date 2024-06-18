package linkedList;

public class LinkedListCycle {

	static class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
			next = null;
		}
	}

	public static void main(String[] args) {
		// Create linked list: 3 -> 2 -> 0 -> -4 -> (points to 2)
		ListNode head = new ListNode(3);
		head.next = new ListNode(2);
		head.next.next = new ListNode(0);
		head.next.next.next = new ListNode(-4);
		head.next.next.next.next = head.next; // Creates a cycle at node 2

		boolean hasCycle = hasCycle(head);
		System.out.println("Does the list have a cycle? " + hasCycle);

		ListNode cycleStart = detectCycle(head);
		if (cycleStart != null) {
			System.out.println("The cycle starts at node with value: " + cycleStart.val);
		} else {
			System.out.println("No cycle detected.");
		}
	}

	// Method to find the node where the cycle begins
	private static ListNode detectCycle(ListNode head) {
		if (head == null || head.next == null)
			return null;

		ListNode slow = head;
		ListNode fast = head;
		boolean hasCycle = false;

		// First part: Detect if there is a cycle
		while (fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;

			if (slow == fast) {
				hasCycle = true;
				break;
			}
		}

		// No cycle found
		if (!hasCycle)
			return null;

		// Second part: Find the entry point of the cycle
		slow = head; //if a cycle is detected, slow is reset to head
		while (slow != fast) {
			slow = slow.next;
			fast = fast.next;
		}

		return slow; // Start of the cycle
	}

	// Method to detect if there is a cycle in the list
	private static boolean hasCycle(ListNode head) {
		if (head == null && head.next == null)
			return false;

		ListNode slow = head;
		ListNode fast = head;

		while (fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
			if (slow == fast)
				return true;// Cycle detected
		}

		return false;// No cycle// fast or fast.next becomes null,
	}

}

//Time Complexity: O(n), where n is the number of nodes in the list.
//Space Complexity: O(1), since no extra space is used apart from pointers.




