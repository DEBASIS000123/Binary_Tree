import java.util.*;

public class Zig_Zag_traversal {
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
		root.left.left=new Node(7);
		root.left.right=new Node(6);
		root.right.left=new Node(5);
		root.right.right=new Node(4);
		ArrayList<Integer> answer=zigzagtraversal(root);
		System.out.println("ZigZag traversal is:");
		for(int i=0;i<answer.size();i++) {
			System.out.print(answer.get(i)+" ");
		}
	}
	public static ArrayList<Integer> zigzagtraversal(Node n){
		ArrayList<Integer> ans=new ArrayList<>();
		if(n==null) {
			return ans;
		}
		Queue <Node> q=new LinkedList<>();
		q.add(n);
		ans.add(n.data);
		boolean LeftToRight=false;
		while(!q.isEmpty()) {
			Node cur=q.remove();
			if(cur.left!=null) {
				q.add(cur.left);
			}
			if(cur.right!=null) {
				q.add(cur.right);
			}
			if(LeftToRight) {
				if(cur.left!=null) {
					ans.add(cur.left.data);
				}
				if(cur.right!=null) {
					ans.add(cur.right.data);
				}
			}
			else {
				ArrayList <Integer> temp=new ArrayList<>();
				if(cur.left!=null) {
					temp.add(cur.left.data);
				}
				if(cur.right!=null) {
					temp.add(cur.right.data);
				}
				Collections.reverse(temp);
				for(int i=0;i<temp.size();i++) {
					ans.add(temp.get(i));
				}
				LeftToRight=!LeftToRight;
			}
		}
		return ans;
	}
}
