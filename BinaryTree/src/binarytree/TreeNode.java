package binarytree;

public class TreeNode<E extends Comparable<? super E>> {

	private E data;
	private TreeNode<E> leftChild;
	private TreeNode<E> rightChild;
	private boolean isDeleted = false;
	
	public TreeNode(E data) {
		this.data = data;
	}
	
	public E smallest() {
		if (this.leftChild == null) {
			return this.data;
		}
		
		return this.leftChild.smallest();
	}
	
	public E largest() {
		if (this.rightChild == null)
			return this.data;
		return this.rightChild.largest();
	}

	public TreeNode<E> find(E data) {
		if (this.data == data && !isDeleted) {
			return this;
		}

		int cmp = data.compareTo(this.data);

		if (cmp < 0 && leftChild != null)
			return leftChild.find(data);

		if (rightChild != null) {
			return rightChild.find(data);
		}

		return null;
	}

	public boolean insert(E data) {
		int cmp = data.compareTo(this.data);

		if (cmp > 0) {
			if (this.rightChild == null) {
				this.rightChild = new TreeNode<E>(data);
			} else {
				this.rightChild.insert(data);
			}
			return true;
		} else if (cmp < 0) {
			if (this.leftChild == null) {
				this.leftChild = new TreeNode<E>(data);
			} else {
				this.leftChild.insert(data);
			}
			return true;
		}

		return false;
	}

	public E getData() {
		return data;
	}

	public TreeNode<E> getLeftChild() {
		return leftChild;
	}

	public void setLeftChild(TreeNode<E> leftChild) {
		this.leftChild = leftChild;
	}

	public TreeNode<E> getRightChild() {
		return rightChild;
	}

	public void setRightChild(TreeNode<E> rightChild) {
		this.rightChild = rightChild;
	}
	
	public void delete() {
		this.isDeleted = true;
	}
	
	public boolean isDeleted() {
		return isDeleted;
	}

	@Override
	public String toString() {
		return "Data: " + data.toString();
	}
}
