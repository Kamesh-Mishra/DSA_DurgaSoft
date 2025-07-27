package Stack;


// implementation of stack using arrays

class StackArray{
    int size = 5;
    int[] data;
    int top = -1;

    StackArray(){
        data = new int[size];
    }

    boolean isEmpty(){
        return top==-1;
    }

    int getSize(){
        return top+1;
    }

    void print(){
        if(isEmpty()){
            System.out.println("Stack under flow");
            return;
        }
        else{
            for(int i=0; i<=top;i++)
                System.out.print(data[i]+" ");
            System.out.println();
        }
    }

    void push(int value){
        if(getSize()==data.length){
            System.out.println("stack over flow");
            return;
        }
        else{
            top++;
            data[top] = value;
        }
    }

    int pop(){
        if(isEmpty()){
            System.out.println("stack is under flow");
            return -1;
        }
        else{
            int value = data[top];
            top--;
            return value;
        }
    }
    int peek(){
        if(isEmpty()){
            System.out.println("stack is under flow");
            return -1;
        }
        else
            return data[top];
    }

    boolean search(int value){
        if(isEmpty()){
            System.out.println("under flow");
            return false;
        }
        else{
            for(int i=0;i<=top;i++){
                if(data[i]==value)
                    return true;
            }
            return false;
        }
    }


}


public class Stack1 {
    public static void main(String[] args) {
        StackArray s = new StackArray();

        System.out.println("IsEmpty : "+s.isEmpty());

        System.out.println("SIZE: "+s.getSize());
        s.print();

        System.out.println("*******************");

        s.push(111);
        s.push(222);
        s.push(333);
        s.push(444);
        s.push(555);

        System.out.println("IsEmpty : "+s.isEmpty());

        System.out.println("SIZE: "+s.getSize());
        s.print();

        System.out.println(s.pop());
        s.print();

        System.out.println(s.peek());

        System.out.println(s.search(111));

        
    }
}
