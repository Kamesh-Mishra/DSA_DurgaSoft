
// binary tree traversals
// ~~~~~~~~~~~~~~~~~~~~~~
// Traversing the tree means visiting each node exactly 
// one. basically there are three ways to traverse tree

// 1) Inorder (LDR)
// 2) Preorder (DLR)
// 3) Postorder (LRD)

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

class BT1{
    Node root;

    BT1(){
        root = null;
    }

    void preOrder(Node node){   //DLR
        if(node==null)
            return;
        System.out.print(node.data+" ");
        preOrder(node.left);
        preOrder(node.right);
    }

    void inOrder(Node node){
        if(node==null)
            return;
        inOrder(node.left);
        System.out.print(node.data+" ");
        inOrder(node.right);
    }

    void PostOrder(Node node){
        if(node==null)
            return;
        preOrder(node.left);
        preOrder(node.right);
        System.out.print(node.data+" ");
    }
}

public class Test3 {
    public static void main(String[] args) {
    BT1 obj = new BT1();
    obj.root = new Node(1);
    obj.root.left = new Node(2);
    obj.root.right = new Node(3);

    System.out.print("InOrder Traversal : ");
    obj.inOrder(obj.root);
    System.out.println();

    System.out.print("PreOrder Traversal : ");
    obj.preOrder(obj.root);
    System.out.println();

    System.out.print("PostOrder Traversal : ");
    obj.PostOrder(obj.root);
    System.out.println();
    }

}
