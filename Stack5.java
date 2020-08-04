// Reverse Without Using Auxiliary Space

public class Stack5 {
	static void swap(char a[], int index1, int index2) {
		char temp = a[index];
		a[index1] = a[index2];
		a[index2] = temp;

		static void reverse(char str[]) {
			int n = str.length, i;
			for(i=0; i<n/2; i++) {
				swap(str, i, n-i-1);
			}
		}
	}
	public static void main(String args[]) {
		char str[] = "abc".toCharArray();
		
		reverse(str);
		System.out.println("Reverse String is " + String.valueOf(str));
	}
}