// Implementing Stack Using Array.

class Stack {
	static final int max = 1000;
	int top;
	int a[] = new int[max];

	boolean isEmpty() {
		return (top < 0);
	}

	Stack() {
		top = -1;
	}

	boolean push(int  x) {
		if(top >= (max - 1)) {
			System.out.println("STACK OVERFLOW");
			return false;
		}
		else {
			a[++top] = x;
			System.out.println(x + " Push Into Stack");
			return true;
		}
	}

	int pop() {
		if(top < 0) {
			System.out.println("STACK UNDERFLOW");
			return 0;
		}
		else {
			int x = a[top--];
			return x;
		}
	}

	int peek() {
		if(top < 0) {
			System.out.println("STACK UNDERFLOW");
			return 0;
		}
		else {
			int x = a[top];
			return x;
		}
	}
}

class Stack1 {
	public static void main(String args[]) {
		Stack s = new Stack();
		s.push(10);
		s.push(20);
		s.push(30);
		System.out.println(s.pop() + " Popped From Stack");
	}
}