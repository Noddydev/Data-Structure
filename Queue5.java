// Queue LinkedList Implementation

class Queue {
	QNode front, rear;

	class QNode {
		int key;
		QNode next;
		public QNode(int key) {
			this.key = key;
			this.next = null;
		}
	}

	public Queue() {
		this.front = this.rear = null;
	}

	void enQueue(int key) {
		QNode temp = new QNode(key);
		if(this.rear == null) {
			this.front = this.rear = temp;
			return;
		}
		this.rear.next = temp;
		this.rear = temp;
	}

	void deQueue() {
		if(this.front == null) 
			return;
		QNode temp = this.front;
		this.front = this.front.next;
		if(this.front == null)	
			this.rear = null;
	}
}

public class Queue5 {
		public static void main(String args[]) {
			Queue q = new Queue();
			q.enQueue(10);
			q.enQueue(20);
			q.deQueue();
			q.deQueue();
			q.enQueue(30);
			q.enQueue(40);
			q.enQueue(50);
			q.deQueue();
			System.out.println("Queue Front : " + q.front.key);
			System.out.println("Queue Rear : " + q.rear.key);
		}
}