package HashTable;

// collisions
// ~~~~~~~~~~~~~~

// When a hash function generates the same index/hcode for the
//  two or more different keys, this problem is called as 
//  collision. a hash function should return unique address 
//  for each key. but practically it is not possible.



// collision resolution methods
// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

// Hash collisions are practically unavoidable when hashing
//  large number of values. the following are the techniques 
//  that are used to find the alternative location in the hash 
//  table for the given objects.


// 1) linear probing
// 2) quadratic probing
// 3) seperate chaining

// linear probing & implementation
class HashTablee{
    int size;
    int a[];

    HashTablee(int size){
        this.size = size;
        a = new int[this.size];
        for(int i=0; i<this.size; i++)
            a[i] = -1;
    }

    void print(){
        System.out.println("Content of HashTable: ");
        for(int i=0;i<size;i++)
            System.out.println(i+" ===> "+a[i]);
    }

    int compute(int value){
        return value%size;
    }

    int compute1(int index){
        return index;    // Linear Probing
    }

    boolean add(int value){
        int hcode = compute(value);
        for(int i=0;i<size;i++){
            if(a[hcode] == -1){
                a[hcode] = value;
                return true;
            }
            hcode = hcode + compute1(i);
            hcode = hcode%size;
        }
        return false;
    }

    boolean delete(int value){
        int hcode = compute(value);
        for(int i=0; i<size; i++){
            if(a[hcode]!= -1 && a[hcode] == value){
                a[hcode] = -1;
                return true;
            }
            hcode = hcode+ compute1(i);
            hcode = hcode % size;
        }
        return false;
    }

    boolean search(int value){
        int hcode = compute(value);
        for(int i = 0; i< size; i++){
            if(a[hcode] == value)
                return true;
            hcode = hcode + compute1(i);
            hcode = hcode % size;
        }
        return false;
    }


}



public class HashTable2 {
    public static void main(String[] args) {
        HashTablee h = new HashTablee(10);
        System.out.println(h.add(3));
        System.out.println(h.add(13));
        System.out.println(h.add(23));
        System.out.println(h.add(33));
        System.out.println(h.add(43));
        System.out.println(h.add(53));
        System.out.println(h.add(63));
        h.print();
        System.out.println(h.search(43));
        System.out.println(h.search(93));
        h.delete(23);
        h.print();
    }
}
