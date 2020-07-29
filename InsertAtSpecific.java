// Program To Insert An Element at Specific Position.

import java.util.Scanner;
public class InsertAtSpecific
{
	public static void main(String[] args) 
	{
		int len, p, e;
		Scanner sc = new Scanner(System.in);
		System.out.println("=================================");
		System.out.print("Enter Length Of Array: ");
		len = sc.nextInt();

		System.out.println("===================================");
		int arr[] = new int[len++];

		for(int i=1; i<len; i++)
		{
			System.out.print("Enter Element In Array: ");
			arr[i] = sc.nextInt();
		}

		System.out.println("=====================================");
		System.out.print("Enter The Position : ");
		p = sc.nextInt();

		System.out.println("=====================================");
		System.out.print("Enter Element: ");
		e = sc.nextInt();
		
		System.out.println("=====================================");
		for(int i=len-1; i>=(p-1); i--)
		{
			arr[i+1] = arr[i];
		}
		arr[p-1] = e;
		len++;
		System.out.print("After Insertion: ");
		for(int i=1; i<=len; i++)
		{
			System.out.print(arr[i]);
		}
		System.out.println("=====================================");
	}
}