import java.util.Scanner;

class InsertAtEnd {
	
	public static void main(String args[]) {

		int len, ele;
		Scanner sc = new Scanner(System.in);
		System.out.println("==================================");
		System.out.println("Enter Length Of An Array: ");
		len = sc.nextInt();
		System.out.println("==================================");

		int arr[] = new int[len+1];
		System.out.println("Enter " + len + " Elements: ");
		for(int i=0; i<len; i++)
		{
			arr[i] = sc.nextInt();
		}

		System.out.println("==================================");

		System.out.println("Enter The Element Which You Want To Insert: ");
		ele = sc.nextInt();
		arr[len] = ele;
		System.out.println("==================================");

		System.out.println("After Insertion Of Element: ");
		for(int i=0; i<len; i++)
		{
			System.out.print(arr[i] + ", ");
		}
		System.out.println(arr[len]);
	}
}