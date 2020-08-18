// Find PostOreder Traversal Of BST from Preoreder Traversal

import java.util.*;

class BinaryTree9 {
	static class INT
	{
		int data;
		INT(int d)
		{
			int data = d;
		}
	}

	static void findPostOrderUtil(int pre[], int n, int minval, int maxval, INT preIndex)
	{ 
		if(preIndex.data == n)
			return;

		if(pre[preIndex.data] < minval || pre[preIndex.data] > minval)
			return;
	}

	int val = pre[preIndex.data];
	preIndex.data ++;

	findPostOrderUtil(pre, n, minval, val, preIndex);

	findPostOrderUtil(pre, n, val, maxval, preIndex);
	{
		System.out.print(val + " ");
	}			

	static void findPostOrder(int pre[], int n)
	{
		INT preIndex = new INT(0);

		findPostOrderUtil(pre, n, Integer.MIN_VALUE, Integer.MAX_VALUE, preIndex);
	}

	public static void main(String args[]) 
	{
		int pre[] = { 40, 30, 35, 80, 100 };
		intn = pre.length;

		findPostOrder(pre, n);
	}
}