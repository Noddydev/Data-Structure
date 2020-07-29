// Insertion Of Element In ARRAY.

import java.util.Scanner;

class InsertionAtBiginning {
	
	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		int arr[] = new int [5];
		int n = 3, i=0;

		System.out.println("==========================");
		System.out.println("Enter Element In ARRAY: ");
		for(i=0; i<n; i++)1
		{
			arr[i] = sc.nextInt();
		}

		System.out.println("==========================");
		System.out.println("BEFORE INSERTION: ");
		for(i=0; i<n; i++)
		{ 
			System.out.println(arr[i]);
		}
		System.out.println("==========================");


		for(i=n; i>=0; i--)
		{
			arr[i+1] = arr[i];
		}
		System.out.println("Enter Element To Insert: ");
		int val = sc.nextInt();
		arr[0] = val;
		n++;

		System.out.println("==========================");
		for(i=0; i<n; i++)
		{
			System.out.println("AFTER INSERTION: " + arr[i]);
		}
		System.out.println("==========================");

	}
} 