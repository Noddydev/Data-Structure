// Sort A Stack Using A Temporary Stack

import java.util.Stack;
class Stack9 {
		public static Stack<Integer> sortStcak(Stack<Integer> input) 
		{
			Stack<Integer> tmpstack = new Stack<Integer>();
			while(!input.isEmpty()) 
			{
				int tmp = input.pop();
				while(!tmpstack.isEmpty() && tmpstack.peek() < tmp) {
					input.push(tmpstack.pop());
				}
				tmpstack.push(tmp);
			}
			return tmpstack;
		}

		public static void main(String args[]) {
			Stack<Integer> input = new Stack<Integer>();
			input.add(34);
			input.add(3);
			input.add(31);
			input.add(98);
			input.add(92);
			input.add(23);

			Stack<Integer> tmpstack = sortStcak(input);
			System.out.println("Sorted Number Are: ");
			while(!tmpstack.empty()) {
				System.out.println(tmpstack.pop() + " ");
			}
		}
}