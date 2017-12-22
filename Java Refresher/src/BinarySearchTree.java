/*
 * An implementation of a binary search tree.
 */
public class BinarySearchTree {

	public BinarySearchTree() {
		root = null;
	}

	public void insert(int[] nums) {
		for (int n : nums) {
			insert(n);
		}
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
		Node current = root, parent = root;
		boolean isLeft = false;
		
		// Loop over the list of nodes until we can find n.
		// Keep up with whether or not it's on the right/left in order to adjust 
		// child nodes properly.
		while (n != current.data) {
			parent = current;
			
			if (n < current.data) {
				isLeft = true;
				current = current.left;
			} else {
				isLeft = false;
				current = current.right;
			}
			
			// Couldn't find the node so return false
			if (current == null) return false;
		}
		
		/* Found the node, now we need to delete.  There are 3 cases to handle:
		 * Case 1 - Node has no children
		 * Case 2 - Node has a single child
		 * Case 3 - Node has two children
		 */
		
		// Case 1 - Node has no children
		if (current.left == null && current.right == null) {
			if (current == root ) { 
				root = null;
			}
			
			if (isLeft) {
				parent.left = null;
			} else {
				parent.right = null;
			}
		}
		// Case 2 - Node has a single child on left
		else if (current.right == null) {
			if (current == root) {
				root = current.left;
			} else if (isLeft) {
				parent.left = current.left;
			} else {
				parent.right = current.left;
			}
		}
		// Case 2 - Node has a single child on the right
		else if (current.left == null) {
			if (current == root) {
				root = current.right;
			} else if (isLeft) {
				parent.left = current.right;
			} else {
				parent.right = current.right;
			}
		}
		// Case 3 - Node has two children
		else if (current.left != null && current.right != null) {
			Node replacement = getReplacement(current);
			
			if (current == root) {
				root = replacement;
			} else if (isLeft) {
				parent.left = replacement;
			} else {
				parent.right = replacement;
			}
			
			replacement.left = current.left;
		}
		return true;
	}
	
	/*
	 * This method is used to get a replacement for a node to be deleted that has two children
	 */
	public Node getReplacement(Node nodeToDelete) {
		Node replacement = null, replacementParent = null;
		Node current = nodeToDelete.right;
		
		while (current != null) {
			replacementParent = replacement;
			replacement = current;
			current = current.left;
		}
		
		if (replacement != nodeToDelete.right) {
			replacementParent.left = replacement.right;
			replacement.right = nodeToDelete.right;
		}
		
		return replacement;
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
		int[] list = {8, 2, 4, 17, 20, 48, 7, 19, 13, 36, 26, 11, 50, 1, 31, 27};
		bst.insert(list);
		
		System.out.println("Original tree:");
		bst.display(root);
		
		System.out.println("\nCheck if  4 is in tree: " + bst.find(4));
		System.out.println("Check if 31 is in tree: " + bst.find(31));
		System.out.println("Check if 47 is in tree: " + bst.find(47));
		System.out.println("Check if 13 is in tree: " + bst.find(13));
		System.out.println("Check if 51 is in tree: " + bst.find(51));
		
		/*  After deleting 7
		 *          8
		 *       /      \ 
		 *    2           17
		 *   / \         /  \ 
		 *  1   4      13    20
		 *            /     /  \
		 *           11   19    48
		 *                     /  \
		 *                   36    50
		 *                  /
		 *                26
		 *                  \
		 *                   31
		 *                  /
		 *                 27 
		 */
		System.out.println("Delete node with no children (7) : " + bst.delete(7));		
		bst.display(root);
		/*  After deleting 13
		 *          8
		 *       /      \ 
		 *    2           17
		 *   / \         /  \ 
		 *  1   4      11    20
		 *                  /  \
		 *                19    48
		 *                     /  \
		 *                   36    50
		 *                  /
		 *                26
		 *                  \
		 *                   31
		 *                  /
		 *                 27 
		 */
		System.out.println("\nDelete Node with one child (13) : " + bst.delete(13));		
		bst.display(root);
		/*  After deleting 48
		 *          8
		 *       /      \ 
		 *    2           17
		 *   / \         /  \ 
		 *  1   4      11    20
		 *                  /  \
		 *                19    50
		 *                     / 
		 *                   36    
		 *                  /
		 *                26
		 *                  \
		 *                   31
		 *                  /
		 *                 27 
		 */
		System.out.println("\nDelete Node with Two children (48) : " + bst.delete(48));		
		bst.display(root);
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
