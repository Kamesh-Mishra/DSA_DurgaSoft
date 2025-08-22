

// level order traversal

import java.util.LinkedList;
import java.util.Queue;

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

class BT3{
    Node root;

    BT3(){
        root = null;
    }

    public static void levelOrderTraversal(Node node){
        if(node == null)
            return;
        Queue<Node> q = new LinkedList<>();
        q.add(node);
        q.add(null);

        while (!q.isEmpty()) {
            Node cur = q.remove();
            if(cur==null){
                System.out.println();
                if(q.isEmpty())
                    break;
                else
                    q.add(null);
            }
            else{
                System.out.print(cur.data+" ");
                if(cur.left != null)
                    q.add(cur.left);
                if(cur.right != null)
                    q.add(cur.right);
            }
        }
    }
}
public class Test5 {
    public static void main(String[] args) {
        BT3 obj = new BT3();
		obj.root = new Node(1);
		obj.root.left = new Node(2);
		obj.root.right = new Node(3);
		obj.root.left.left = new Node(4);
		obj.root.left.right = new Node(5);
		obj.root.right.left = new Node(6);
		obj.root.right.right = new Node(7);
		System.out.println("Level Order Traversal ");
		BT3.levelOrderTraversal(obj.root);
    }
}
