package Queue;


// normal queue -----> insertion is from rear and deletion is from front side
// circular queue ---> insertion is from rear and deletion is from front side
// deque ------------> we can perform insertion and deletion from both sides

// deque implementation by using arrays:

class DQArrays{
    int DQ[], front, rear, size;

    DQArrays(){
        front = -1;
        rear = -1;
        size = 5;
        DQ = new int[size];
    }

    void insertAtFront(int value){
        if((front==0 && rear==size-1)||(front==rear+1)){
            System.out.println("Q is full");
            return;
        }
        if(front==-1)
            front=rear=0;
        else if(front==0)
            front=size-1;
        else
            front = front-1;
        DQ[front] = value;
    }

    void insertAtRear(int value){
        if((front==0 && rear == size-1)||(front==rear+1)){
            System.out.println("Q is full");
            return;
        }
        if(front==-1)
            front=rear=0;
        else if(rear==size-1)
            rear = 0;
        else
            rear = rear+1;
        DQ[rear] = value;
    }

    void deleteFromFront(){
        if(front==-1){
            System.out.println("DQ is empty");
            return;
        }
        System.out.println("deleted item is: "+DQ[front]);
        if(front == rear)
            front=rear=-1;
        else{
            if(front==size-1)
                front = 0;
            else
                front = front+1;
        }
    }

    void deleteFromRear(){
        if(front==-1){
            System.out.println("dq is empty");
            return;
        }
        System.out.println("Deleted object: "+DQ[rear]);

        if(front==rear)
            front=rear=-1;
        else{
            if(rear==0)
                rear=size-1;
            else
                rear=rear-1;
        }
    }

    void display(){
        if(front==-1){
            System.out.println("dq is empty");
            return;
        }
        int left=front, right = rear;

        if(left<=right){
            while(left<=right)
                System.out.print(DQ[left++]+" ");
        }
        else{
            while(left<=size-1)
                System.out.print(DQ[left++]+" ");
            left = 0;
            while(left<=right)
                System.out.print(DQ[left++]+" ");
        }
        System.out.println();
    }
}

public class Queue5 {
    public static void main(String[] args) {
        DQArrays dq = new DQArrays();
        dq.insertAtRear(111);
        dq.insertAtRear(222);
        dq.insertAtRear(333);
        dq.display();
        dq.insertAtFront(777);
        dq.insertAtFront(888);
        dq.insertAtFront(999);
        dq.display();
        dq.deleteFromFront();
        dq.display();
        dq.deleteFromRear();
        dq.display();
    }
}
