package LinkedList;

public class CSLL {
    Node tail;
    int size = 0;

    class Node{
        int value;
        Node next;

        Node(int value, Node next){
            this.value = value;
            this.next = next;
        }
    }

    void print(){
        if(size==0){
            System.out.println("CSLL is empty");
            return;
        }
        Node temp = tail.next;
        while(temp!=tail){
            System.out.print(temp.value+ " => ");
            temp = temp.next;
        }
        System.out.println(temp.value);
    }

    void addHead(int value){
        Node temp = new Node(value, null);
        if(size==0){
            tail = temp;
            temp.next = temp;
        }
        else{
            temp.next = tail.next;
            tail.next = temp;
        }
        size++;
    }

    void addTail(int value){
        Node temp = new Node(value, null);
        if(size == 0){
            tail = temp;
            temp.next = temp;
        }
        else{
            temp.next = tail.next;
            tail.next = temp;
            tail = temp;
        }
        size++;
    }

    void addPos(int pos, int value){
        Node newNode = new Node(value, null);
        if(pos<1 || pos>=size){
            System.out.println("Out of range");
            return;
        }

        if(size==0){
            tail = newNode;
            newNode.next = newNode;
        }
        else{
            if(pos==0){
                Node temp = tail.next;
                newNode.next = temp;
                tail.next = newNode;
                return;
            }
            Node temp = tail.next;
            int i=0;
            while(temp.next!=tail && i<pos-1){
                temp = temp.next;
                i++;
            }
            newNode.next = temp.next;
            temp.next = newNode;
        }
        size++;
    }

    void removeHead(){
        if(size==0){
            System.out.println("CSLL is empty");
            return;
        }
        if(tail==tail.next)
            tail = null;
        else
            tail.next = tail.next.next;
        size--;
    }

    void removeTail(){
        if(size==0){
            System.out.println("CSLL is empty");
            return;
        }
        if(tail==tail.next)
            tail = null;
        else{
            Node temp = tail.next;
            while(temp.next!=tail)
                temp = temp.next;
            temp.next = tail.next;
            tail = temp;
        }
        size--;
    }

    void deleteElement(int value){
        if(size == 0){
            System.out.println("CSLL is empty");
            return;
        }
        Node prev = tail;
        Node currNode = tail.next;
        Node head = tail.next;
        if(currNode.value==value){
            if(currNode==currNode.next)
                tail = null;
            else
                tail.next = tail.next.next;
            return;
        }
        prev = currNode;
        currNode = currNode.next;
        while (currNode!=head) {
            if(currNode.value == value){
                if(currNode == tail)
                    tail = prev;
                prev.next = currNode.next;
                return;
            }
            prev = currNode;
            currNode = currNode.next;
        }
        return;
    }

    boolean search(int value){
        Node temp = tail;
        for(int i=0;i<size;i++){
            if(temp.value==value)
                return true;
            temp = temp.next;
        }
        return false;
    }


    public static void main(String[] args) {
        CSLL list = new CSLL();

        list.addHead(111);
        list.addHead(222);
        list.addHead(333);
        list.print();

        list.addTail(555);
        list.addTail(444);
        list.print();

        list.addPos(4, 666);
        list.print();

        list.removeHead();
        list.print();
        list.removeTail();
        list.print();
        list.deleteElement(555);
        list.print();
        System.out.println(list.search(111));
         
    }
}
