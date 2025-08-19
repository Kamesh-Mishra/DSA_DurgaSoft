package Tree.AVLTree;

// AVL Trees
// ---------
// => AVL trees are self-balancing trees.
// => Balance factor (bf) of an AVL tree is always -1, 0, +1.
// => Balance Factor (BF) = height(left sub-tree) - height(right sub-tree)
// => |HL - HR| < 2
// => BF = 0 or BF = -1 or BF = +1 , then it is balanced tree (AVL Tree).


// AVL Trees:
// ----------
// LL case---> Right Rotation
// LR case --> Left Rotation, Right Rotation
// RR case --> Left Rotation
// RL case --> Right Rotation, Left Rotation

class Node{
    int data;
    int ht;
    Node left;
    Node right;

    Node(int data){
        this.data = data;
        this.left = null;
        this.right = null;
        this.ht = 1;
    }
}

class AVLTree{
    static Node root;

    AVLTree(){
        root = null;
    }

    static int height(Node node){
        if(node == null)
            return 0;
        return node.ht;
    }

    static int getBalance(Node node){
        // balance factor HL-HR
        if(node == null)
            return 0;
        return height(node.left)-height(node.right);
    }

    static void insert(int value){
        root = insert(root, value);
    }

    static Node insert(Node node, int value){
        if(node == null)
            return new Node(value);
        
        if(value < node.data)
            node.left = insert(node.left, value);
        
        else if(value > node.data)
            node.right = insert(node.right, value);
        
        else
            return node;    //duplicate nodes


        // balancing
        node.ht = 1 + Math.max(height(node.left), height(node.right));
        int bf = getBalance(node);
        if(bf > 1 && value < node.left.data){  // LL case
            return rightRotation(node);
        }
        if(bf < -1 && value > node.right.data){ // RR case
            return leftRotation(node);
        }
        if(bf > 1 && value > node.left.data){   // LR case
            node.left = leftRotation(node.left);
            return rightRotation(node);
        }
        if(bf < -1 && value < node.right.data){ //RL case
            node.right = rightRotation(node.right);
            return leftRotation(node);
        }
        return node;
    }

    static void delete(int value){
        root = delete(root, value);
    }

    static Node delete(Node node, int value){
        if(node.data < value)
            node.right = delete(node.right, value);
        
        else if(node.data > value)
            node.left = delete(node.left, value);

        else{
            if(node.left == null && node.right == null)  // case1 : no child
                return null;
            if(node.left == null)  // case2: one child (right)
                return node.right;
            else if(node.right == null) //case2: one child(left)
                return node.left;
            Node is = findInOrderSuccessor(node.right);
            node.data = is.data;
            node.right = delete(node.right, is.data);
        }

        if(node==null)
            return node;
        
        node.ht = Math.max(height(node.left), height(node.right))+1;
        int bf=getBalance(node);
        if(bf > 1 && getBalance(node.left) >= 0)
            return rightRotation(node);
        if(bf > 1 && getBalance(node.left) < 0 ){
            node.left = leftRotation(node.left);
            return rightRotation(node);
        }
        if(bf < -1 && getBalance(node.right) <= 0)
            return leftRotation(node);
        
        if(bf < -1 && getBalance(node.right) > 0){
            node.right = rightRotation(node.right);
            return leftRotation(node);
        }
        return node;
    }

    static Node findInOrderSuccessor(Node node){
        while(node.left!=null)
            node = node.left;
        return node;
    }

    static void preOrder(Node node){
        if(node == null)
            return;
        System.out.print(node.data+" ");
        preOrder(node.left);
        preOrder(node.right);
    }

    static Node rightRotation(Node y){
        Node x = y.left;
        Node T = x.right;
        x.right = y;
        y.left = T;
        x.ht = 1+Math.max(height(x.left), height(x.right));
        y.ht = 1+Math.max(height(y.left),height(y.right));
        return x;
    }

    static Node leftRotation(Node x){
        Node y = x.right;
        Node T = y.left;
        y.left = x;
        x.right = T;
        x.ht = 1+ Math.max(height(x.left), height(x.right));
        y.ht = 1+ Math.max(height(y.left), height(y.right));
        return y;
    }
}
public class Test {
    public static void main(String[] args) {
        AVLTree obj = new AVLTree();
        AVLTree.insert(10);
        AVLTree.insert(20);
        AVLTree.insert(30);
        AVLTree.insert(40);
        AVLTree.insert(50);
        AVLTree.insert(25);
        AVLTree.preOrder(obj.root);
    }
}
