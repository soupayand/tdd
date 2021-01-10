package com.tdd.calculator;

import org.apache.commons.lang3.StringUtils;

public class Calculator {

	public int add(String input) {
		int sum = 0;
		String delimiters = ",";
		String negativeNumbers = "";
		if (!input.isEmpty()) {
			if (input.startsWith("//")) {
				String[] segments = input.split("\n", 2);
				String customDelimits = segments[0].replace("//", "");
				String temp = StringUtils.remove(customDelimits, "[");
				customDelimits = StringUtils.remove(temp, "]");
				delimiters = delimiters + customDelimits;
				input = segments[1];
			}
			String[] numbers = input.split("[\n" + delimiters + "]");
			for (String number : numbers) {
				if (!number.equals("")) {
					int num = Integer.parseInt(number);
					if (num < 0) {
						negativeNumbers = negativeNumbers + " " + number;
					} else if (num < 1000) {
						sum = sum + num;
					}
				}
			}
		}
		if (!negativeNumbers.isEmpty()) {
			throw new IllegalArgumentException("Negatives not allowed : " + negativeNumbers);
		}

		return sum;
	}
}
