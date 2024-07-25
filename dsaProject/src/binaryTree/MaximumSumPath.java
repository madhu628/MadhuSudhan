package binaryTree;

public class MaximumSumPath {
	
	public static void main(String[] args) {
		// Creating a sample binary tree
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.left.right.right = new Node(6);
        root.left.right.right.right = new Node(7);

        // Creating an instance of the Solution class
        MaximumSumPath solution = new MaximumSumPath();

        // Finding and printing the maximum path sum
        int maxPathSum = solution.maxPathSum(root);
        System.out.println("Maximum Path Sum: " + maxPathSum);
	}
	
	
	// Recursive function to find the maximum path sum
    // for a given subtree rooted at 'root'
    // The variable 'maxi' is a reference parameter
    // updated to store the maximum path sum encountered
    int findMaxPathSum(Node root, int[] maxi) {
        // Base case: If the current node is null, return 0
        if (root == null) {
            return 0;
        }

        // Calculate the maximum path sum
        // for the left and right subtrees
        int leftMaxPath = Math.max(0, findMaxPathSum(root.left, maxi));
        int rightMaxPath = Math.max(0, findMaxPathSum(root.right, maxi));

        // Update the overall maximum
        // path sum including the current node
        maxi[0] = Math.max(maxi[0], leftMaxPath + rightMaxPath + root.data);

        // Return the maximum sum considering
        // only one branch (either left or right)
        // along with the current node
        return Math.max(leftMaxPath, rightMaxPath) + root.data;
    }

    // Function to find the maximum
    // path sum for the entire binary tree
    int maxPathSum(Node root) {
        // Initialize maxi to the
        // minimum possible integer value
        int[] maxi = {Integer.MIN_VALUE};

        // Call the recursive function to
        // find the maximum path sum
        findMaxPathSum(root, maxi);

        // Return the final maximum path sum
        return maxi[0];
    }

}
