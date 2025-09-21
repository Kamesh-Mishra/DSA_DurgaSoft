

// copy of tree

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
class BT10{
	Node root;
	BT10(){
		root = null;
	}
	
    public static void levelOrderTraversal(Node node){
		if(node==null)
			return;
		Queue<Node> q = new LinkedList<>();
		q.add(node);
		q.add(null);
		while(!q.isEmpty()){
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
				if(cur.left!=null)
					q.add(cur.left);
				if(cur.right!=null)
					q.add(cur.right);
			}
		}
	}

    public static Node copyTree(Node node){
        Node temp;
        if(node != null){
            temp = new Node(node.data);
            temp.left = copyTree(node.left);
            temp.right = copyTree(node.right);
            return temp;
        }
        else    
            return null;
    }

    

}


public class Test12 {
    public static void main(String[] args) 
	{
		BT10 obj1 = new BT10();
		obj1.root = new Node(1);
		obj1.root.left = new Node(2);
		obj1.root.right = new Node(3);

		BT10 obj2 = new BT10();
		obj2.root = BT10.copyTree(obj1.root);
		BT10.levelOrderTraversal(obj1.root);
        System.out.println();
		BT10.levelOrderTraversal(obj2.root);
	}
}

