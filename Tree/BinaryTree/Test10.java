
// max element

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
class BT8{
	Node root;
	BT8(){
		root = null;
	}
	void inOrder(Node node){
		if(node==null)
			return;
		inOrder(node.left);
		System.out.print(node.data+" ");
		inOrder(node.right);
	}

    public static int maxElement(Node node){
        int max, left,right;
        if(node == null)
            return Integer.MIN_VALUE;
        max = node.data;
        left = maxElement(node.left);
        right = maxElement(node.right);
        if(left>max)
            max = left;
        if(right>max)
            max = right;
        return max;
    }

}


public class Test10 {
    public static void main(String[] args) 
	{
		BT8 obj = new BT8();
		obj.root = new Node(7);
		obj.root.left = new Node(1);
		obj.root.right = new Node(2);
		obj.root.left.left = new Node(3);
		obj.root.left.right = new Node(4);
		obj.root.left.left.left = new Node(5);
        
		System.out.println(BT8.maxElement(obj.root));

	}
}
