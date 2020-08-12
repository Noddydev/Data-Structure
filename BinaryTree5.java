// Continues Tree
import java.util.*;
class BinaryTree5 {
	static class Node {
		int data;
		Node left, right;
	};

	static Node newNode(int data) {
		Node node = new Node();
		node.data = data;
		node.left = node.right = null;
		return(node);
	}

	static boolean treeContinuous(Node ptr) {
		if(ptr == null) 
			return true;

		if(ptr.left == null && ptr.right == null)
			return true;

		if(ptr.left == null) 
			return(Math.abs(ptr.data - ptr.right.data) == 1) && treeContinuous(ptr.right);

		if(ptr.right == null)
			return(Math.abs(ptr.data - ptr.left.data) == 1) && treeContinuous(ptr.left);

		return Math.abs(ptr.data - ptr.left.data) == 1 && 
				Math.abs(ptr.data - ptr.right.data) == 1 &&
					treeContinuous(ptr.left) && 
					treeContinuous(ptr.right);				
	}

	public static void main(String args[]) {
		Node root = newNode(3);
		root.left = newNode(2);
		root.right = newNode(4);
		root.left.left = newNode(1);
		root.left.right = newNode(3);
		root.right.right = newNode(5);

		if(treeContinuous(root))
			System.out.println("YES");
		else
			System.out.println("NO"); 	
	}
}