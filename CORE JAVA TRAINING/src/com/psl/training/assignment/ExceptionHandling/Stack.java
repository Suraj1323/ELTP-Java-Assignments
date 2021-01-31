package com.psl.training.assignment.ExceptionHandling;

public class Stack {
	static int top=-1;
	static int size;
	Contact[] stack;
	public Stack(int size) {
		Stack.size=size;
		stack=new Contact[size];
	}
	
	public void push(Contact contact) throws Exception{
		if(top>=size-1) {
			throw new Exception("Stack Overflow!");
		}
		else {
			contact.validate();
			stack[++top]=contact;
		}
	}
	
	public void pop() throws Exception{
		if(top==-1||stack==null) {
			throw new Exception("Stack underflow");
		}
		else {
			top--;
		}
	}
	
	public void print() {
		if(top>-1&&stack!=null) {
		for(int i=0;i<size;i++) {
			System.out.println(stack[i]);
			}
		}
		else {
			System.out.println("Stack is empty!");
		}
		
	}
}
