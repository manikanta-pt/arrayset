package org.arrayset;

/**
 * 
 * @author mani
 *
 */

public class ArraySet {
	private Integer[] arraySet;

	/**
	 * Array set Constructor
	 */
	public ArraySet() {
		this.arraySet = new Integer[0];
	}

	public Integer[] toArray() {
		return this.arraySet;
	}

	public boolean addNewElemnt(Integer element) {
		
		boolean exists = false;
		int length = this.arraySet.length;
		if (length == 0) {
			if (element == null) {
				throw new NullPointerException();
			}
			this.arraySet = new Integer[1];
			this.arraySet[0] = element;
			return !exists;
		}
		if (!contains(element)) {
			Integer[] anotherElements = new Integer[length + 1];
			for (int counter = 0; counter < length; counter++) {
				anotherElements[counter] = this.arraySet[counter];
			}
			if (element == null) {
				throw new NullPointerException();
			} else {
				anotherElements[length] = element;
				this.arraySet = anotherElements;
			}
			return true;
		} else {
			return false;
		}
	}

	private boolean contains(Integer element) {
		int length = this.arraySet.length;
		for (int counter = 0; counter < length; counter++) {
			if (this.arraySet[counter].equals(element)) {
				return true;
			} else {
				continue;
			}
		}
		return false;
	}
}
