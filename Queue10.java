// Priority Queue Using Doubly Linked List:

import java.util.*;

class Queue10 {
	static Node front, rear;
	
	static class Node {
		int info; 
		int priority;
		Node prev, next;
	}

	static void push(Node fr, Node rr, int n, int p)
	{
		Node news = new Node();
		news.info = n;
		news.priority = p;

		if(fr == null) {
			fr = news;
			rr = news;
			news.next = null;
		}
		else {
			if(p <= (fr).priority) {
				news.next = fr;
				(fr).prev = news.next;
				fr = news;
			}
			else if(p >(rr).priority) {
				news.next = null;
				(rr).next = news;
				news.prev = (rr).next;
				rr = news;
			}
			else {
				Node start = (fr).next;
				while(start.priority > p) 
					start = start.next;
				(start.prev).next = news;
				news.next = start.prev;
				news.prev = (start.prev).next;
				start.prev = news.next;	
			}
		}
		front = fr;
		rear = rr;
	}	
	static int peek(Node fr) {
		return fr.info;
	}
	static boolean isEmpty(Node fr) {
		return (fr == null);
	} 

	static int pop(Node fr, Node rr) {
		Node temp = fr;
		int res = temp.info;
		(fr) = (fr).next;
		if(fr == null) 
			rr = null;
		front = fr;
		rear = rr;
			return res;	
	}

	public static void main(String args[]) {
		push(front, rear, 2, 3);
		push(front, rear, 3, 4);
		push(front, rear, 4, 5);
		push(front, rear, 5, 6);
		push(front, rear, 6, 7);
		push(front, rear, 1, 2);
		

		System.out.println(pop(front, rear));
		System.out.println(peek(front));
	}
}