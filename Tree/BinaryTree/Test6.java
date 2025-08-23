
// count nodes
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

class BT4{
	Node root;
	BT4(){
		root = null;
	}
	void inOrder(Node node){
		if(node==null)
			return;
		inOrder(node.left);
		System.out.print(node.data+" ");
		inOrder(node.right);
	}
	
	public static int countNodes(Node node){
		if(node==null)
			return 0;
		int ln = countNodes(node.left);
		int rn = countNodes(node.right);
		return ln+rn+1;
	}
}
public class Test6 {
    public static void main(String[] args) {
        BT4 obj = new BT4();
		obj.root = new Node(1);
		obj.root.left = new Node(2);
		obj.root.right = new Node(3);
		obj.root.left.left = new Node(4);
		obj.root.left.right = new Node(5);
		obj.root.right.left = new Node(6);
		obj.root.right.right = new Node(7);
        obj.inOrder(obj.root);
        System.out.println();
        System.out.println(BT4.countNodes(obj.root));
    }
}
