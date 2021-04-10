package learn.graph;

import java.util.*;

public class Graph {

	private List<List<Node>> adjacenyList = new ArrayList<>();

	public Graph(List<Edge> edges) {
		for (int i = 0; i < edges.size(); i++)
			adjacenyList.add(i, new ArrayList<>());
		for (Edge e : edges)
			adjacenyList.get(e.src).add(new Node(e.dest, e.weight));
	}

	public void print() {
		int start = 0;
		int size = this.adjacenyList.size();
		while (start < size) {
			System.out.println("--------------------------");
			for (Node node : this.adjacenyList.get(start)) {
				System.out.print("vertex: " + start + " " + "edge: " + node.value + "," + node.weight);
			}
			System.out.println();
			start++;
		}
	}

}
