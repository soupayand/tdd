package com.tdd.calculator;

public class Calculator {

	public int add(String input) {
		int sum = 0;
		if (!input.isEmpty()) {
			String[] numbers = input.split("[\n,]");
			for (String number : numbers) {
				sum = sum + Integer.parseInt(number);
			}
		}
		return sum;
	}
}
