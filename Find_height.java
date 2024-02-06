

public class Find_height {
	static class Node{
		int data;
		Node left;
		Node right;
		public Node(int data) {
			this.data=data;
		}
	}
	public static void main(String[] args) {
		Node root=new Node(1);
		root.left=new Node(2);
		root.right=new Node(3);
		root.left.left=new Node(4);
		root.left.right=new Node(5);
		
		System.out.println("Maximun height of binary tree is: "+findheight(root));
	}
	private static int findheight(Node n) {
			if(n==null) {
				return 0;
			}
			int lh=findheight(n.left);
			int rh=findheight(n.right);
			
		return 1+(Math.max(lh,rh));
	}

}
