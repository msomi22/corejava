package learn.graph;

import java.util.Iterator;
import java.util.LinkedList;

//https://www.softwaretestinghelp.com/java-graph-tutorial/
public class Graph2 {
	
	
	/**DFS = 4 steps
	 * stack to store explored nodes and a list the visited ones.
	 * start with the root, mark as visited, add it to the visited list.
	 * consider all the adjacent nodes of the current node.
	 * push these onto the stack.
	 * 
	 * pop a node from stack, mark as visited, add to visited list.
	 * consider the adjacent of the current node, ignore the visited.
	 * pop a node from the stack, mark as visited. add adjacent nodes
	 * to the stack.
	 * 
	 * repeat until the stack is empty.
	 * 
	 * uses
	 * -detect a cycle in a graph
	 * -path finding
	 * -topological sorting
	 * 
	 * 
	 * BFS = 6 steps
	 * 
	 * uses a queue to store the nodes
	 * traverse level-wise
	 */

	int vertices;

	private LinkedList<Integer> adjacencyList[];

	public Graph2(int vertex) {
		this.vertices = vertex;
		adjacencyList = new LinkedList[vertex];
		for (int i = 0; i < vertex; i++) {
			adjacencyList[i] = new LinkedList<>();
		}
	}

	void addEdge(int vertex, int weight) {
		adjacencyList[vertex].add(weight);
	}

	void dfs(int vertex, boolean visited[]) {
		visited[vertex] = true;
		System.out.print(vertex + " ");
		Iterator<Integer> i = adjacencyList[vertex].listIterator();
		while (i.hasNext()) {
			int m = i.next();
			if (!visited[m])
				dfs(m, visited);
		}
	}
	
	void mydfs(int vertex) {
		boolean[] visted = new boolean[vertices];
		dfs(vertex, visted); 
	}
	
	
	/**
	 * BFS = 6 steps
	 * 
	 * uses a queue to store the nodes
	 * traverse level-wise
	 * 
	 * start with the root, insert it in the queue.
	 * remove root from queue and add it to the visited list
	 * add all adjacent nodes to the queue, repeat the above
	 * for each node.
	 */

	void bfs(int root) {
		boolean visited[] = new boolean[vertices];
		LinkedList<Integer> queue = new LinkedList<>();
		visited[root] = true;
		queue.add(root);
		while(queue.size() != 0) {
			root = queue.poll();
			System.out.print(root + " ");
			Iterator<Integer> i = adjacencyList[root].listIterator();
			while(i.hasNext()) {
				int m = i.next();
				if(!visited[m]) {
					visited[m] = true;
					queue.add(m);
				}
			}
		}
	}

}
