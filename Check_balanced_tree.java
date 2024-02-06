

public class Check_balanced_tree {
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
	
		
		int pos=isbalanced(root);
		System.out.println(pos);
		if(pos==-1) {
			System.out.println("The tree is not a Balanced Tree.");
		}
		else {
			System.out.println("The tree is a Balanced Tree.");
		}
	}
	
	public static int isbalanced(Node root) {
		if(root==null) {
			return 0;
		}
		int lh=isbalanced(root.left);
		if(lh==-1) {
			return -1;
		}
		int rh=isbalanced(root.right);
		if(rh==-1) {
			return -1;
		}
		if(Math.abs(lh-rh)>1) {
			return -1;
		}
		return 1+(Math.max(lh, rh));
	}

}
