package datastructure.tree;

public class BiTree {

	BiTreeNode root = null;
	
	public BiTreeNode getRoot() {
		return root;
	}

	public void setRoot(BiTreeNode root) {
		this.root = root;
	}

	public BiTree() {
		
	}
	
	public BiTree (String init) {
		//Could use simple Factory to judge the create order(pre,in,post)
		root = preOrderCreateBiTree(init, root);
	}
	
    public void p(Object o) {
        System.out.println(o);
    } 

    public static BiTreeNode newNode(int data) {
		BiTreeNodeData d = new BiTreeNodeData(data);
		BiTreeNode t = new BiTreeNode();
		t.setData(d);
		t.setLeftchild(null);
		t.setRightchild(null);
		return t;
    }
    /* 
    Give a binary search tree and a number, inserts a new node 
    with the given number in the correct place in the tree. 
    Returns the new root pointer which the caller should 
    then use (the standard trick to avoid using reference 
    parameters). 
   */    
    public static BiTreeNode insert(BiTreeNode node, int data) {
    	if (null==node) {
    		return newNode(data);
    	} else {
    		if (data<=node.getData().getIdata()) {
    			node.setLeftchild(insert(node.getLeftchild(), data));
    		} else {
    			node.setRightchild(insert(node.getRightchild(), data));
    		}
    		// return the (unchanged) node pointer 
    		return node;
    	}
    }
    
	public BiTreeNode preOrderCreateBiTree (String init, BiTreeNode t) {
		if ("#".equalsIgnoreCase(init.substring(0,1))) {
			t=null;
		} else {
			BiTreeNodeData d = new BiTreeNodeData(init.substring(0,1));
			t = new BiTreeNode();
			t.setData(d);
			t.setLeftchild(preOrderCreateBiTree(init.substring(1), t.getLeftchild()));
			t.setRightchild(preOrderCreateBiTree(init.substring(1), t.getRightchild()));
		}
		return t;
	}
	
	public void preOrderTraverse (BiTreeNode node) {
		if (null != node) {
			if(null!=node.getData()) {
				node.getData().show();
			}
			preOrderTraverse(node.getLeftchild());
			preOrderTraverse(node.getRightchild());
		}
	}

	public static void inOrderTraverse (BiTreeNode node) {
		if (null != node) {
			inOrderTraverse(node.getLeftchild());
			if(null!=node.getData()) {
				node.getData().show();
			}
			inOrderTraverse(node.getRightchild());
		}
	}

	public void postOrderTraverse (BiTreeNode node) {
		if (null != node) {
			postOrderTraverse(node.getLeftchild());
			postOrderTraverse(node.getRightchild());
			if(null!=node.getData()) {
				node.getData().show();
			}
		}
	}

	public static void testInsert() {
		BiTreeNode root = newNode(2);
		root = insert(root, 1);
		root = insert(root, 3);
		BiTree.inOrderTraverse(root);
	}
	
	public static void testInOrderTraverse() {
		BiTreeNodeData a = new BiTreeNodeData("A");
		BiTreeNodeData b = new BiTreeNodeData("B");
		BiTreeNodeData c = new BiTreeNodeData("C");
		BiTreeNodeData d = new BiTreeNodeData("D");
		
		BiTreeNode A = new BiTreeNode();
		A.setData(a);
		BiTreeNode B = new BiTreeNode();
		B.setData(b);
		BiTreeNode C = new BiTreeNode();
		C.setData(c);
		BiTreeNode D = new BiTreeNode();
		D.setData(d);
		A.setLeftchild(B);
		A.setRightchild(C);
		B.setRightchild(D);
		
		BiTree.inOrderTraverse(A);
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BiTree bt = new BiTree("AB#D##C##");
		bt.inOrderTraverse(bt.getRoot());
		//testInOrderTraverse();
		//testInsert();
	}

}
