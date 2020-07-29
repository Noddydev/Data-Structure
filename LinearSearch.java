// Program Of Liner Search In ARRAY.

public class LinearSearch {
	
	public static int search(int arr[], int x) {
		int n = arr.length;
		for(int i=0; i<n; i++)
		{
			if(arr[i] == x) 
				return i;
		}
		return -1;
	}

	public static void main(String args[]) 
	{
		int arr[] = { 2, 3, 4, 10, 20 };
		int x = 10;

		System.out.println("===================================");
		int result = search(arr, x);
		if(result == -1)
			System.out.println("Element Is Not Present!!");
		else
			System.out.println("Element Present At Index: " + result);

		System.out.println("===================================");		
	}
}