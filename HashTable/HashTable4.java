package HashTable;

// separate chaining & implementation
// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

// In collision handling method chaining is a concept which 
// introduces an additional field data. i.e. chain. A seperate 
// chain table is maintained for colliding objects, when 
// collision occurrs then a linked list (chain) is maintained
//  at the home bucket.

class HT{
    int size;
    Node a[];

    class Node{
        int value;
        Node next;

        Node(int value, Node next){
            this.value = value;
            this.next = next;
        }
    }

    HT(int size){
        this.size = size;
        a = new Node[this.size];
        for(int i=0; i<size; i++)
            a[i] = null;
    }

    void print(){
        System.out.println("content of HashTable: ");
        for(int i=0; i<size; i++){
            Node head = a[i];
            while (head!=null) {
                System.out.print(head.value+" => ");
                head = head.next;
            }
            System.out.println("null");
        }
    }

    int compute(int value){
        return value%size;
    }

    void add(int value){
        int hcode = compute(value);
        a[hcode] = new Node(value, a[hcode]);
    }

    boolean delete(int value){
        int hcode = compute(value);
        Node nextNode; 
        Node head = a[hcode];
        if(head != null && head.value == value){
            a[hcode] = head.next;
            return true;
        }
        while (head != null) {
            nextNode = head.next;
            if(nextNode != null && nextNode.value == value){
                head.next = nextNode.next;
                return true;
            }
            else
                head = nextNode;
        }
        return false;
    }

    boolean search(int value){
        int hcode = compute(value);
        Node head = a[hcode];
        while(head!=null){
            if(head.value == value)
                return true;
            head = head.next;
        }
        return false;
    }


}

public class HashTable4 {
    public static void main(String[] args) {
        HT h = new HT(10);
        h.add(13);
        h.add(14);
        h.add(15);
        h.add(16);
        h.add(19);
        h.add(23);
        h.add(33);
        h.add(43);
        h.add(333);
        h.print();
        System.out.println(h.search(333));
        System.out.println(h.search(999));
        System.out.println(h.delete(333));
        h.print();
    }
}
