
public class treerepresentation {
	static class Node{
		int data;
		Node left;
		Node right;
		public Node(int key) {
			this.data=key;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node root=new Node(1);
		root.left=new Node(2);
		root.right=new Node(3);
		root.left.left=new Node(4);
		root.left.right=new Node(5);
	}

}
