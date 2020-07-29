public class SumLeftRight {
	
	static int FindElement(int arr[], int n) {
		int[] prefixsum = new int[n];
		prefixsum[0] = arr[0];
		for(int i=1; i<n; i++) 
			prefixsum[i] = prefixsum[i-1] + arr[i];

		int[] suffixsum = new int[n];
		suffixsum[n-1] = arr[n-1];
		for(int i=n-2; i>=0; i--)
			suffixsum[i] = suffixsum[i+1]+arr[i];


		for(int i=1; i<n-1; i++)
			if(prefixsum[i] == suffixsum[i])
				return arr[i];
			return -1;			
	}

	public static void main(String args[]) {
		int arr[] = { 1, 4, 2, 5 };
		int n = arr.length;
		System.out.println(FindElement(arr, n));
	}
}