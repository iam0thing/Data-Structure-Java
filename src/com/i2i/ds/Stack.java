/**
 * 
 */
package com.i2i.ds;

/**
 * @author abhis
 *
 */
public class Stack<T> implements StackInterface<T> {
	
	private int stackPointer;
	private T[] stack;
	private static final int SIZE=100;
	

	/**
	 * 
	 */
	public Stack() {
		stackPointer=0;
		stack= (T [])new Object[SIZE];
		
	//	String[] strArray = new String[100];
	}
	
	public Stack(int stackSize) {
		
		stackPointer=0;
		stack= (T [])new Object[stackSize];
	}


	@Override
	public T pop() {
         T t = stack[--stackPointer];
		return t;
	}


	@Override
	public void push(T t) {
		stack[stackPointer]=t; // push the data to stack wherever pointer currently pointing to
		
		stackPointer=stackPointer + 1; // move the pointer a little up so that it can accept new data
	}

	

}
