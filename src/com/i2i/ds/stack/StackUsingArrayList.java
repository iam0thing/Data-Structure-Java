/**
 * 
 */
package com.i2i.ds.stack;

import java.util.ArrayList;

import com.i2i.ds.StackInterface;

/**
 * @author abhis
 *
 */
public class StackUsingArrayList<T> implements StackInterface<T> {

	/**
	 * 
	 */
	private int stackPointer;
	private ArrayList<T> stack;
	
	public StackUsingArrayList() {
      stackPointer=0;
      stack =  new ArrayList<T>();
	}



	@Override
	public T pop() {
		
		if(stackPointer==0) {
			throw new IllegalStateException("No data in stack");
		}
		
		T data =stack.get(stackPointer - 1);
		stackPointer= stackPointer - 1;
		
		return data;
		// or simply 
		//return stack.get(--stackPointer);
	}

	@Override
	public void push(T t) {
		
		stack.add(t);
		stackPointer= stackPointer + 1;
		
	}

}
