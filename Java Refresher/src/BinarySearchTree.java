/*
 * An implementation of a binary search tree.
 */
public class BinarySearchTree {

	public BinarySearchTree() {
		root = null;
	}

	public void insert(int n) {
		Node newNode = new Node(n);
		
		// If root is null, insert our new node as the root and exit.
		if (root == null) {
			root = newNode;
			return;
		}
		
		Node current = root, parent = null;		
		
		// Loop over nodes until current == null, indicating we found our spot to insert
		while (current != null) {
			if (n > current.data) {
				parent = current;
				current = current.right;
			} else if (n < current.data) {
				parent = current;
				current = current.left;
			}
		}
		
		// Check the parents data to ensure we insert on the correct side
		if (newNode.data > parent.data) {
			parent.right = newNode;
		} else if (newNode.data < parent.data) {
			parent.left = newNode;
		}
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
