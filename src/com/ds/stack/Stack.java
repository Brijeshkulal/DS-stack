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
	
	public int pop() {
		if(top == null) {
			System.out.println("stack is empty");
		}
		int result = top.data;
		top = top.next;
		size--;
		return result;
	}
	
	public int peek() {
		if(top == null) {
			System.out.println("stack is empty");
		}
		return top.data;
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
