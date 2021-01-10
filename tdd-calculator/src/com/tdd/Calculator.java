package com.tdd;

public class Calculator {

	public int add(String numbers) {
		int sum = 0;
		if (!numbers.isEmpty()) {
			String[] segments = numbers.split(",");
			for (String number : segments) {
				sum = sum + Integer.parseInt(number);
			}
		}
		return sum;
	}
}
