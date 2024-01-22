package com.hexaware.collectionDemo;
import java.util.*;

class StackDemo {

	// Main Method
	public static void main(String[] args)
	{
		Stack stack1 = new Stack();
		Stack<String> stack2 = new Stack<String>();
		stack1.push("4");
		stack1.push("All");
		stack1.push("ab");

		stack2.push("A");
		stack2.push("B");
		stack2.push("C");
		System.out.println(stack1);
		System.out.println(stack2);
	}
}

