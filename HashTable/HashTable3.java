package HashTable;

// quadratic probing & implementation
// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

// linear ----> compute1(index) ---> index
// quadratic--> compute2(index) ---> index*index
class HashT{
    int size;
    int a[];

    HashT(int size){
        this.size = size;
        a = new int[this.size];
        for(int i = 0; i< this.size; i++)
            a[i]= -1;
    }

    void print(){
        System.out.println("content of HashTable: ");
        for(int i=0;i<size; i++)
            System.out.println(i +" ===> "+a[i]);
    }

    int compute(int value){
        return value%size;
    }

    int compute2(int index){
        return index*index;   // quadratic probing
    }

    boolean add(int value){
        int hcode = compute(value);
        for(int i=0; i<size; i++){
            if(a[hcode]== -1){
                a[hcode]=value;
                return true;
            }
            hcode = hcode + compute2(i);
            hcode = hcode % size;
        }
        return false;
    }

    boolean delete(int value){
        int hcode = compute(value);
        for(int i=0; i<size; i++){
            if(a[hcode]!= -1 && a[hcode]==value){
                a[hcode] = -1;
                return true;
            }
            hcode = hcode + compute2(i);
            hcode = hcode % size;
        }
        return false;
    }

    boolean search(int value){
        int hcode = compute(value);
        for(int i=0;i<size; i++){
            if(a[hcode]==value)
                return true;
            hcode = hcode + compute2(i);
            hcode = hcode%size;   
        }
        return false;
    }

}

public class HashTable3 {
    public static void main(String[] args) {
        HashT h = new HashT(10);
        h.add(5);
        h.add(15);
        h.add(25);
        h.add(35);
        h.add(45);
        h.print();
        System.out.println(h.search(15));
        System.out.println(h.search(35));
        System.out.println(h.search(45));
        h.delete(15);
        h.print();
    }
}
