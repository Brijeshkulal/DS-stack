package com.ds.stack;

public class StackMain {
	public static void main(String[] args) {
		Stack stack = new Stack();
		stack.push(70);
		stack.push(30);
		stack.push(56);
		stack.display();
		
		System.out.println("the top of the stack is " + stack.peek());
		System.out.println("Popped element is " + stack.pop());
		stack.display();
		
		System.out.println("the top of the stack is " + stack.peek());
		System.out.println("Popped element is " + stack.pop());
		stack.display();
		
		System.out.println("the top of the stack is " + stack.peek());
		System.out.println("Popped element is " + stack.pop());
		stack.display();
		
		System.out.println("Popped element is " + stack.pop());
	}

}
