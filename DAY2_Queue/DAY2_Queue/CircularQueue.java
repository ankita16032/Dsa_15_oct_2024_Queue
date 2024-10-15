package DAY2_Queue;

public class CircularQueue {
	
	private int Q[], MaxSize, front, rear,count;

    public void create_Queue(int size) {
    	MaxSize = size;//init MaxSize
        front = 0;
        rear = -1;
        count=0;
        Q = new int[size];//create stack
       
    }

    void Enqueue(int e) {
        rear=(rear+1)%MaxSize;
        Q[rear] = e;
        count++;
        System.out.println("Element " + e + " inserted:");
    }

    boolean is_Full() {
        if (count == MaxSize )
            return true;
        else
            return false;
    }

    int Dequeue() {
        int temp = Q[front];
        front=(front+1)%MaxSize;
        count--;
        return (temp);

        //return(Q[front--]);
    }

    boolean is_Empty() {
        if (count == 0)
            return true;
        else
            return false;
    }

    void print_Queue() {//lifo print
        System.out.println("Queue has");
       
        	int i,c;
        	i=front;
        	c=0;
        	
        	while(c<count) {
        		System.out.println(Q[i]);
        		i=(i+1)%MaxSize;
        		c++;
        }

    }
}
