package binaryTree;

import java.util.LinkedList;
import java.util.Queue;

public class SameTree {

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
		// Create first tree: [1,2,3]
		TreeNode p = new TreeNode(1);
		p.left = new TreeNode(2);
		p.right = new TreeNode(3);

		// Create second tree: [1,2,3]
		TreeNode q = new TreeNode(1);
		q.left = new TreeNode(2);
		q.right = new TreeNode(3);

		boolean result = isSameTree(p, q);
		System.out.println("Are the two trees the same? " + result); // Expected output: true
	}

	// Method to check if two binary trees are the same
//	private static boolean isSameTree(TreeNode p, TreeNode q) {
//		// Both nodes are null, trees are the same
//		if (p == null && q == null)
//			return true;
//		// One of the nodes is null, trees are not the same
//		if (p == null || q == null)
//			return false;
//
//		// Values of current nodes are different, trees are not the same
//		if (p.val != q.val)
//			return false;
//
//		// Recursively check left and right subtrees to ensure they are identical.
//		return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
//	}

	// Method to check if two binary trees are the same iteratively
	private static boolean isSameTree(TreeNode p, TreeNode q) {

		// Use a queue to store nodes to compare
		Queue<TreeNode> queue = new LinkedList<>();
		queue.add(p);
		queue.add(q);

		while (!queue.isEmpty()) {
			TreeNode node1 = queue.poll();
			TreeNode node2 = queue.poll();

			 // If both are null, continue
			if (node1 == null && node2 == null)
				continue;

			 // If one is null or values are different, return false
			if (node1 == null || node2 == null || node1.val != node2.val)
				return false;

			// Add children to queue
			queue.add(node1.left);
			queue.add(node2.left);
			queue.add(node1.right);
			queue.add(node2.right);
		}

		return true;
	}

}

//Time Complexity: O(n), where n is the number of nodes in the smaller tree, as each node is compared once.
//Space Complexity: O(h) for the call stack, where h is the height of the tree. In the worst case, the space complexity is O(n) for a completely unbalanced tree.
