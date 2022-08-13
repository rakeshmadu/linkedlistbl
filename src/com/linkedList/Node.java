package com.linkedList;

public class Node implements Comparable<Node>{

	int data;
	Node next = null;
	
	
	public Node(int data) {
		super();
		this.data = data;
	}


	@Override
	public int compareTo(Node node) {
		// TODO Auto-generated method stub
		
		if(this.data < node.data)
			return -1;
		else if (this.data > node.data)
			return 1;
		else 
			return 0;
	}
	
	
}
