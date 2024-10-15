package DAY2_Queue;

public class QueueClass 
{
	 private int Q[], MaxSize, front, rear;

	    public void create_Queue(int size) {
	    	MaxSize = size;//init MaxSize
	        front = 0;
	        rear = -1;
	        Q = new int[size];//create stack
	       
	    }

	    void Enqueue(int e) {
	        rear++;
	        Q[rear] = e;
	        System.out.println("Element " + e + " inserted:");
	    }

	    boolean is_Full() {
	        if (rear == MaxSize - 1)
	            return true;
	        else
	            return false;
	    }

	    int Dequeue() {
	        int temp = Q[front];
	        front++;
	        return (temp);

	        //return(Q[front--]);
	    }

	    boolean is_Empty() {
	        if (front > rear)
	            return true;
	        else
	            return false;
	    }

	    void print_Queue() {//lifo print
	        System.out.println("Queue has");
	        for (int i = front; i <= rear; i++) {
	            System.out.print(Q[i]+" ");
	        }

	    }
}
