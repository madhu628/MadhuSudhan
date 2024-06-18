package binaryTree;

import java.util.LinkedList;
import java.util.Queue;

public class SymmetricTree {
	static class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			val = x;
			left = right = null;
		}
	}

	public static void main(String[] args) {
		// Create binary tree: [1,2,2,3,4,4,3]
		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(2);
		root.right = new TreeNode(2);
		root.left.left = new TreeNode(3);
		root.left.right = new TreeNode(4);
		root.right.left = new TreeNode(4);
		root.right.right = new TreeNode(3);

		boolean isSymmetric = isSymmetric(root);
		System.out.println("Is the tree symmetric? " + isSymmetric); // Expected output: true
	}

	// Method to check if a binary tree is symmetric
//	private static boolean isSymmetric(TreeNode root) {
//		if (root == null) {
//			return true; // A null tree is symmetric
//		}
//		return isMirror(root.left, root.right);//isMirror to compare the left and right subtrees.
//	}
//
//	// Helper method to check if two subtrees are mirrors of each other
//	private static boolean isMirror(TreeNode left, TreeNode right) {
//
//		if (left == null && right == null)
//			return true;
//		if (left == null || right == null)
//			return false;
//		if (left.val != right.val)
//			return false;
//
//		// Recursively check if left and right subtrees are mirrors
	// Checks if the left subtree of one node is a mirror of the right subtree of
	// the other and vice versa
//		return isMirror(left.left, right.right) && isMirror(left.right, right.left);
//	}

	// Method to check if a binary tree is symmetric iteratively
	public static boolean isSymmetric(TreeNode root) {
		if (root == null)
			return true;

		//Uses a queue to hold pairs of nodes for comparison.
		Queue<TreeNode> queue = new LinkedList<>();
		queue.add(root.left);
		queue.add(root.right);

		while (!queue.isEmpty()) {
			TreeNode left = queue.poll();
			TreeNode right = queue.poll();

			if (left == null && right == null)
				continue;
			if (left == null || right == null || left.val != right.val)
				return false;

			//Enqueues child nodes in the opposite order to compare mirror subtrees 
			queue.add(left.left);
			queue.add(right.right);
			queue.add(left.right);
			queue.add(right.left);
		}

		return true;
	}

}

//Time Complexity:
//O(n), where n is the number of nodes in the tree, as each node is visited once.
//Space Complexity:
//Recursive: O(h) for the call stack, where h is the height of the tree.
//Iterative: O(n) for the queue used during level-order traversal in the worst case.
