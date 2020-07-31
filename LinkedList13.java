// Program To Split A Circular LinkedList

class LinkedList13 {
		
		static Node head, head1, head2;

		static class Node {
			int data;
			Node next, prev;
			Node(int d) {
				data = d;
				next = prev = null;
			}
		}

		void splitList() 
		{
			Node slow_ptr = head;
			Node fast_ptr = head;
			if(head == null) {
				return;
			}
			while(fast_ptr.next != head && fast_ptr.next.next != head)
			{
				fast_ptr = fast_ptr.next.next;
				slow_ptr = slow_ptr.next;
			}
			if(fast_ptr.next.next == head) {

			}
			
			head1 = head;
			if(head.next != head) {
				head2 = slow_ptr.next;
			}
			fast_ptr.next = slow_ptr.next;
			slow_ptr.next = head;
		}	

		void printList(Node node) 
		{
			Node temp = node;
			if(node != null) 
			{
				do {
					System.out.println(temp.data + " ");
					temp = temp.next;
				}	while(temp != node);
			}
		}

		public static void main(String args[]) {
			LinkedList13 llist = new LinkedList13();
			llist.head = new Node(12);
			llist.head.next = new Node(56);
			llist.head.next.next = new Node(2);
			llist.head.next.next.next = new Node(11);
			llist.head.next.next.next.next = llist.head;
			System.out.println("Original Circular Linked List : ");
			llist.printList(head);
			llist.splitList();
			System.out.println("First List: ");
			llist.printList(head1);
			System.out.println("Second List: ");
			llist.printList(head2);
		}
}