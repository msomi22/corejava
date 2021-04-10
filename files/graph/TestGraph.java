package learn.graph;

import java.util.*;

public class TestGraph {

	public TestGraph() {

	}

	public static void main(String[] args) {

		List<Edge> edges = new ArrayList<>();
		edges.add(new Edge(0, 11, 20));
		edges.add(new Edge(1, 10, 22));
		edges.add(new Edge(2, 10, 20));
		edges.add(new Edge(3, 15, 10));
		edges.add(new Edge(4, 20, 15));
		
		Graph g = new Graph(edges);
		//g.print();
		
		Graph2 g2 = new Graph2(5);
		g2.addEdge(0, 1);
		g2.addEdge(0, 2);
		g2.addEdge(0, 3);
		g2.addEdge(1, 2);
		g2.addEdge(2, 4);
		g2.mydfs(0); //===0 1 2 4 3 
		//g2.bfs(0); //===0 1 2 3 4 
		
		
		
	}

}
