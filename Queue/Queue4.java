package Queue;


// circular queue implementation by using linked list

class CQList{
    Node front, rear;
    
    class Node{
        int data;
        Node next;

        Node(int data, Node next){
            this.data = data;
            this.next = next;
        }
    }

    void insert(int data){
        Node newNode = new Node(data,null);
        if(front==null)
            front = newNode;
        else
            rear.next = newNode;
        rear = newNode;
        rear.next = front;
    }

    void delete(){
        if(front == null){
            System.out.println("q is empty");
            return;
        }
        System.out.println("Deleted item is: "+front.data);
        if(front==rear){
            front=null;
            rear=null;
        }
        else{
            front = front.next;
            rear.next = front;
        }
    }

    void display(){
        Node temp = front;
        if(temp==null){
            System.out.println("q is empty");
            return;
        }
        while(temp.next!= front){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println(temp.data);
    }
}

public class Queue4 {
    public static void main(String[] args) {
        CQList q = new CQList();
        q.display();
        q.insert(111);
        q.insert(222);
        q.insert(333);
        q.insert(444);
        q.insert(555);
        q.display();
        q.delete();
        q.delete();
        q.display();
    }
    
}
