// Recursion Method To Find Min and Max Element in Array.
class MinMax2 {
	static int getMin(int arr[], int i, int n) {
		return (n == 1) ? arr[i] :
			Math.min(arr[i], getMin(arr, i+1, n-1));
	}

	static int getMax(int arr[], int i, int n) {
		return (n == 1) ? arr[i] :
			Math.max(arr[i], getMax(arr, i+1, n-1));
	}

	public static void main(String args[]) {
		int arr[] = { 12, 1234, 45, 67, 1 };
		int n = arr.length;
		System.out.println("Minimum: " + getMin(arr, 0, n));
		System.out.println("Maximum: " + getMax(arr, 0, n));
	}
}