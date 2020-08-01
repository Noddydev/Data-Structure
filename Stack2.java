// Implementing Stack Using Linked List

public class Stack2 {
	StackNode root;

	static class StackNode {
		int data;
		StackNode next;

		StackNode(int data) {
			this.data = data;
		}
	}

	public boolean isEmpty() {
		if(root == null) {
			return true;
		} else
			return false;
	}

	public void push(int data) {
		StackNode newNode = new StackNode(data);
		if(root == null) {
			root = newNode;
		}
		else {
			StackNode temp = root;
			root = newNode;
			newNode.next = temp;
		}
		System.out.println(data + " Pushed To Stack");
	}

	public int pop() {
		int popped = Integer.MIN_VALUE;
		if(root == null) {
			System.out.println("STACK IS EMPTY");
		}
		else {
			popped = root.data;
			root = root.next;
		}
		return popped;
	}

	public int peek() {
		if(root == null) {
			System.out.println("STACK IS EMPTY");
			return  Integer.MIN_VALUE;
		}
		else {
			return root.data;
		}
	}

	public static void main(String args[]) {
		Stack2 sll = new Stack2();
		sll.push(10);
		sll.push(20);
		sll.push(30);
		System.out.println(sll.pop() + " Popped From Stack");
		System.out.println("Top Element is " + sll.peek());
	}
}