/**
 * 
 */
package com.i2i.ds;

/**
 * @author abhis
 *
 */
public interface StackInterface<T> {
	
	/**
	 * return the element and move the pointer one 
	 * level below
	 * @return
	 */
	public T pop(); 
	
	/**
	 * push the element to stack and move the pointer to top
	 * @param t
	 */
	public void push(T t);

}
