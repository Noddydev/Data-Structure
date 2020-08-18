// Tree Traversal(INOREDER, PREORDER, POSTORDER)

class Node {
	int key;
	Node left, right;

	public Node(int item)
	{
		key = item;
		left = right = null;
	}
}

class BinaryTree7 {
	Node root;
	BinaryTree7() 
	{
		root = null;
	}

	void printpostorder(Node node) {
		if(node == null)
			return;

		printpostorder(node.left);
		printpostorder(node.right);
		System.out.print(node.key + " ");	
	}

	void printInorder(Node node) {
		if(node == null)
			return;

		printInorder(node.left);
		System.out.print(node.key + " ");
		printInorder(node.right);	
	}	

	void printPrepost(Node node) {
		if(node == null)
			return;

		System.out.print(node.key + " ");
		printPrepost(node.left);
		printPrepost(node.right);	
	}

	void printpostorder() { printpostorder(root); }
	void printInorder() { printInorder(root); }
	void printPrepost() { printPrepost(root); }

	public static void main(String args[]) {
		BinaryTree7 tree = new BinaryTree7();

		tree.root = new Node(1);
		tree.root.left = new Node(2);
		tree.root.right = new Node(3);
		tree.root.left.left = new Node(4);
		tree.root.left.right = new Node(5);

		System.out.println("PreOredr Traversal Of Binary Tree: ");
		tree.printPrepost();

		System.out.println("\nInorder Traversal Of Binary Tree: ");
		tree.printInorder();

		System.out.println("\nPostOredr Traversal Of Binary Tree: ");
		tree.printpostorder();
	}
}