import java.io.*;
import java.lang.*;
import java.util.*;

class SpecificInsert {
	
	public static int[] insertX(int n, int arr[], int x, int pos)
	{
		int i;
		int newer[] = new int[n+1];

		for(i=0; i<n; i++) {
			if(i < pos-1)
				newer[i] = arr[i];
			else if(i == pos -1)
				newer[i] = x;
			else 
				newer[i] = arr[i-1];		
		}
		return newer;
	}

	public static void main(String args[]) {
		int n = 10;
		int i;
		int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9};
		System.out.println("Initial Array:\n" +  Arrays.toString(arr));

		int x = 50;

		int pos = 5;

		arr = insertX(n, arr, x, pos);

		System.out.println("\n Array with " + x + " inserted at position " + pos + ":\n" + Arrays.toString(arr));

	}
}