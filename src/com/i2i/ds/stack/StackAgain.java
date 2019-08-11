/**
 * 
 */
package com.i2i.ds.stack;

import com.i2i.ds.StackInterface;

/**
 * @author abhis
 *
 */
public class StackAgain<T> implements StackInterface<T> {
	
	/**
	 * stackPointer : it points to empty topmost point of stack to accept new data
	 * stackPointer - 1 : it points to non-empty topmost point of stack where currently there is data
	 */
	private int stackPointer ;
	
	/**
	 * array of Type t data i.e. String [] strArray
	 */
	private T[] stack;
	

	/**
	 * Unparameterized constructor, it creates a stack of default size
	 * StackAgain<String> stackOfString = new Stack<String>();
	 * as per below constructor, stack contains 100 elements
	 */
	public StackAgain() {
		stackPointer =0;
		stack = (T[])new Object[100];
	}
	
	/**
	 * stack of height size
	 * @param size
	 */
	
	public StackAgain(int size) {
		stackPointer =0;
		stack = (T[])new Object[size];
	}

	/**
	 * return the topmost element of the stack
	 */
	@Override
	public T pop() {
		/**
		 * check first if there is any data in the stack or not
		 */
		if(stackPointer==0)
			throw new IllegalStateException("There is no data in stack");
		
		/**
		 * if there is data in the stack, lower down the pointer to point to non-empty space
		 * of stack
		 */
		stackPointer = stackPointer -1;
		
		T element = stack[stackPointer];
		return element;
	}
	
	/**
	 * 
	 * put the data into stack and move the cursor one step up
	 */

	@Override
	public void push(T t) {
	     stack[stackPointer]=t;
	     stackPointer = stackPointer + 1;
		
	}
	
	public int size() {
		return stackPointer;
		
	}
	
	public boolean contains(T t){
		
		for (int i=0; i < stackPointer ; i++) {
			
			
			//System.out.println(" element in stack "+stack[i].toString());
			
			if(! stack[i].toString().equalsIgnoreCase(t.toString())) {
				
				
				System.out.println(" matching "+t.toString());
				return true;
			}

		}
		
		return false;
	}


	public T traverse() {
		
		int height = stackPointer;
		
		T data = stack[--height];
		
		return data;
	}
}
