// Program To find maximum in O(1) without using additonal Stack 

class Stack8 {
	static class Block {
		int value, localMax;
	};

	static class Stack {
		Block s[];
		int size, top;

		Stack(int n) {
			size = n;
			s = new Block[n];
			for(int i=0; i<n; i++) 
				s[i] = new Block();
			top = -1;	
		}
		void push(int n) {
			if(top == size - 1) {
				System.out.println("Stack Is Full");
			}
			else {
				top++;
				if(top == 0) {
					s[top].value = n;
					s[top].localMax = n;
				}
				else {
					if(s[top - 1].localMax > n) 
					{
						s[top].value = n;
						s[top].localMax = s[top -1].localMax;
					}
					else {
						s[top].value = n;
						s[top].localMax = n;
					}
				}
				System.out.println(n + " Insrted In Stack");
			}
		}

		void pop() {
			if(top == -1) {
				System.out.println("Stack Is Empty");
			}
			else {
				top--;
				System.out.println("Element Popped");
			}
		}

		void max() {
			if(top == -1) {
				System.out.println("Stack Is Empty");
			}
			else {
				System.out.println("Maximum Value In Stack " + s[top].localMax);
			}
		}
	}

	public static void main(String args[]) {
		Stack ss = new	 Stack(5);
		ss.push(2);
		ss.max();
		ss.push(6);
		ss.max();
		ss.pop();
		ss.max();
	}
}