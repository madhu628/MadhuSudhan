package graphs;

import java.util.ArrayList;

public class DFS {

	public static void main(String args[]) {
		// Create a graph with 5 vertices
		ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
		for (int i = 0; i < 5; i++) {
			adj.add(new ArrayList<>());
		}

		// Add edges to the graph
		adj.get(0).add(2);
		adj.get(2).add(0);
		adj.get(0).add(1);
		adj.get(1).add(0);
		adj.get(0).add(3);
		adj.get(3).add(0);
		adj.get(2).add(4);
		adj.get(4).add(2);

		// Perform DFS starting from vertex 0
		DFS sl = new DFS();
		ArrayList<Integer> ans = sl.dfsOfGraph(5, adj);

		// Print the DFS traversal result
		for (int i : ans) {
			System.out.print(i + " ");
		}
	}

	// Recursive DFS function
	public static void dfs(int node, boolean vis[], ArrayList<ArrayList<Integer>> adj, ArrayList<Integer> ls) {
		vis[node] = true; // Mark the current node as visited
		ls.add(node); // Add the node to the DFS traversal list

		// Traverse all adjacent nodes
		for (Integer it : adj.get(node)) {
			if (!vis[it]) { // If the adjacent node hasn't been visited
				dfs(it, vis, adj, ls); // Recursively visit the node
			}
		}
	}

	// Function to return a list containing the DFS traversal of the graph
	public ArrayList<Integer> dfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
		boolean vis[] = new boolean[V + 1]; // Boolean array to keep track of visited vertices
		ArrayList<Integer> ls = new ArrayList<>(); // List to store the DFS traversal
		dfs(0, vis, adj, ls); // Start DFS from vertex 0
		return ls; // Return the DFS traversal list
	}

}
