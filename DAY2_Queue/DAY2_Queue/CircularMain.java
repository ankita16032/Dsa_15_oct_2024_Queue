package DAY2_Queue;

import java.util.Scanner;

public class CircularMain {
	public static void main(String[] args) {
	
	Scanner in=new Scanner(System.in);
	CircularQueue obj=new CircularQueue();//object created
    System.out.println("Enter size of Queue:");
    int size=in.nextInt();
    obj.create_Queue(size);
    int ch,e;
    do
    {
        System.out.println("Queue Menu");
        System.out.println("-----------");
        System.out.println("1. Enqueue");
        System.out.println("2. Dequeue ");
        System.out.println("3. is Full");
        System.out.println("4. is Empty");
        System.out.println("5. Print Queue");
        System.out.println("0.Exit");
        System.out.println("-----------");
        System.out.println("Choice:");
        ch=in.nextInt();
        switch(ch)
        {
            case 1:
                if(obj.is_Full()!=true)//not full
                {
                    System.out.println("Enter a number:");
                    e=in.nextInt();
                    obj.Enqueue(e);;
                }
                else {
                    System.out.println("Queue Full");
                }
                break;
            case 2:
                if(obj.is_Empty()!=true)//not empty
                {
                    System.out.println("Element out is "+obj.Dequeue());
                }
                else {
                    System.out.println("Queue Empty");
                }
                break;
            case 3:
            	System.out.println("Full: "+ obj.is_Full());
                    break;
            case 4:
            	System.out.println("Empty: " +obj.is_Empty());
                break;
                
            case 5:
                obj.print_Queue();
                
            case 0:
                System.out.println("Thanks for using code.");
                break;
            default:
                System.out.println("Wrong option selsected:");
                break;
        }

    }while(ch!=0);
}
}