
public class postorder_traversal {
	static class Node{
		int data;
		Node left;
		Node right;
		public Node(int key) {
			this.data=key;
		}
	}
	public static void main(String[] args) {
		Node root=new Node(1);
		root.left=new Node(2);
		root.right=new Node(3);
		root.left.left=new Node(4);
		root.left.right=new Node(5);
		
		postorder(root);

	}
	private static void postorder(Node n) {
		if(n==null) {
			return;
		}
		postorder(n.left);
		postorder(n.right);
		System.out.print(n.data+" ");
		
	}

}
