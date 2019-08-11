package com.i2i.ds.stack;

import com.i2i.ds.Stack;
import com.i2i.ds.StackInterface;

public class StackAgainMain {



	public static void main(String[] args) {
      
		//StackAgain<String> stack = new StackAgain<String>();
		StackInterface<String> stack = new StackUsingArrayList<String>();
		
		stack.push("Abhishek");
		stack.push("Kumar");
		stack.push("Singh");
		
		
		System.out.println(" popping element "+stack.pop());
		System.out.println(" popping element "+stack.pop());
		System.out.println(" popping element "+stack.pop());
		//stack.pop();
		//System.out.println("check if Kumar is present "+stack.contains("Kumar"));
		//System.out.println("traverse "+stack.traverse());
		//System.out.println("Size of stack "+stack.size());
		

	}

}
