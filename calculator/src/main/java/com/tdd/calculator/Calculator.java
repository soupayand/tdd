package com.tdd.calculator;

import org.apache.commons.lang3.StringUtils;

public class Calculator {

	public int add(String input) {
		int sum = 0;
		if (!input.isEmpty()) {
			String[] numbers = StringUtils.split(input, ",");
			for (String number : numbers) {
				sum = sum + Integer.parseInt(number);
			}
		}
		return sum;
	}
}
