// Java Program to insert element in binary tree
import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree2 {
	static class Node {
		int key;
		Node left, right;

		Node(int key) {
			this.key = key;
			left = null;
			right = null;
		}
	}

	static Node root;
	static Node temp = root;

	static void inOrder(Node temp) {
		if(temp == null) 
			return;

		inOrder(temp.left);
		System.out.println(temp.key + " ");
		inOrder(temp.right);	
	}

	static void insert(Node temp, int key) {
		Queue<Node> q = new LinkedList<Node>();
		q.add(temp);

		while(!q.isEmpty()) {
			temp = q.peek();
			q.remove();

			if(temp.left == null) {
				temp.left = new Node(key);
				break;
			}
			else 
				q.add(temp.left);


			if(temp.right == null) {
				temp.right = new Node(key);
				break;
			}	
			else 
				q.add(temp.right);
		}
	}

	public static void main(String args[]) {
		root = new Node(10);
		root.left = new Node(11);
		root.left.left = new Node(7);

		root.right = new Node(9);
		root.right.left = new Node(15);
		root.right.right = new Node(8);

		System.out.println("InOrder Travrsal Before Insertion: ");
		inOrder(root);

		int key = 12;
		insert(root, key);

		System.out.println("\nInOrder Traversal After Insertion: ");
		inOrder(root);
	}
}