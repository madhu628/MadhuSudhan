package divideConquer;

import java.util.LinkedList;
import java.util.Queue;

public class ConvertSortedArrayToBST {

//Definition for a binary tree node
	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			val = x;
		}
	}
	public static void main(String[] args) {

		ConvertSortedArrayToBST solution = new ConvertSortedArrayToBST();

		int[] nums = { -10, -3, 0, 5, 9 };

		TreeNode root = solution.sortedArrayToBST(nums);

		printTree(root);// This function can be used to verify the structure of the tree
	}

	// Helper function to print the tree in level order (for verification purposes)
	private static void printTree(TreeNode root) {
		if (root == null) {
			return;
		}

		Queue<TreeNode> queue = new LinkedList<>();
		queue.offer(root);

		while (!queue.isEmpty()) {
			TreeNode current = queue.poll();

			if (current != null) {
				System.out.print(current.val + " ");
				queue.offer(current.left);
				queue.offer(current.right);
			} else {
				System.out.print("null ");
			}
		}

	}
	private TreeNode sortedArrayToBST(int[] nums) {

		if (nums == null || nums.length == 0) {
			return null;
		}
		return helper(nums, 0, nums.length - 1);
	}

	// The helper function constructs the BST recursively.
	private TreeNode helper(int[] nums, int left, int right) {

		if (left > right) {
			return null;
		}

		int mid = left + (right - left) / 2;
		TreeNode node = new TreeNode(mid);

		// It recursively constructs the left and right subtrees using the left
		// and right halves of the array, respectively
		node.left = helper(nums, left, mid - 1);
		node.right = helper(nums, mid + 1, right);

		return node;
	}
}
//Time Complexity: 
//o(n) is the number of elements in the array. Each element is processed once to construct the BST.
//Space Complexity: 
//O(logn) for the recursive stack in the case of a balanced tree. In the worst case, it could be 
//O(n) if the tree is completely unbalanced (though this shouldn't happen with this algorithm given the sorted array).
//

