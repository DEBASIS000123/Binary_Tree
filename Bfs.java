
import java.util.*;
public class Bfs {
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
		
		Bfstraversal(root);
	}
	public static void Bfstraversal(Node n) {
		for(int i=1;i<=3;i++) {
			printdata(n,i);
		}
	}
	private static void printdata(Node n, int i) {
		if(n==null) {
			return;
		}
		if(i==1) {
			System.out.print(n.data+" ");
		}
		else if(i>1) {
			printdata(n.left,i-1);
			printdata(n.right,i-1);
		}
	}

}
