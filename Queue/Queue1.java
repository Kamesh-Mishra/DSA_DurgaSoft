package Queue;

// These queues are divided into three types

// 1) normal queue
// 2) circular queue
// 3) dequeue

// normal queue implementation by using arrays
// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

class NQ{
    int front, rear, size, Q[];
    NQ(){
        front = -1;
        rear = -1;
        size = 5;
        Q = new int[size];
    }

    void insert(int value){
        if(rear==size){
            System.out.println("NQ is full");
            return;
        }
        if(front==rear)
            front=rear=0;
        Q[rear++] = value;
    }

    void delete(){
        if(front==rear){
            System.out.println("NQ is empty");
            return;
        }
        System.out.println("Deleted object is: "+Q[front]);
        front++;
        if(front==rear)
            front=rear=-1;
    }

    void display(){
        if(front==rear){
            System.out.println("NQ is empty");
            return;
        }
        for(int i=front; i<rear; i++)
            System.out.print(Q[i]+" ");
        System.out.println();
    }
}

public class Queue1 {
    public static void main(String[] args) {
        NQ q = new NQ();
        q.insert(111);
        q.insert(222);
        q.insert(333);
        q.insert(444);
        q.insert(555);
        q.insert(666);
        q.display();
        q.delete();
        q.display();
        
    }
}
