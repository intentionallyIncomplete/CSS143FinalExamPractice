package Midterm1ReviewAgain;

public class CustomQueue {


	int queue[] = new int[5];

	int size;
	int front;
	int rear;

	public void enqueue(int data){
		if(!isFull()){
			queue[rear] = data;
			rear = (rear + 1)%size; //shift rear pointer to one position
			//backwards
			size = (size + 1)%size; //size of queue increased by 1 to allow for
			//increased boundaries to fit more elements
		}else{
			System.out.println("queue is full");
		}
	}

	public void show(){
		System.out.println("elements: ");


		System.out.println();

		for(int n : queue){
			System.out.println(n);
		}
	}

	public int dequeue(){
		int data = queue[front];
		if(!isEmpty()){	
			front++; //move front up
			size--; //reduce number of available spaces
		}else{
			System.out.println("queue is empty");
		}

		return data;
	}

	public boolean isEmpty(){
		return size==0;
	}

	public boolean isFull(){
		return getSize() == queue.length;
	}

	public int getSize(){
		return this.size;
	}
}
