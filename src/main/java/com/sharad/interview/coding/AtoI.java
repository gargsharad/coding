package com.sharad.interview.coding;

import java.util.Scanner;

public class AtoI {
	public static int atoi(String input) {
		long result = 0l;
		char flag = '+';
		char[] inputDigitArray = input.toCharArray();
		int idx = 0;
		if (inputDigitArray[idx] == '-') {
			flag = '-';
			idx++;
		} else if (inputDigitArray[idx] == '+') {
			flag = '+';
			idx++;
		}
		while (inputDigitArray.length > idx) {
			result = (result * 10) + (inputDigitArray[idx++] - '0');
		}
		if (flag == '-')
			result = -result;

		if (result < Integer.MIN_VALUE) {
			result = Integer.MIN_VALUE;
		}
		if (result > Integer.MAX_VALUE) {
			result = Integer.MAX_VALUE;
		}
		return (int) result;
	}

	public static String getInput() {
		System.out
				.print("Please enter a string you want to convert in to integer :: ");
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		scanner.close();
		return input.trim();
	}

	public static boolean validateInput(String input) {
		boolean returnValue = false;
		if (input.matches("^[+,-]?\\d*$") && !(input.length() < 1)) {
			returnValue = true;
		} 
		return returnValue;
	}

	public static void main(String[] args) {
		System.out.println("~~~~~~~~~~~~~~~Start~~~~~~~~~~~~~~~~~~~\n");
		String input = AtoI.getInput();
		if (!AtoI.validateInput(input)) {
			System.out.println("\nNot a valid input exiting");
		} else {
			System.out.println("\n The number coverted to integer is :: "
					+ AtoI.atoi(input));
		}
		System.out.println("\n~~~~~~~~~~~~~~~End~~~~~~~~~~~~~~~~~~~~~");
	}
}