package Queue;

// deque implementation by using linked list

class DequeList{
    Node front,rear;
    int size;   // number of element is deque

    DequeList(){
        front = null;
        rear = null;
        size = 0;
    }

    class Node{
        int data;
        Node next;

        Node(int data, Node next){
            this.data = data;
            this.next = next;
        }
    }

    void insertAtFront(int value){
        Node newNode = new Node(value, null);
        if(front == null){
            front = newNode;
            rear = newNode;
            return;
        }
        newNode.next = front;
        front = newNode;
    }

    void insertAtRear(int value){
        Node newNode = new Node(value, null);
        if(front==null){
            front = newNode;
            rear = newNode;
            return;
        }
        rear.next = newNode;
        rear = newNode;
    }

    void deleteFromFront(){
        if(front==null){
            System.out.println("dq is empty");
            return;
        }
        System.out.println("deleted obj is: "+front.data);
        front = front.next;
        size--;
    }

    void deleteFromRear(){
        if(front==null){
            System.out.println("dq is empty");
            return;
        }
        System.out.println("deleted obj is: "+rear.data);
        size--;
        if(front==rear){
            front=null;
            rear=null;
            return;
        }
        Node temp = front;
        while (temp.next!=rear)
            temp = temp.next;
        rear = temp;
        rear.next = null;
    }

    void display(){
        if(front==null){
            System.out.print("dq is empty");
            return;
        }
        Node temp = front;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println();
    }
}

public class Queue6 {
    public static void main(String[] args) {
        DequeList dq = new DequeList();
        dq.insertAtFront(333);
        dq.insertAtFront(222);
        dq.insertAtFront(111);
        dq.display();
        dq.insertAtRear(444);
        dq.insertAtRear(555);
        dq.insertAtFront(999);
        dq.display();
        dq.deleteFromFront();
        dq.display();
        dq.deleteFromRear();
        dq.display();
    }
}
