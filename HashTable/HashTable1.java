package HashTable;

// hashtable
// ~~~~~~~~~
// => hashtable is a data structure that maps keys to the values.
// => each position of the hashtable is called as slot or bucket.
// => the hashtable uses hash function to calculate an index of a value.(insert/delete/search)

// the process of storing data using hash function in a hash table as follows

// 1) create an array of size 'N'. this array is called as hashtable.
// 2) find the hashcode of the given data by using hash function.
// 3) take modulo of hash code with table size to get index of array to store the data.
// 4) finally store this data in the position that we calculated.

// operations 
// ~~~~~~~~~~
// 1) insertion 
// 2) deletion
// 3) search for data

class HashTable{
    int size;
    int a[];

    HashTable(int size){
        this.size = size;
        a = new int[this.size];
        for(int i=0;i<this.size;i++)
            a[i] = -1;
    }

    void print(){
        System.out.println("content of hash table : ");
        for(int i=0; i<size; i++)
            System.out.println(i+" ===> "+a[i]);
    }

    int compute(int value){
        return value%size;
    }

    boolean add(int value){
        int hcode = compute(value);
        if(a[hcode] == -1){
            a[hcode]=value;
            return true;
        }
        return false;
    }

    boolean delete(int value){
        int hcode = compute(value);
        if(a[hcode] == value && a[hcode]==value){
            a[hcode] = -1;
            return true;
        }
        return false;
    }

    boolean search(int value){
        int hcode = compute(value);
        if(a[hcode]== value)
            return true;
        return false;
    }

}

public class HashTable1 {
    public static void main(String[] args) {
        HashTable h = new HashTable(10);
        h.print();
        System.out.println(h.add(23));
        System.out.println(h.add(24));
        System.out.println(h.add(33));
        System.out.println(h.add(50));
        System.out.println(h.add(105));
        System.out.println(h.add(177));
        System.out.println(h.add(777));
        System.out.println(h.add(999));
        h.print();
        System.out.println(h.delete(33));   
        System.out.println(h.delete(23));
        System.out.println(h.delete(100));
        h.print();
        System.out.println(h.search(23));
        System.out.println(h.search(999));
        System.out.println(h.search(100));
    }    
}
