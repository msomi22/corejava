/**
 * 
 */
package learn.tree;

/**
 * @author KEN19282
 *
 */
public class TestTree {

	/**
	 * 
	 */
	public TestTree() {
		
	}


	public static void main(String[] a) {
		BinaryTree bt = new BinaryTree();
		bt.add(100);
		bt.add(90);
		bt.add(80);
		bt.add(85);
		bt.add(70);
		bt.add(75);
		bt.add(100);
		bt.add(105);
		bt.add(200);
		bt.add(205);

		/**
		 * 100 90 105 80 85 200 70 75 205
		 * 
		 */
		
		bt.traverseInorder();
		//bt.traversePreorder();
		//bt.traversePostorder();

	}


}
