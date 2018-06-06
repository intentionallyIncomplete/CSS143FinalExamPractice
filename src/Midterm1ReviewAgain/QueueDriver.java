package Midterm1ReviewAgain;

public class QueueDriver {

	public static void main(String[] args){
		
		CustomQueue cq = new CustomQueue();
		
		cq.enqueue(5);
		cq.enqueue(2);
		cq.dequeue();
		
		cq.show();
	}
}
