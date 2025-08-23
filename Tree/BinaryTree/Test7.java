
// sum of nodes

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
class BT5{
	Node root;
	BT5(){
		root = null;
	}
	void inOrder(Node node){
		if(node==null)
			return;
		inOrder(node.left);
		System.out.print(node.data+" ");
		inOrder(node.right);
	}


    public static int sumOfNodes(Node node){
        if(node == null)
            return 0;
        int ls = sumOfNodes(node.left);
        int rs = sumOfNodes(node.right);
        return ls+rs+node.data;
    }

}


public class Test7 {
    public static void main(String[] args) 
	{
		BT5 obj = new BT5();
		obj.root = new Node(7);
		obj.root.left = new Node(1);
		obj.root.right = new Node(2);
		obj.root.left.left = new Node(3);
		obj.root.left.right = new Node(4);
		obj.root.left.left.left = new Node(5);
        
		System.out.println(BT5.sumOfNodes(obj.root));
	}
}
