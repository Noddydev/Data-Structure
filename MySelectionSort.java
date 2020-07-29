// Program Of Selection Of Element In ARRAY.

import java.util.Scanner;

public class MySelectionSort {
	
	public static int[] doSelectionSort(int[] arr) {
		for(int i=0; i<arr.length-1; i++) {
			int index = i;
			for(int j=i+1; j<arr.length; j++)
				if(arr[j] < arr[index])
					index = j;
			int SmallerNumber = arr[index];
			arr[index] = arr[i];
			arr[i] = SmallerNumber;	
		}
		return arr;
	}

	public static void main(String args[]) {
		int arr1[] = { 10, 32, 2, 56, 7, 67 };
		int arr2[] = doSelectionSort(arr1);
		System.out.println("=====================");
		for(int i : arr2) {
			System.out.print(i);
			System.out.print(", ");
		}
		System.out.println(" ");
		System.out.println("=====================");
	}
}