// Program for printlevelorder(tree, level) Using Queue

import java.util.Queue;
import java.util.LinkedList;

class Node {
	int data;
	Node left, right;

	public Node(int item) {
		data = item;
		left = null;
		right = null;
	}
}

class BinaryTree4 {
	Node root;

	void printlevelOrder() 
	{
		Queue<Node> queue = new LinkedList<Node>();
		queue.add(root);
		while(!queue.isEmpty()) 
		{
			Node tempNode = queue.poll();
			System.out.println(tempNode.data + " ");

			if(tempNode.left != null) {
				queue.add(tempNode.left);
			}
			if(tempNode.right != null) {
				queue.add(tempNode.right);
			}
		}
	}

	public static void main(String args[]) {
		BinaryTree4 tree_level = new BinaryTree4();
		tree_level.root = new Node(1);
		tree_level.root.left = new Node(2);
		tree_level.root.right = new Node(3);
		tree_level.root.left.left = new Node(4);
		tree_level.root.left.right = new Node(5);

		System.out.println("Level Order Traversal - ");
		tree_level.printlevelOrder();
	}
}