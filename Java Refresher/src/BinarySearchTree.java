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
		
		// Check the parent's data to ensure we insert on the correct side
		if (newNode.data > parent.data) {
			parent.right = newNode;
		} else if (newNode.data < parent.data) {
			parent.left = newNode;
		}
	}
	
	public boolean find(int n) {
		Node current = root;
		
		while (current != null) {
			// If n is larger than current, go right
			if (n > current.data) {
				current = current.right;
			} 
			// If n is smaller than current, go left
			else if (n < current.data) {
				current = current.left;
			}
			// Else n equals current, we found it
			else return true;
		}
		
		// If we fell out of the loop, node isn't in tree
		return false;
	}
	
	public boolean delete(int n)
	{
		return false;
	}
	
	public void display(Node root) {
		if (root != null) {
			display(root.left);
			System.out.print(" " + root.data);
			display(root.right);
		}
	}
	
	static Node root;
	
	public static void main(String[] args) {
		BinarySearchTree bst = new BinarySearchTree();
		
		/*  Initial tree structure
		 *          8
		 *       /      \ 
		 *    2           17
		 *   / \         /  \ 
		 *  1   4      13    20
		 *       \    /     /  \
		 *        7  11   19    48
		 *                     /  \
		 *                   36    50
		 *                  /
		 *                26
		 *                  \
		 *                   31
		 *                  /
		 *                 27 
		 */
		bst.insert(8);
		bst.insert(2);
		bst.insert(4);
		bst.insert(17);
		bst.insert(20);
		bst.insert(48);
		bst.insert(7);
		bst.insert(19);
		bst.insert(13);
		bst.insert(36);
		bst.insert(26);
		bst.insert(11);
		bst.insert(50);
		bst.insert(1);
		bst.insert(31);
		bst.insert(27);
		
		System.out.println("Original tree:");
		bst.display(root);
		
		System.out.println("\nCheck if  4 is in tree: " + bst.find(4));
		System.out.println("Check if 31 is in tree: " + bst.find(31));
		System.out.println("Check if 47 is in tree: " + bst.find(47));
		System.out.println("Check if 13 is in tree: " + bst.find(13));
		System.out.println("Check if 51 is in tree: " + bst.find(51));
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
