import java.util.Scanner;

public class DeleteElement {
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		int arr[] = { 1, 2, 5, 12, 7, 3, 8};
		System.out.println("Enter Element To Be Deleted: ");
		int ele = sc.nextInt();

		for(int i=0; i<arr.length; i++) {
			if(arr[i] == ele) {
				for(int j=i; j<arr.length-1; j++) {
					arr[j] = arr[j+1];
				}
				break;
			}
		}
		System.out.println("Elements -- ");
		for(int i=0; i<arr.length; i++) {
			System.out.println(" " + arr[i]);
		}
	}
}