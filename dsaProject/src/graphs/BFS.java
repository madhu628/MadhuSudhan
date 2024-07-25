package graphs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BFS {

	public static void main(String[] args) {
		// Create a graph with 5 vertices
		ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
		for (int i = 0; i < 5; i++) {
			adj.add(new ArrayList<>());
		}
		// Add edges to the graph
		adj.get(0).add(1);
		adj.get(1).add(0);
		adj.get(0).add(4);
		adj.get(4).add(0);
		adj.get(1).add(2);
		adj.get(2).add(1);
		adj.get(1).add(3);
		adj.get(3).add(1);

		BFS sl = new BFS();
		ArrayList<Integer> ans = sl.bfsOfGraph(5, adj);
		// Print the BFS traversal result
		for (int i : ans) {
			System.out.print(i + " ");
		}
//		int n = ans.size();
//		for (int i = 0; i < n; i++) {
//			System.out.print(ans.get(i) + " ");
//		}

	}

	// Function to return Breadth First Traversal of the given graph.
	public ArrayList<Integer> bfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
		ArrayList<Integer> bfs = new ArrayList<>(); // List to store BFS traversal
		boolean[] vis = new boolean[V]; // Visited array to keep track of visited nodes
		Queue<Integer> q = new LinkedList<>(); // Queue for BFS

		q.add(0); // Start BFS from vertex 0
		vis[0] = true; // Mark vertex 0 as visited

		while (!q.isEmpty()) {
			Integer node = q.poll(); // Dequeue a vertex
			bfs.add(node); // Add it to the BFS result list

			// Traverse all adjacent vertices of the dequeued vertex
			for (Integer it : adj.get(node)) {
				if (!vis[it]) { // If the adjacent vertex hasn't been visited
					vis[it] = true; // Mark it as visited
					q.add(it); // Enqueue it
				}
			}
		}

		return bfs; // Return the BFS traversal result
	}

}
