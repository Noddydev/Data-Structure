// Program To Find Min and Max Element In Array.

import java.util.*;
class MinMax {
	static int getMin(int arr[], int n) {
		int res = arr[0];
		for(int i=1; i<n; i++) 
			res = Math.min(res, arr[i]);
		return res;	
	}

	static int getMax(int arr[], int n) {
		int res = arr[0];
		for(int i=1; i<n; i++)
			res = Math.max(res, arr[i]);
		return res;	
	}

	public static void main(String args[]) {
		int arr[] = { 10, 20, 30, 40, 50 };
		int n = arr.length;
		System.out.println("Minimum: " + getMin(arr, n));
		System.out.println("Maximum: " + getMax(arr, n));
	}
}