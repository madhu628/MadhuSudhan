package binaryTree;

public class MaximumDepthBinaryTree {

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
		// Create binary tree: [3,9,20,null,null,15,7]
		TreeNode root = new TreeNode(3);
		root.left = new TreeNode(9);
		root.right = new TreeNode(20);
		root.right.left = new TreeNode(15);
		root.right.right = new TreeNode(7);

		int maxDepth = maxDepth(root);
		System.out.println("Maximum Depth of Binary Tree: " + maxDepth); // Expected output: 3
	}

	// Method to calculate the maximum depth of a binary tree
	private static int maxDepth(TreeNode root) {
		if (root == null) // Base case: if tree is empty, depth is 0
			return 0;

		// Calculate the depth of left and right subtrees by recursively calling
		int left = maxDepth(root.left);
		int right = maxDepth(root.right);

		// Return the maximum of the two depths plus one to account for the current node
		return Math.max(left, right) + 1;

	}

}

//Time Complexity: O(n), where n is the number of nodes in the tree, as each node is visited once.
//Space Complexity: O(h) for the call stack, where h is the height of the tree. 
//                   In the worst case (completely unbalanced tree), the space complexity is O(n).



