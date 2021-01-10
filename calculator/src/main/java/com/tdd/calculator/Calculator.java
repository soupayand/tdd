package com.tdd.calculator;

public class Calculator {

	public int add(String input) {
		int sum = 0;
		String delimiters = ",";
		String negativeNumbers = "";
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
				if (num < 0) {
					negativeNumbers = negativeNumbers + " " + number;
				} else if (num < 1000) {
					sum = sum + num;
				}
			}
		}
		if (!negativeNumbers.isEmpty()) {
			throw new IllegalArgumentException("Negatives not allowed : " + negativeNumbers);
		}

		return sum;
	}
}
