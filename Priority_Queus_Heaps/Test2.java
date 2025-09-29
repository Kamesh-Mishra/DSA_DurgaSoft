package Priority_Queus_Heaps;

import java.util.Collections;
import java.util.PriorityQueue;

class Student implements Comparable<Student>{
    int htno;
    String name;

    Student(int htno, String name){
        this.htno = htno;
        this.name = name;
    }

    public String toString(){
        return "["+this.htno+", "+this.name+"]";
    }

    public int compareTo(Student temp){
        return this.htno - temp.htno;
    }
}

public class Test2 {
    public static void main(String[] args) {
        
    // Ex3: sort the students based on htno in asc order
    // -------------------------------------------------
        PriorityQueue<Student> pq = new PriorityQueue<>();
		pq.add(new Student(1,"Prakash"));
		pq.add(new Student(4,"Raju"));
		pq.add(new Student(2,"Kiran"));
		pq.add(new Student(3,"Karan"));
		pq.add(new Student(9,"Abhi"));
		while(!pq.isEmpty()){
			System.out.println(pq.peek());//first most element
			pq.remove();//first element will be removed
		}

        System.out.println("*******************************************");

        // Ex4: sort the students based on htno in desc order
        // -------------------------------------------------

        PriorityQueue<Student> pq2 = new PriorityQueue<>(Collections.reverseOrder());
		pq2.add(new Student(1,"Prakash"));
		pq2.add(new Student(4,"Raju"));
		pq2.add(new Student(2,"Kiran"));
		pq2.add(new Student(3,"Karan"));
		pq2.add(new Student(9,"Abhi"));
		while(!pq2.isEmpty()){
			System.out.println(pq2.peek());//first most element
			pq2.remove();//first element will be removed
		}
    }
}
