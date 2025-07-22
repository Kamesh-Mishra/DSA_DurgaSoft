package LinkedList;

// adding an node at begining, ending, deleting node from the begin, end, printing


class LL {

    Node head;
    class Node {
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    void printList(){
        if(head==null){
            System.out.println("List is empty");
            return;
        }
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data + " => ");
            temp = temp.next;
        }
        System.out.println("Null");
    }


    void addFirst(int data){
        Node newNode = new Node(data);
        if(head==null){
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    void addLast(int data){
        Node newNode = new Node(data);
        if(head==null){
            head = newNode;
            return;
        }
        Node temp = head;
        while(temp.next!=null)
            temp = temp.next;
        temp.next = newNode;
    }

    void deleteFirst(){ 
        if (head==null) {
            System.out.println("List is empty");
            return;
        }
        head = head.next;
    }

    void deleteLast(){
        if(head==null){
            System.out.println("List is empty");
            return;
        }
        if(head.next==null){
            head=null;
            return;
        }
        Node temp1,temp2;

        temp1 = head;
        temp2 = head.next;
        while(temp2.next != null){
            temp2 = temp2.next;
            temp1 = temp1.next;
        }
        temp1.next = null;
    }

    
}

public class LL1 {
    public static void main(String[] args) {
        

        LL list = new LL();
        System.out.println(list.head);
        list.printList();

        System.out.println("***************************");

        list.addFirst(111);
        System.out.println(list.head);
        list.printList();

        System.out.println("***************************");

        list.addLast(222);
        list.printList();

        
        System.out.println("***************************");

        list.deleteFirst();
        list.printList();

        System.out.println("***************************");

        list.addLast(999);
        list.printList();
        list.deleteLast();
        list.printList();

        System.out.println("**************************");

        list.addLast(333);
        list.addLast(444);
        list.addLast(555);
        list.addLast(666);
        list.addLast(777);
        list.printList();

        System.out.println(list.head.next.data);
        System.out.println(list.head.next.next.data);

    }
}
