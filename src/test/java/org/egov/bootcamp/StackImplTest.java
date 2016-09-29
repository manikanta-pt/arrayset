package org.egov.bootcamp;

import static junit.framework.Assert.assertTrue;
import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertFalse;

import org.egov.bootcamp.StackImpl;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class StackImplTest {
	@Rule
	public ExpectedException thrown = ExpectedException.none();

	@Test
	public void insertNull() throws Exception {
		StackImpl<Integer> stack = new StackImpl(10);
		thrown.expect(NullPointerException.class);
		stack.push(null);

	}

	@Test
	public void popEmpty() throws Exception {
		StackImpl<Integer> stack = new StackImpl(10);
		thrown.expect(NullPointerException.class);
		stack.pop();
	}
	
	@Test
	public void push() throws Exception {
		StackImpl<Integer> stack = new StackImpl(4);
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		assertEquals(4, stack.size());
		assertArrayEquals(new Integer[] { 1, 2, 3, 4 }, stack.toArray());
	}

	@Test
	public void pop() throws Exception {
		StackImpl<Integer> stack = new StackImpl(10);
		stack.push(1);
		stack.pop();
		assertEquals(0, stack.size());
		assertArrayEquals(new Integer[] {}, stack.toArray());
	}

	
	@Test
	public void emptyToArray() throws Exception {
		StackImpl<Integer> stack = new StackImpl(10);
		assertArrayEquals(new Integer[] {}, stack.toArray());
	}

	@Test
	public void lengthZeroOnEmptyStack() throws Exception {
		StackImpl<Integer> stack = new StackImpl(10);
		assertEquals(0, stack.size());
	}

	@Test
	public void searchNull() throws Exception {
		StackImpl<Integer> stack = new StackImpl(10);
		thrown.expect(NullPointerException.class);
		stack.contains(null);
	}

	@Test
	public void pushOnEmptyStack() throws Exception {
		StackImpl<Integer> stack = new StackImpl(1);
		stack.push(1);
		assertEquals(1, stack.size());
		assertArrayEquals(new Integer[] { 1 }, stack.toArray());
	}

	

	
	@Test
	public void popExisting() throws Exception {
		StackImpl<Integer> stack = new StackImpl(1);
		stack.push(1);
		boolean contains = stack.contains(1);
		assertTrue(contains);
		boolean contains1 = stack.contains(2);
		assertFalse(contains1);
		assertArrayEquals(new Integer[] { 1 }, stack.toArray());
	}
}