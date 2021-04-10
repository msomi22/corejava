/**
 * 
 */
package learn.tree;

/**
 * 
 *
 */
public class Node {
	
	int data;
	Node left;
	Node right;

	/**
	 * 
	 */
	public Node() {
		
	}
	
	public Node(int data) {
		this.data = data;
		this.left = this.right = null;
	}

	@Override
	public String toString() {
		return "Node [data=" + data + ", left=" + left + ", right=" + right + "]";
	}
	
	
}
