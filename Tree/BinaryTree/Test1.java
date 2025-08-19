


// Binary Tree
// ~~~~~~~~~~~
// A binary tree is a type of tree in which each node has
//  at most two children (0, 1 or 2) which are referred to as
//   the left child and right child.


// binary tree representation:
// ---------------------------
// There are two ways are there to represent binary trees

// 1) sequential representation
// 2) linked list representation

// construction of binary tree using sequential representation:
// ------------------------------------------------------------
// => pre order
// => post order
// => in order
// => level order





// build tree by using preoder

class BT{

    static int index = -1;
    class Node{
        int data;
        Node left;
        Node right;
    
        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    Node buildTree(int[] nodes){
        index++;
        if(nodes[index]==-1)
            return null;
        Node node = new Node(nodes[index]);
        node.left = buildTree(nodes);
        node.right = buildTree(nodes);
        return node;
    }
}
public class Test1 {
    public static void main(String[] args) {
        int[] nodes = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BT obj = new BT();
        System.out.println(obj.buildTree(nodes).data);
    }
}
