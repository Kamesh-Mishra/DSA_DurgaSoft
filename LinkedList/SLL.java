package LinkedList;

public class SLL {

    Node head;
    int size;

    class Node { 
        
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
            size++;
        }

        Node(int data, Node temp){
            this.data = data;
            this.next = temp;
            size++;
        }
    }

    int getSize(){
        return this.size;
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
        Node currNode = head;
        while(currNode.next != null)
            currNode = currNode.next;
        currNode.next = newNode;
    }

    //8
    void addPos(int data, int pos){
        int i=0;
        Node newNode = new Node(data);

        if(head == null){
            head = newNode;
            return;
        }
        
        if(pos != 0){
            Node currNode = head;
            Node prevNode = null;

            while(currNode!=null && i<pos){
                prevNode = currNode;
                currNode = currNode.next;
                i++;
            }
            prevNode.next = newNode;
            newNode.next = currNode;
        }
        else{
            newNode.next = head;
            head = newNode;
        }
    }

    void sortedInsertAsc(int data){
        Node newNode = new Node(data);
        Node currNode = head;
        if(currNode==null||currNode.data>data){
            newNode.next = head;
            head = newNode;
            return;
        }
        while(currNode.next!=null && currNode.next.data<data)
            currNode = currNode.next;
        newNode.next = currNode.next;
        currNode.next = newNode;
    }

    void sortedInsertDesc(int data){
        Node newNode = new Node(data);
        Node currNode = head;
        if(currNode==null || currNode.data<data){
            newNode.next = head;
            head = newNode;
            return;
        }
        while(currNode.next!=null && currNode.next.data>data){
            currNode = currNode.next;
        }
        newNode.next = currNode.next;
        currNode.next = newNode;
    }

    void printList(){
        if(head == null){
            System.out.println("List is empty!!");
            return;
        }
        Node currNode = head;
        while(currNode!=null){
            System.out.print(currNode.data+" => ");
            currNode = currNode.next;
            }
        System.out.println("null");
    }

    void deleteFirst(){
        if(head==null){
            System.out.println("List is empty");
            return;
        }
        size--;
        head=head.next;
    }

    void deleteLast(){
        if(head==null){
            System.out.println("list is empty");
            return;
        }
        if(head.next==null){
            head=null;
            return;
        }
        size--;
        Node temp1=head, temp2=head.next;
        while(temp2.next!=null){
            temp2 = temp2.next;
            temp1 = temp1.next;
        }
        temp1.next = null;
    }

    void deleteElement(int data){
        Node temp = head;
        if(temp==null){
            System.out.println("empty");
            return;
        }
        if(temp.data == data){
            head = head.next;
            size--;
            return;
        }
        while(temp.next!=null){
            if(temp.next.data == data){
                temp.next = temp.next.next;
                size--;
                return;
            }
            temp = temp.next;
        }
    }

    void deleteElements(int data){
        Node temp = head;
        if(temp==null){
            System.out.println("Empty");
            return;
        }
        if(temp.data == data){
            head = head.next;
            size--;
        }
        while(temp.next != null){
            if(temp.next.data == data){
                temp.next = temp.next.next;
                size--;
            }
            if(temp.next != null)
                temp = temp.next;
        }
    }

    void deleteElementAtPos(int pos){
        Node temp = head;
        int i =0;
        if(temp==null){
            System.out.println("Empty");
            return;
        }
        if(pos==0){
            head = head.next;
            size--;
            return;
        }
        while(temp.next!=null && i<pos){
            if(i==pos-1){
                temp.next = temp.next.next;
                size--;
                return;
            }
            i++;
            temp = temp.next;
        }
    }

    boolean search(int data){
        Node currNode = head;
        while(currNode!=null){
            if(currNode.data == data)
                return true;
            currNode = currNode.next;
        }
        return false;
    }

    void reverse(){
        Node curr = head;
        Node prev = null;
        Node next = null;

        while(curr!=null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
    }

    void reverseR(){
        head = reverseRUtil(head, null);
    }

    Node reverseRUtil(Node currNode, Node nextNode){
        Node res;
        if(currNode == null)
            return null;
        if(currNode.next == null){
            currNode.next = nextNode;
            return currNode;
        }
        res = reverseRUtil(currNode.next, currNode);
        currNode.next = nextNode;
        return res;
    }

    void removeDuplicates(){
        Node currNode = head;
        while(currNode!=null){
            if(currNode.next!=null && currNode.data == currNode.next.data)
                currNode.next = currNode.next.next;
            else    
                currNode = currNode.next;
        }
    }

    SLL copyReversedList(){
        Node temp1 = null;
        Node temp2 = null;
        Node currNode = head;
        while (currNode!=null) {
            temp2 = new Node(currNode.data, temp1);
            currNode = currNode.next;
            temp1 = temp2;
        }
        SLL obj = new SLL();
        obj.head = temp1;
        return obj;
    }

    SLL copyList(){
        Node headNode = null;
        Node tailNode = null;
        Node tempNode = null;
        Node currNode = head;

        if(currNode == null)
            return null;
        
        headNode = new Node(currNode.data, null);
        tailNode = headNode;
        currNode = currNode.next;
        while(currNode!= null){
            tempNode = new Node(currNode.data, null);
            tailNode.next = tempNode;
            tailNode = tempNode;
            currNode = currNode.next;
        }
        SLL obj = new SLL();
        obj.head = headNode;
        return obj;
    }

    boolean compareList1(SLL list){
        Node head1 = head;
        Node head2 = list.head;

        while(head1 != null && head2 != null){
            if(head1.data != head2.data)
                return false;
            head1 = head1.next;
            head2 = head2.next;
        }
        if (head1 == null && head2 == null)
            return true;
        
        return false;
    }

    boolean compareList2(SLL list){
        return compareList(head, list.head);
    }

    boolean compareList(Node head1, Node head2){
        if (head1 == null && head2 == null)
            return true;
        else if(head1 == null || head2 == null || (head1.data!=head2.data))
            return false;
        else
            return compareList(head1.next, head2.next);
    }

    int nthNodeFromBegin(int index){
		if(index>getSize() || index<1)
			return -1;
		int count=0;
		Node currNode = head;
		while(currNode!=null && count<index-1){
			count++;
			currNode=currNode.next;
		}
		return currNode.data;
	}
	int nthNodeFromEnd(int index){
		int size = getSize();
		int sindex;
		if(size!=0 && size<index)
			return -1;
		
        sindex = size-index+1;
		return nthNodeFromBegin(sindex);
	}











    public static void main(String[] args) {
        SLL list1 = new SLL();
		list1.addFirst(111);
		list1.addLast(222);
		list1.addLast(333);
		list1.addLast(444);
		list1.addLast(555);
		list1.addLast(666);
		list1.addLast(777);
		list1.addLast(888);
        
        list1.printList();
        System.out.println(list1.getSize());
        list1.addPos(999,8 );
        list1.printList();
        System.out.println(list1.getSize());

        System.out.println("**********************************************");

        SLL list2 = new SLL();

        list2.sortedInsertAsc(222);
        list2.sortedInsertAsc(111);
        list2.sortedInsertAsc(0);
        list2.sortedInsertAsc(555);
        list2.printList();

        SLL list3 = new SLL();
        list3.sortedInsertDesc(222);
        list3.sortedInsertDesc(111);
        list3.sortedInsertDesc(666);
        list3.sortedInsertDesc(555);
        list3.printList();

        
        System.out.println("**********************************");

        list3.printList();
        list3.deleteFirst();
        list3.printList();
        list3.deleteLast();
        list3.printList();
        list3.deleteElement(555);
        list3.printList();

        list3.addFirst(111);
        list3.addFirst(555);
        list3.addLast(666);
        list3.addFirst(888);
        list3.addFirst(555);
        list3.addFirst(111);
        list3.addFirst(555);
        list3.addLast(666);
        list3.addFirst(888);
        list3.addFirst(555);
        list3.printList();
        list3.deleteElements(555);
        list3.printList();
        list3.deleteElementAtPos(6);
        list3.printList();

        System.out.println("**********************************");

        list3.printList();
        System.out.println(list3.search(444));
        System.out.println(list3.search(888));

        list3.printList();
        list3.reverse();

        
        list3.printList();
        list3.reverseR();
        list3.printList();

        System.out.println("*************************************");


        SLL list4 = new SLL();
        list4.sortedInsertDesc(222);
        list4.sortedInsertDesc(111);
        list4.sortedInsertDesc(111);
        list4.sortedInsertDesc(111);
        list4.sortedInsertDesc(666);
        list4.sortedInsertDesc(555);
        list4.sortedInsertDesc(555);
        list4.sortedInsertDesc(555);
        list4.printList();
        list4.removeDuplicates();
        list4.printList();


        System.out.println("**********************************");

        list4.printList();
        SLL obj = list4.copyReversedList();
        obj.printList();
                
        list4.printList();
        SLL obj2 = list4.copyList();
        obj2.printList();

        System.out.println(list4.compareList1(obj2));

        System.out.println(list4.compareList2(obj2));

        System.out.println("**********************");
        
        list4.printList();
        System.out.println(list4.nthNodeFromBegin(4));
        
        
        SLL list5 = new SLL();
        list5.addFirst(222);
        list5.addFirst(444);
        list5.addFirst(777);
        list5.addFirst(888);
        list5.addFirst(999);
        list5.printList();
        System.out.println( list5.nthNodeFromEnd(3));
        
    }




}
