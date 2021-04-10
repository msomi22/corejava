/**
 * 
 */
package learn.tree;

/**
 * @author KEN19282
 *
 */
public class BinaryTree {

	public Node root;

	/**
	 * 
	 * @param data
	 */
	public void add(int data) {
		root = add(root, data);
	}

	/**
	 * 
	 * @param node
	 * @param data
	 * @return
	 */
	public Node add(Node node, int data) {
		if (node == null) {
			node = new Node(data);
			return node;
		} else {
			if (data < node.data) {
				node.left = add(node.left, data);
			} else if (data >= node.data) {
				node.right = add(node.right, data);
			}
			return node;
		}
	}

	/**
	 * 
	 */
	public void traverseInorder() {
		traverseInorder(root);
	}

	/**
	 * 
	 * @param root
	 */
	private void traverseInorder(Node root) {
		/**
		 * (a) Inorder (Left, Root, Right)
		 */
		if (root != null) {
			traverseInorder(root.left);
			System.out.println(root.data + " ");
			traverseInorder(root.right);
		}
	}

	/**
	 * 
	 */
	public void traversePreorder() {
		traversePreorder(root);
	}

	/**
	 * 
	 * @param root
	 */
	private void traversePreorder(Node root) {
		/**
		 * (b) Preorder (Root, Left, Right)
		 */
		if (root != null) {
			System.out.println(root.data + " ");
			traversePreorder(root.left);
			traversePreorder(root.right);
		}
	}

	/**
	 * 
	 */
	public void traversePostorder() {
		traversePostorder(root);
	}

	/**
	 * 
	 * @param root
	 */
	private void traversePostorder(Node root) {
		/**
		 * (c) Postorder (Left, Right, Root)
		 */
		if (root != null) {
			traversePostorder(root.left);
			traversePostorder(root.right);
			System.out.println(root.data + " ");
		}
	}
}
