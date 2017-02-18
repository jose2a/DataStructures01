package binarytree;

public class BinarySearchTree<E extends Comparable<? super E>> {

	private TreeNode<E> root;

	public boolean insert(E data) {
		if (root == null) {
			root = new TreeNode<>(data);
			return true;
		} else {

			return root.insert(data);
		}

		/*
		  TreeNode<E> newNode = new TreeNode<>(data);
		  
		  if (root == null) { root = newNode; return true; }
		  
		  TreeNode<E> current = root;
		  
		  int comp = data.compareTo(current.getData());
		  
		  while ((comp < 0 && current.getLeftChild() != null) || (comp > 0 &&
		  current.getRightChild() != null)) { if (comp < 0) { current =
		  current.getLeftChild(); } else if (comp > 0) { current =
		  current.getRightChild(); }
		  
		  comp = data.compareTo(current.getData()); }
		  
		  if (comp < 0) { current.setLeftChild(newNode); } else if (comp > 0) {
		  current.setRightChild(newNode); } else { return false; }
		  
		  return true;
		 */
	}
	
	public E smallest() {
		if (root != null) {
			return root.smallest();
		}
		return null;
	}
	
	public E largest() {
		if (root != null) {
			return root.largest();
		}
		
		return null;
	}

	public TreeNode<E> find(E data) {
		if (root != null)
			return root.find(data);

		return null;

	}
	
	public boolean delete(E data) {
		TreeNode<E> toDelete = find(data);
		toDelete.delete();
		
		return true;
	}
	
	/*
	public boolean delete(E data) {
		TreeNode<E> current = this.root;
		TreeNode<E> parent = this.root;
		boolean isLeftChild = false;
		
		if (current == null) {
			return false;
		}
		
		while(current != null && !current.getData().equals(data)) {
			parent = current;
			int cmp = data.compareTo(current.getData());
			
			if(cmp < 0) {
				current = current.getLeftChild();
				isLeftChild = true;
			} else {
				current = current.getRightChild();
				isLeftChild = false;
			}
		}
		
		if (current == null) {
			return false;
		}
		
		// Case 1: The node to delete is a leaf node
		
		if (current.getLeftChild() == null && current.getRightChild() == null) {
			if (current == root) {
				root = null;
			} else {
				if (isLeftChild)
					parent.setLeftChild(null);
				else
					parent.setRightChild(null);
			}
			
			return true;
		}
		
		// Case 2.  Node to be deleted has one child
		if (current.getRightChild() == null) {
			if (current == root) {
				root = current.getLeftChild();
			} else if (isLeftChild) {
				parent.setLeftChild(current.getLeftChild());
			} else {
				parent.setRightChild(current.getLeftChild());
			}
			return true;
		}
		
		if (current.getLeftChild() == null) {
			if (current == root) {
				root = current.getRightChild();
			} else if (isLeftChild) {
				parent.setLeftChild(current.getRightChild());
			} else {
				parent.setRightChild(current.getRightChild());
			}
			return true;
		}
		
		return false;
		
	}
	*/
	
	// ====================== TRAVERSALS ===========================
	
	public void inorder() {
		inorder(root);
	}
	
	/*
	 * 1. Traverse the left subtree.
	 * 2. Visit the root.
	 * 3. Traverse the right subtree.
	 */
	private void inorder(TreeNode<E> node) {
		if (node != null) {
			inorder(node.getLeftChild());
			System.out.println(node);
			inorder(node.getRightChild());
		}
	}
	
	public void preorder() {
		preorder(root);
	}
	
	/*
	 * 1. Visit the root.
	 * 2. Traverse the left subtree.
	 * 3. Traverse the right subtree.
	 */
	private void preorder(TreeNode<E> node) {
		if (node != null) {
			System.out.println(node);
			preorder(node.getLeftChild());
			preorder(node.getRightChild());
		}
		
	}

	public void postorder() {
		postorder(root);
	}
	
	/*
	 * 1. Traverse the left subtree.
	 * 2. Traverse the right subtree.
	 * 3. Visit the root.
	 */
	private void postorder(TreeNode<E> node) {
		if (node != null) {
			postorder(node.getLeftChild());
			postorder(node.getRightChild());
			System.out.println(node);
		}
	}
	
	private static int numberOfLeafNodes = 0;
	
	public int leafNodes() {
		numberOfLeafNodes = 0;
		
		leafNodes(root);
		
		return numberOfLeafNodes;
	}

	private void leafNodes(TreeNode<E> node) {
		if (node != null) {			
			leafNodes(node.getLeftChild());
			System.out.print(node + " ");
			leafNodes(node.getRightChild());
		}
		if (node != null && node.getLeftChild() == null && node.getRightChild() == null) {
			numberOfLeafNodes++;
		}
	}

}
