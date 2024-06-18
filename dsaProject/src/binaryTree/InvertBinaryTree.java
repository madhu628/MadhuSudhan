package binaryTree;

import java.util.LinkedList;
import java.util.Queue;

public class InvertBinaryTree {
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
		// Create binary tree: [4,2,7,1,3,6,9]
		TreeNode root = new TreeNode(4);
		root.left = new TreeNode(2);
		root.right = new TreeNode(7);
		root.left.left = new TreeNode(1);
		root.left.right = new TreeNode(3);
		root.right.left = new TreeNode(6);
		root.right.right = new TreeNode(9);

		TreeNode invertedRoot = invertTree(root);

		System.out.println("Inverted Tree: ");
		printTree(invertedRoot); // Expected output: [4,7,2,9,6,3,1]
	}

	private static void printTree(TreeNode root) {
		if (root == null)
			return;

		Queue<TreeNode> queue = new LinkedList<>();
		queue.add(root);

		while (!queue.isEmpty()) {
			TreeNode node = queue.poll();
			System.out.print(node.val + " ");

			if (node.left != null)
				queue.add(node.left);
			if (node.right != null)
				queue.add(node.right);
		}

		System.out.println();
	}

	// Method to invert a binary tree recursively
	private static TreeNode invertTree(TreeNode root) {
		if (root == null) {
			return null; // Base case: if the tree is empty
		}

		// Swap the left and right subtrees
		TreeNode temp = root.left;
		root.left = root.right;
		root.right = temp;

		// Recursively invert the left and right subtrees
		invertTree(root.left);
		invertTree(root.right);

		return root;
	}

	// Method to invert a binary tree iteratively
//	private static TreeNode invertTree(TreeNode root) {
//		if (root == null) // Base case: if the tree is empty
//			return null;
//
//		Queue<TreeNode> queue = new LinkedList<>();
//		queue.add(root);
//
//		while (!queue.isEmpty()) {
//			TreeNode current = queue.poll();
//
//			// Swap the left and right children
//			TreeNode temp = current.left;
//			current.left = current.right;
//			current.right = temp;
//
//			// Add children to the queue
//			if (current.left != null)
//				queue.add(current.left);
//
//			if (current.right != null)
//				queue.add(current.right);
//
//		}
//
//		return root;
//	}
}
