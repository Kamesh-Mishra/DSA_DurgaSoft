class BT{
	static int index=-1;
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
	Node buildTree(int[] nodes){
		index++;
		if(nodes[index]==-1)
			return null;
		Node node = new Node(nodes[index]);
		node.left = buildTree(nodes);
		node.right = buildTree(nodes);
		return node;
	}
}

public class Test2 {
    public static void main(String[] args) {
        int[] nodes = {15,13,7,1,-1,-1,2,-1,-1,6,-1,-1,12,-1,-1};
		BT obj = new BT();
		// System.out.println(obj.buildTree(nodes).data);//15
		System.out.println(obj.buildTree(nodes).left.data);//13
		// System.out.println(obj.buildTree(nodes).right.data);//12
    }
}
