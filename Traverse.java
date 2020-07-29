// Program Of Traversing Of ARRAY.

import java.util.Scanner;

class Traverse {
	public static void main(String args[]) {
	
		Scanner sc = new Scanner(System.in);

		System.out.println("==============================");
		System.out.print("Enter Size Of Array: ");
		int n = sc.nextInt();

		int arr[] = new int[n];
		System.out.println("==============================");
		System.out.print("Enter Element In Array: ");
		for(int i=0; i<n; i++)
		{
			arr[i] = sc.nextInt();
		}

		System.out.println("=============================");
		System.out.print("Traversing Array: ");
		for(int i=0; i<n; i++)
		{
			System.out.print(" " + arr[i]);
		}
		System.out.println(" ");
		System.out.println("=============================");
	}
}