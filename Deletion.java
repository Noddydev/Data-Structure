// Program To Delete An Element From ARRAY.

import java.util.Arrays;

public class Deletion {
	
	public static void main(String args[]) {

		int arr[] = { 25, 14, 56, 15, 36, 56, 18, 29, 49 };
		System.out.println("Original Array: " + Arrays.toString(arr));

		int removeindex = 1;
		for(int i=removeindex; i<arr.length-1; i++)
		{
			arr[i] = arr[i+1];
		}
		System.out.println("Array After Removing: " + Arrays.toString(arr));
	}
}