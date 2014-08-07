package com.sharad.interview.coding;

public class ReverseArrayWithoutIteration<T> {

	public T[] reverseArray(T[] array, int startIdx, int endIdx) {
		if (array.length < 2) {
			return array;
		}else{
			if (startIdx<endIdx) {
				int mid = ((startIdx+endIdx)/2);
				T[] leftArray = reverseArray(array, 0, mid);
				T[] rightArray = reverseArray(array, mid+1, endIdx);
				//System.arraycopy(rightArray, 0, rightArray, 0, rightArray.length-1);
				//System.arraycopy(leftArray, 0, returnArray, rightArray.length, leftArray.length);
			}
			
		}
		return array;
	}

	public static void main(String[] args) {
		String[] strArr = { "a", "b", "c", "d", "e", "f", "g", "h", "i", "j",
				"k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v",
				"w", "x", "y", "z", "a" };
		ReverseArrayWithoutIteration<String> reverseArrayWithoutIteration = new ReverseArrayWithoutIteration<String>();
		strArr = reverseArrayWithoutIteration.reverseArray(strArr, 0, strArr.length-1);

		for (String string : strArr) {
			System.out.println(string + " ");
		}
		
		Long.valueOf("5");
	}
}
