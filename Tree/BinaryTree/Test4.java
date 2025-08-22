
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

class BT2{
    Node root;
    BT2(){
        root = null;
    }

    void preOrder(Node node){ //DLR
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
	void postOrder(Node node){
		if(node==null)
			return;
		postOrder(node.left);
		postOrder(node.right);
		System.out.print(node.data+" ");
	}
}

public class Test4 {
    public static void main(String[] args) {
        BT2 obj = new BT2();
		obj.root = new Node(1);
		obj.root.left = new Node(2);
		obj.root.right = new Node(3);
		obj.root.left.left = new Node(4);
		obj.root.left.right = new Node(5);
		System.out.print("InOrder Traversal ===> ");
		obj.inOrder(obj.root);
		System.out.println();
		System.out.print("PreOrder Traversal ===> ");
		obj.preOrder(obj.root);
		System.out.println();
		System.out.print("PostOrder Traversal ===> ");
		obj.postOrder(obj.root);
		System.out.println();
    }
}
