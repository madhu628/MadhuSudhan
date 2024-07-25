package binarySearchTree;

public class MinimumAbsoluteDifferenceInBST {

	static class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			val = x;
		}
	}

	public static void main(String[] args) {

		MinimumAbsoluteDifferenceInBST solution = new MinimumAbsoluteDifferenceInBST();

		TreeNode root1 = new TreeNode(4);
		root1.left = new TreeNode(2);
		root1.right = new TreeNode(6);
		root1.left.left = new TreeNode(1);
		root1.left.right = new TreeNode(3);

		System.out.println(solution.getMinimumDifference(root1)); // Output: 1

	}

	private Integer prev;
	private int minDiff;

	public int getMinimumDifference(TreeNode root) {

		prev = null;
		minDiff = Integer.MAX_VALUE;
		inOrderTraversal(root);
		return minDiff;

	}

	private void inOrderTraversal(TreeNode node) {
		if (node == null) {
			return;
		}

		// Traverse left subtree
		inOrderTraversal(node.left);

		// Process current node
		if (prev != null) {
			minDiff = Math.min(minDiff, node.val - prev);
		}
		prev = node.val;

		// Traverse right subtree
		inOrderTraversal(node.right);
	}

}
