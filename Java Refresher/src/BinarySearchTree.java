/*
 * An implementation of a binary search tree.
 */
public class BinarySearchTree {

	public BinarySearchTree() {
		root = null;
	}

	public void insert(int n) {

	}
	
	public boolean find(int n) {
		return false;
	}
	
	public boolean delete(int n)
	{
		return false;
	}
	
	public void display(Node root) {

	}
	
	static Node root;
	
	public static void main(String[] args) {
		BinarySearchTree bst = new BinarySearchTree();
		
	}
	
	public class Node {
		public Node(int data) {
			this.data = data;
			left = null;
			right = null;
		}
		
		int data;
		Node left;
		Node right;
	}

}
