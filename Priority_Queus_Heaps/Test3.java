package Priority_Queus_Heaps;

import java.util.ArrayList;

// Heap


// Insertion and Deletion of element in heap
// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

public class Test3 {
    static class Heap{
        ArrayList<Integer> arr = new ArrayList<>();
        
        
        public void add(int data){
            // 1. add the data at end
            arr.add(data);

            // 2. fix heap
            int ci = arr.size()-1;
            int pi = (ci-1)/2;

            while(arr.get(ci)< arr.get(pi)){
                int temp = arr.get(ci);
                arr.set(ci, arr.get(pi));
                arr.set(pi, temp);
                ci = pi;
                pi = (ci-1)/2;
            }
        }

        public int remove(){
            int data = arr.get(0);
            
            // step 1: swap first and last
            int temp = arr.get(0);
            arr.set(0,arr.get(arr.size()-1));
            arr.set(arr.size()-1, temp);

            // step 2: delete last
            arr.remove(arr.size()-1);

            // step 3: heapify
            heapify(0);
            
            return data;
        }

        public void heapify(int index){
            int left = 2*index + 1;
            int right = 2*index + 2;
            int mi = index;
            if(left<arr.size() && arr.get(mi) > arr.get(left))
                mi = left;
            if(right<arr.size() && arr.get(mi) > arr.get(right))
                mi = right;
            if(index != mi){
                int temp = arr.get(index);
                arr.set(index,arr.get(mi));
                arr.set(mi, temp);
                heapify(mi);
            }
        }

        public int peek(){
            return arr.get(0);
        }

        public boolean isEmpty(){
            return arr.size() == 0;
        }

        public static void main(String[] args){
            Heap h = new Heap();
            h.add(3);
            h.add(4);
            h.add(1);
            h.add(5);
            while(!h.isEmpty()){
                System.out.println(h.peek());
                h.remove();
            }
        }
    }
}
