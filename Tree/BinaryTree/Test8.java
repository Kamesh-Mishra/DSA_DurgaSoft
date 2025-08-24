
// height


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
class BT6{
	Node root;
	BT6(){
		root = null;
	}
	void inOrder(Node node){
		if(node==null)
			return;
		inOrder(node.left);
		System.out.print(node.data+" ");
		inOrder(node.right);
	}


   public static int height(Node node){
    if(node == null)
        return 0;
    int lh = height(node.left);
    int rh = height(node.right);
    return Math.max(lh, rh)+1;

   }

}


public class Test8 {
    public static void main(String[] args) 
	{
		BT6 obj = new BT6();
		obj.root = new Node(7);
		obj.root.left = new Node(1);
		obj.root.right = new Node(2);
		obj.root.left.left = new Node(3);
		obj.root.left.right = new Node(4);
		obj.root.left.left.left = new Node(5);
        
		System.out.println(BT6.height(obj.root));
	}
}
