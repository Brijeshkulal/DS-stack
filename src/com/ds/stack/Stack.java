package com.ds.stack;

public class Stack {
	Node top;
	int size;
	
	public void push(int data) {
		Node node = new Node(data);
		node.next = top;
		top = node;
		size++;
	}
	
	public void display()
	{
		Node temp = top;
		while(temp != null) {
			System.out.println(temp.data);
			temp = temp.next;
		}
	}

}
