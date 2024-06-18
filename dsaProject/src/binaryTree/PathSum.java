package binaryTree;

import java.util.Stack;

public class PathSum {

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
		// Create binary tree: [5,4,8,11,null,13,4,7,2,null,null,null,1]
		TreeNode root = new TreeNode(5);
		root.left = new TreeNode(4);
		root.right = new TreeNode(8);
		root.left.left = new TreeNode(11);
		root.left.left.left = new TreeNode(7);
		root.left.left.right = new TreeNode(2);
		root.right.left = new TreeNode(13);
		root.right.right = new TreeNode(4);
		root.right.right.right = new TreeNode(1);

		int targetSum = 22;
		boolean hasPath = hasPathSum(root, targetSum);
		System.out.println("Does the tree have a path sum equal to " + targetSum + "? " + hasPath); // Expected output:
																									// true
	}

	// Method to check if there is a root-to-leaf path with a given sum
//    public static boolean hasPathSum(TreeNode root, int sum) {
//        if (root == null) {
//            return false; // Base case: empty tree
//        }
//
//        // Check if we are at a leaf node and the path sum equals the target sum
	      // If both left and right children are null, check if the sum equals the node's
	      // value.
//        if (root.left == null && root.right == null) {
//            return sum == root.val;
//        }
//
//        // Recursively check the left and right subtrees with the updated sum
//        return hasPathSum(root.left, sum - root.val) || hasPathSum(root.right, sum - root.val);
//    }

	// Method to check if there is a root-to-leaf path with a given sum iteratively
	public static boolean hasPathSum(TreeNode root, int sum) {
		if (root == null)
			return false;

		Stack<TreeNode> nodeStack = new Stack<>();
		Stack<Integer> sumStack = new Stack<>();

		nodeStack.push(root);
		sumStack.push(sum - root.val);

		while (!nodeStack.isEmpty()) {  //Iterates over nodes using a stack.
			TreeNode node = nodeStack.pop();
			int currentSum = sumStack.pop();//Pops a node and its current sum from the stacks.

			if (node.left == null && node.right == null && currentSum == 0) { //Checks if it's a leaf node and if the current sum is zero.
				return true; // Found a path with the required sum
			}

			//Pushes child nodes and updated sums to the stacks.
			if (node.left != null) {
				nodeStack.push(node.left);
				sumStack.push(currentSum - node.left.val);
			}

			if (node.right != null) {
				nodeStack.push(node.right);
				sumStack.push(currentSum - node.right.val);
			}
		}

		return false;
	}

}


//Time Complexity: O(n), where n is the number of nodes in the tree, as each node is visited once.
//Space Complexity:
//Recursive: O(h) for the call stack, where h is the height of the tree.
//Iterative: O(n) in the worst case for the stacks used during traversal.













