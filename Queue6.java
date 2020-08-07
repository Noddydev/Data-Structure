// Array Iplementation Of Queue

class Queue {
	private static int front, rear, capacity;
	private static int queue[];
	Queue(int c) {
		front = rear = 0;
		queue  = new int[capacity];
	}

	static void queueEnqueue(int data) {
		if(capacity == rear) {
			System.out.printf("\nQueue Is Full\n");
			return;
		}
		else {
			queue[rear] = data;
			rear++;
		}
		return;
	}

	static void queueDequeue() {
		if(front == rear) {
			System.out.printf("\nQueue is Empty");
			return;
		}
		else {
			for(int i=0; i<rear-1; i++) {
				queue[i] = queue[i+1];
			}
			if(rear < capacity)
				queue[rear] = 0;
			rear--;	
		}
		return;
	}

	static void queueDisplay() {
		int i;
		if(front == rear) {
			System.out.printf("Queue Is Empty\n");
			return;
		}
		for(i=front; i<rear; i++) {
			System.out.printf("%d <-- ", queue[i]);
		}
		return;
	}

	static void queuefront() {
		if(front == rear) {
			System.out.printf("\nQueue is Empty\n");
			return;
		}
		System.out.printf("\nFront Element is = %d" , queue[front]);
		return;
	}
}

public class Queue6 {
	public static void main(String args[]) {
		Queue q = new Queue(4);
		q.queueDisplay();


		q.queueEnqueue(20);
		q.queueEnqueue(30);
		q.queueEnqueue(40);
		q.queueEnqueue(50);

		q.queueDisplay();

		q.queueEnqueue(60);

		q.queueDisplay();

		q.queueDequeue();
		q.queueDequeue();
		System.out.printf("\n\nAfter Two Node Deletion\n\n");

		q.queueDisplay();

		q.queuefront();
	}
}