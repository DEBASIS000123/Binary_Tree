import java.util.*;
public class Bfs2 {
	static class Node{
		int data;
		Node left;
		Node right;
		public Node(int data) {
			this.data=data;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node root =new Node(1);
		root.left=new Node(2);
		root.right=new Node(3);
		root.left.left=new Node(4);
		root.left.right=new Node(5);
		
		levelordertraversal(root);
	}
	private static void levelordertraversal(Node n) {
		Queue<Node>q=new LinkedList<>();
		q.add(n);
		while(!q.isEmpty()) {
			Node cur=q.remove();
			System.out.print(cur.data+" ");
			if(cur.left!=null) {
				q.add(cur.left);
			}
			if(cur.right!=null) {
				q.add(cur.right);
			}
		}
		
	}

}
