// Program Of Binary Search in Sorted Array.
class BinarySearch {
	
	int binarySearch(int arr[], int x) {
		int l = 0, u = arr.length-1;
		while(l <= u)
		{
			int m = l + (u-1) / 2;

			if(arr[m] == x)
				return m;
			if(arr[m] < x)
				l = m + 1;
			else
				u = m - 1;		
		}
		return -1;
	}

	public static void main(String args[]) {

		BinarySearch obj = new BinarySearch();
		int arr[] = { 2, 3, 4, 5, 7, 8, 9, 10, 24 };
		int n = arr.length;
		int x = 10;
		int result = obj.binarySearch(arr, x);


		System.out.println("==============================");
		if(result == -1)
			System.out.println("Element Not Present!!!");
		else
			System.out.println("Element Is Present At : " + result);


		System.out.println("===================================");		
	}
}