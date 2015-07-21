package datastructure.tree;

public class BiTreeNode {
	BiTreeNode leftchild;
	BiTreeNodeData data;
	BiTreeNode rightchild;

	public BiTreeNode getLeftchild() {
		return leftchild;
	}
	public void setLeftchild(BiTreeNode leftchild) {
		this.leftchild = leftchild;
	}
	public BiTreeNodeData getData() {
		return data;
	}
	public void setData(BiTreeNodeData data) {
		this.data = data;
	}
	public BiTreeNode getRightchild() {
		return rightchild;
	}
	public void setRightchild(BiTreeNode rightchild) {
		this.rightchild = rightchild;
	}
}
