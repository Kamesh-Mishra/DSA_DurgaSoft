
// search

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
class BT7{
	Node root;
	BT7(){
		root = null;
	}
	void inOrder(Node node){
		if(node==null)
			return;
		inOrder(node.left);
		System.out.print(node.data+" ");
		inOrder(node.right);
	}

    public static boolean search(Node node, int data){
        if(node==null)
            return false;
        if(node.data == data)
            return true;
        if(search(node.left, data))
            return true;
        if(search(node.right, data))
            return true;
        return false;
    }

}


public class Test9 {
    public static void main(String[] args) 
	{
		BT7 obj = new BT7();
		obj.root = new Node(7);
		obj.root.left = new Node(1);
		obj.root.right = new Node(2);
		obj.root.left.left = new Node(3);
		obj.root.left.right = new Node(4);
		obj.root.left.left.left = new Node(5);
        
		System.out.println(BT7.search(obj.root,2));
		System.out.println(BT7.search(obj.root,9));

	}
}
