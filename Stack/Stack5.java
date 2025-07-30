package Stack;

import java.util.Stack;

// case3: to hold student class objects

class Student{
    int sid;
    String name;

    Student(int sid, String name){
        this.sid = sid;
        this.name = name;
    }

    public String toString(){
        return "("+sid+","+name+")";
    }
}

public class Stack5 {
    public static void main(String[] args) {
        Stack<Student> s = new Stack<Student>();

        Student s1 = new Student(444,"BBB");
		Student s2 = new Student(111,"AAA");
		Student s3 = new Student(555,"EEE");
		Student s4 = new Student(333,"DDD");
		Student s5 = new Student(222,"XXX");

        s.push(s1);
        s.push(s2);
        s.push(s3);
        s.push(s4);
        s.push(s5);

        System.out.println(s);
    }
}
