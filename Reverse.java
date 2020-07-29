// Program To Reverse An Array 

class Reverse {
	static void reverse(int arr[], int n) {
		int brr[] = new int[n];
		int j=n;
		for(int i=0; i<n; i++) {
			brr[j-1] = arr[i];
			j = j - 1;
		}
		System.out.println("Reverse Array Is: ");
		for(int k=0; k<n; k++) {
			System.out.println(brr[k]);
		}
	}

	public static void main(String args[]) {
		int ar[] = { 10, 20, 30, 40, 50 };
		reverse(ar, ar.length);
	}
}