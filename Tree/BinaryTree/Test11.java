

// min element




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
class BT9{
	Node root;
	BT9(){
		root = null;
	}
	void inOrder(Node node){
		if(node==null)
			return;
		inOrder(node.left);
		System.out.print(node.data+" ");
		inOrder(node.right);
	}

    public static int minElement(Node node){
        int min, left,right;
        if(node == null)
            return Integer.MAX_VALUE;
        min = node.data;
        left = minElement(node.left);
        right = minElement(node.right);
        if(left<min)
            min = left;
        if(right<min)
            min = right;
        return min;
    }

}


public class Test11 {
    public static void main(String[] args) 
	{
		BT9 obj = new BT9();
		obj.root = new Node(7);
		obj.root.left = new Node(1);
		obj.root.right = new Node(2);
		obj.root.left.left = new Node(3);
		obj.root.left.right = new Node(4);
		obj.root.left.left.left = new Node(5);
        
		System.out.println(BT9.minElement(obj.root));

	}
}

