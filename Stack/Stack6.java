package Stack;


// toString() method implementation for stack class

class StackLL{
    Node head = null;
    int size = 0;

    class Node{
        int value;
        Node next;

        Node(int value, Node next){
            this.value = value;
            this.next = next;
        }
    }


    int getSize(){
        return this.size;
    }

    boolean isEmpty(){
        return size==0;
    }

    void print(){
        Node temp = head;
        if(isEmpty()){
            System.out.println("Stack is empty");
            return;
        }
        while(temp!=null) {
            System.out.println(temp.value+" ");
            temp = temp.next;
        }
        System.out.println();
    }

    void push(int value){
        head = new Node(value, head);
        size++;
    }

    int peek(){
        if(isEmpty())
            return -1;
        else
            return head.value;
    }

    int pop(){
        if(isEmpty()){
            System.out.println("Stack is under flow");
            return -1;
        }
        else{
            int temp = head.value;
            head = head.next;
            return temp;
        }
    }

   
    public String toString(){
        Node temp = head;
        StringBuffer sb = new StringBuffer();
        sb.append("[");
        while (temp!=null) {
            if(temp.next!=null)
                sb.append(temp.value+", ");
            else
                sb.append(temp.value);
            temp = temp.next;
        }
        sb.append("]");
        return sb.toString();
    }

   
}


public class Stack6 {
    public static void main(String[] args) {
        StackLL sl = new StackLL();
		sl.push(111);
		sl.push(222);
		sl.push(333);
		sl.push(444);

        sl.print();
		System.out.println(sl.toString());

		
    }
}
