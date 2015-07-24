package interview.algorithm;

import java.util.Iterator;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Vector;

public class BSTree<T extends Comparable> {

	Node<T> root;
	private int treeMaxDistance = 0;
	
	private boolean found = false;
	private Node<T> foundNode = null;

	public Node<T> getFoundNode() {
		return foundNode;
	}

	public void setFoundNode(Node<T> foundNode) {
		this.foundNode = foundNode;
	}

	public int getTreeMaxDistance() {
		return treeMaxDistance;
	}

	public void setTreeMaxDistance(int treeMaxDistance) {
		this.treeMaxDistance = treeMaxDistance;
	}

	public Node<T> getRoot() {
		return root;
	}

	public void setRoot(Node<T> root) {
		this.root = root;
	}

	private class Node<T> {
		private T data;
		private Node<T> left;
		private Node<T> right;
		private int maxLeft;
		private int maxRight;
		private Node<T> parent;
		
		public Node<T> getParent() {
			return parent;
		}

		public void setParent(Node<T> parent) {
			this.parent = parent;
		}

		public Node(T data) {
			this.data = data;
			this.left = null;
			this.right = null;
		}
		
		public void show() {
			System.out.print(data);
			System.out.print(" ");
		}
		
	}

	public BSTree() {
		// TODO Auto-generated constructor stub
		root = null;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int a[] = {1,2,3,4,5,6,7,8,9,10,11,12};
		//int a[] = {7,4,1,2,3,6,5,10,8,9,11,12};
		//BSTree<Integer> t = new BSTree<Integer>();
		String a[] = new String[]{"f","b","c","d","e","a","g","h","i","j","k"};
		BSTree<String> t = new BSTree<String>();
		//t.setRoot(t.new Node(7));
		//int b[] = new int[]{1,2,3,4,5,6,7,8,9};
		for (String i:a) {
			//v1
			//t.buildTree(t.getRoot(), i);
			//v2
			//t.buildTreeV2(t, i);
			//v3
			t.buildTree(t.getRoot(), i);
		}
		System.out.println("inOrderTraversal:");
		t.inOrderTraversal(t.getRoot());
		System.out.println();
		System.out.println("PreOrderTraversal:");
		t.preOrderTraversal(t.getRoot());
		System.out.println();
		System.out.println("PostOrderTraversal:");
		t.postOrderTraversal(t.getRoot());
		System.out.println();
		
		System.out.println("Root of t is:"+t.getRoot().data);
		//t.searchMaxLength(t.getRoot());
		//System.out.println("Max distance is:"+t.getTreeMaxDistance());
		System.out.println("Max distance is:"+t.searchMaxLengthV2(t.getRoot()));
		System.out.println("getMaxDepth() is:"+t.getMaxDepth(t.getRoot()));
		System.out.println("Max distance calling getMaxDepth() is:"+t.getMaxDistance(t.getRoot()));
		System.out.println("getMaxWidth() is: "+t.getMaxWidth(t.getRoot()));
	
		System.out.println("postSearchNode a...");
		t.postSearchNode(t.getRoot(), "a");
		System.out.println();
		System.out.println("Path from a to root is:");
		t.printPathToRoot(t.getFoundNode());
		System.out.println();
		System.out.println("postSearchNode i...");
		t.found = false;
		t.setFoundNode(null);
		t.postSearchNode(t.getRoot(), "i");
		System.out.println("Path from root to i is:");
		t.printPathFromRoot(t.getFoundNode());
		System.out.println();
		System.out.println("getPathBetweenTwoNodes a & i");
		t.getPathBetweenTwoNodes(t.getRoot(), "a", "i");
		System.out.println();
	}


	public void buildTree(Node<T> root, T data) {
		if (null==root) {
			this.setRoot(new Node(data));
		} else {
			if (data.compareTo(root.data)<0) {
				if (null==root.left) {
					//build left
					root.left = new Node(data);
				} else {
					//recursive insert left
					buildTree(root.left, data);
				}
			} else if (data.compareTo(root.data)>0){
				if (null==root.right) {
					//build right
					root.right = new Node(data);
				} else {
					//recursive insert right
					buildTree(root.right, data);
				}
			} else {
				System.out.println("Existed data: "+data);
				return ;
			}
		}
	}
	
	
	public void preOrderTraversal(Node<T> root) {
		if (null!=root) {
			root.show();
			preOrderTraversal(root.left);
			preOrderTraversal(root.right);
		}
	}
	
	public void inOrderTraversal(Node<T> root) {
		if (null!=root) {
			inOrderTraversal(root.left);
			root.show();
			inOrderTraversal(root.right);
		}
	}
	
	public void postOrderTraversal(Node<T> root) {
		if (null!=root) {
			postOrderTraversal(root.left);
			postOrderTraversal(root.right);
			root.show();
		}
	}
	
	public void searchMaxLength(Node<T> root) {
		int childMaxDepth;
		int maxLenOfCurrentNode = 0;
		
		if (null==root) {
			return ;
		} else {
			if (null==root.left) {
				root.maxLeft = 0;
			} else {
				searchMaxLength(root.left);
			}
			if (null==root.right) {
				root.maxRight = 0;
			} else {
				searchMaxLength(root.right);
			}
			if (null!=root.left) {
				//root.maxLeft = leftChildMaxDepth+1;
				childMaxDepth = root.left.maxLeft>root.left.maxRight? root.left.maxLeft: root.left.maxRight;
				root.maxLeft = childMaxDepth+1;
			}			
			if (null!=root.right) {
				//root.maxRight = rightChildMaxDepth+1;
				childMaxDepth = root.right.maxLeft>root.right.maxRight? root.right.maxLeft: root.right.maxRight;
				root.maxRight = childMaxDepth+1;

			}
			maxLenOfCurrentNode = root.maxLeft + root.maxRight;
			
			treeMaxDistance = treeMaxDistance>maxLenOfCurrentNode? treeMaxDistance: maxLenOfCurrentNode;
		}
	}

	public int searchMaxLengthV2(Node<T> root) {
		int childMaxDepth;
		int maxLenOfCurrentNode = 0;
		
		if (null==root) {
			return 0;
		} else {
			if (null==root.left) {
				root.maxLeft = 0;
			} else {
				searchMaxLength(root.left);
			}
			if (null==root.right) {
				root.maxRight = 0;
			} else {
				searchMaxLength(root.right);
			}
			if (null!=root.left) {
				//root.maxLeft = leftChildMaxDepth+1;
				childMaxDepth = root.left.maxLeft>root.left.maxRight? root.left.maxLeft: root.left.maxRight;
				root.maxLeft = childMaxDepth+1;
			}			
			if (null!=root.right) {
				//root.maxRight = rightChildMaxDepth+1;
				childMaxDepth = root.right.maxLeft>root.right.maxRight? root.right.maxLeft: root.right.maxRight;
				root.maxRight = childMaxDepth+1;

			}
			maxLenOfCurrentNode = root.maxLeft + root.maxRight;
			return maxLenOfCurrentNode;
			
			//treeMaxDistance = treeMaxDistance>maxLenOfCurrentNode? treeMaxDistance: maxLenOfCurrentNode;
		}
	}

	public int getMaxDepth(Node<T> root) {
		if (null==root) {
			return 0;
		} else {
			return 1+Math.max(getMaxDepth(root.left), getMaxDepth(root.right));
		}
	}
	
	public int getMaxDistance(Node<T> root) {
		if (null==root) {
			return 0;
		} else {
			return getMaxDepth(root.left)+getMaxDepth(root.right);
		}
	}
	
	public int getMaxWidth(Node<T> root) {
		if (null==root) {
			return 0;
		}
		
		Queue<Node<T>> queue = new LinkedList<Node<T>>();
		queue.add(root);
		int maxWidth = 1;
		
		while (!queue.isEmpty()) {
			int currentWidth = queue.size();
			//Add its child nodes to tail of queue & 
			//Remove current layer node from head of queue
			while (currentWidth>0) {
				Node<T> node = queue.poll();
				if (null!=node) {
					if (null!=node.left) {
						queue.add(node.left);
					}
					if (null!=node.right) {
						queue.add(node.right);
					}
				}
				currentWidth--;
			}
			maxWidth = Math.max(maxWidth, queue.size());
		}
		return maxWidth;
	}
	
	public void postSearchNode(Node<T> root, T v) {
		if (null==root) {
			return ;
		} else {
			if (!found && null!=root.left) {
				root.left.setParent(root);
				postSearchNode(root.left, v);
			}
			if (!found && null!=root.right) {
				root.right.setParent(root);
				postSearchNode(root.right, v);
			}
			System.out.print(root.data);
			System.out.print(" ");
			if(0==root.data.compareTo(v)) {
				found = true ;
				setFoundNode(root);
			}
		}
	}
	
	public void printPathToRoot(Node<T> node) {
		while (null!=node) {
			System.out.print(node.data);
			System.out.print(" ");
			node = node.getParent();
		}
	}
	
	public void printPathFromRoot(Node<T> node) {
		if (null!=node && null!=node.getParent()) {
			printPathFromRoot(node.getParent());
		}
		System.out.print(node.data);
		System.out.print(" ");
	}

	public void getPathToRoot(Node<T> node, LinkedList<String> path) {
		while (null!=node) {
			path.add(node.data.toString());
			node = node.getParent();
		}
	}
	
	public void getPathFromRoot(Node<T> node, LinkedList<String> path) {
		if (null!=node && null!=node.getParent()) {
			getPathFromRoot(node.getParent(), path);
		}
		path.add(node.data.toString());
	}

	private void printLinkedList(LinkedList<String> ll) {
		for (String node: ll) {
			System.out.print(node);
			System.out.print(" ");
		}
		System.out.println();

	}
	
	private StringBuffer mergePaths(LinkedList<String> rootToVal1, LinkedList<String> rootToVal2) {
		StringBuffer result = new StringBuffer();
		String lastDivergence = null;
		while (rootToVal1.peekFirst() == rootToVal2.peekFirst()) {
			lastDivergence = rootToVal1.pollFirst();
			rootToVal2.pollFirst();
		}
		
		Iterator<String> path1Iter = rootToVal1.iterator();
		Iterator<String> reversedPath2Iter = rootToVal2.descendingIterator();
		
		while(reversedPath2Iter.hasNext()) {
			result.append(reversedPath2Iter.next().toString()+", ");
		}
		result.append(lastDivergence+", ");
		while(path1Iter.hasNext()) {
			result.append(path1Iter.next().toString()+", ");
		}
		return result;
	}
	
	public void getPathBetweenTwoNodes(Node<T> root, T val1, T val2) {
		if (null==root) {
			return ;
		}
		this.found = false;
		setFoundNode(null);
		//Search Node1, set all related parent and record the found node
		postSearchNode(root, val1);
		System.out.println();
		Node<T> node1 = getFoundNode();
		this.found = false;
		setFoundNode(null);
		postSearchNode(root, val2);
		System.out.println();
		Node<T> node2 = getFoundNode();
		if (null==node1 || null==node2) {
			System.out.println("Not all nodes found, path is null");
			return ;
		}
		LinkedList<String> rootToVal1 = new LinkedList<String>();
		getPathFromRoot(node1, rootToVal1);
		LinkedList<String> rootToVal2 = new LinkedList<String>();
		getPathFromRoot(node2, rootToVal2);
		//printLinkedList(rootToVal1);
		//printLinkedList(rootToVal2);
		StringBuffer result = mergePaths(rootToVal1, rootToVal2);
		System.out.println(result);
	}
}

