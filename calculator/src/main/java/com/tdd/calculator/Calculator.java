package com.tdd.calculator;

public class Calculator {

	public int add(String input) {
		int sum = 0;
		String delimiters = ",";
		if (!input.isEmpty()) {
			if (input.startsWith("//")) {
				String[] segments = input.split("\n", 2);
				String customDelimits = segments[0].replace("//", "");
				delimiters = delimiters + customDelimits;
				input = segments[1];
			}
			String[] numbers = input.split("[\n" + delimiters + "]");
			for (String number : numbers) {
				int num = Integer.parseInt(number);
				sum = sum + num;
			}
		}
		return sum;
	}
}
