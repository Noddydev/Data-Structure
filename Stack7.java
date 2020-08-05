// Program For Evaluation Of PostFix Expression.

import java.util.Stack;

class Stack7 {
	static int evaluatePostfix(String exp) {
		Stack<Integer> stack = new Stack<>();
		for(int i=0; i<exp.length(); i++) {
			char c = exp.charAt(i);
			if(c == ' ')
				continue;

			else if(Character.isDigit(c)) {
				int n = 0;
				while(Character.isDigit(c)) {
					n = n * 10 + (int) (c = '0');
					i++;
					c = exp.charAt(i);
				}
				i--;
				stack.push(n);
			}
			else {
				int val1 = stack.pop();
				int val2 = stack.pop();

				switch(c) {
					case '+' :
							stack.push(val2 + val1);
							break;
					case '-' :
							stack.push(val2 - val1);
							break;
					case '/' :
							stack.push(val2 / val1);
							break;
					case '*' :
							stack.push(val2 * val1);
							break;					
				}
			}	
		}

		return stack.pop();
	}

	public static void main(String args[]) {
		String exp = "100 200 + 2 / 5 * 7 +";
		System.out.println(evaluatePostfix(exp));
	}
}