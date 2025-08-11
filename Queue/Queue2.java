package Queue;

// normal queue implementation by using linked list

class NQList{
    Node front, rear;
    int size;
    
    class Node{
        int data;
        Node next;

        Node(int data, Node next){
            this.data = data;
            this.next = next;
        }
    }

    NQList(){
        front = null;
        rear = null;
        size = 0;
    }

    void display(){
        if(size==0){
            System.out.println("q is empty");
            return;
        }
        Node temp = front;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println();
    }

    void insert(int value){
        Node newNode = new Node(value, null);
        if(front==null && rear==null){
            front = newNode;
            rear = newNode;
        }
        else{
            rear.next = newNode;
            rear = newNode;
        }
        size++;
    }

    void delete(){
        if(size==0){
            System.out.println("q is empty");
            return;
        }
        System.out.println("Deleted item is "+ front.data);
        front = front.next;
        size--;
    }

}

public class Queue2 {
    public static void main(String[] args) {
        NQList q = new NQList();
        q.display();
        q.insert(111);
        q.insert(222);
        q.insert(333);
        q.display();
        q.delete();
        q.display();
        q.delete();
        q.display();
        q.delete();
        q.display();
        
    }
}
