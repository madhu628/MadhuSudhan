package binarySearchTree;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class TreeNode {
	// Value of the node
	int val;

	// Pointer to the left child node
	TreeNode left;

	// Pointer to the right child node
	TreeNode right;

	// Constructor to initialize the node with a
	// value and set left and right pointers to null
	TreeNode(int x) {
		val = x;
		left = null;
		right = null;
	}
}

public class Kthlargestsmallestelement {

	public static void main(String[] args) {
		// Creating a BST
		TreeNode root = new TreeNode(10);
		root.left = new TreeNode(5);
		root.right = new TreeNode(13);
		root.left.left = new TreeNode(3);
		root.left.left.left = new TreeNode(2);
		root.left.left.right = new TreeNode(4);
		root.left.right = new TreeNode(6);
		root.left.right.right = new TreeNode(9);
		root.right.left = new TreeNode(11);
		root.right.right = new TreeNode(14);

		System.out.println("Binary Search Tree: ");
		printInOrder(root);
		System.out.println();

		Kthlargestsmallestelement solution = new Kthlargestsmallestelement();

		// Find the Kth smallest and largest elements
		int k = 3;
		System.out.println("k: " + k);
		List kthElements = solution.findKth(root, k);

		System.out.println("Kth smallest element: " + kthElements.get(0));
		System.out.println("Kth largest element: " + kthElements.get(1));
	}

	// Inorder traversal to populate
	// the vector with BST elements
	private void inorder(TreeNode node, List arr) {
		if (node == null) {
			return;
		}
		// Recursive call to the left subtree
		inorder(node.left, arr);

		// Push the value of current
		// node into the vector
		arr.add(node.val);

		// Recursive call to the right subtree
		inorder(node.right, arr);
		return;
	}

	// Function to find the Kth
	// smallest and largest elements in BST
	public List findKth(TreeNode node, int k) {
		// List to store the
		// elements of the BST
		List arr = new ArrayList<>();

		// Perform inorder traversal
		// to populate the vector
		inorder(node, arr);

		// Calculate Kth largest
		// and smallest elements
		int kLargest = (int) arr.get(arr.size() - k);
		int kSmallest = (int) arr.get(k - 1);

		// Returning a list containing
		// Kth smallest and largest elements
		return Arrays.asList(kSmallest, kLargest);
	}

	// Function to perform an in-order traversal
	// of a binary tree and print its nodes
	private static void printInOrder(TreeNode root) {
		// Check if the current node
		// is null (base case for recursion)
		if (root == null) {
			// If null, return and
			// terminate the function
			return;
		}

		// Recursively call printInOrder
		// for the left subtree
		printInOrder(root.left);

		// Print the value of the current node
		System.out.print(root.val + " ");

		// Recursively call printInOrder
		// for the right subtree
		printInOrder(root.right);
	}

}
