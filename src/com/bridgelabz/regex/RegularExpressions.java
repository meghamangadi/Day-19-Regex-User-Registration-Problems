package com.bridgelabz.regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpressions {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		RegularExpressions.firstName();
	}

	public static void firstName() {

		System.out.println("Enter Your Firstname");
		String input = sc.next();

		String regex = "^[A-Z]{1}[a-z]{2,}$";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(input);

		if (matcher.matches()) {
			System.out.println("Valid Firstname");
		} else {
			System.out.println("Invalid Firstname...!");
			System.out.println("Your Firstname should start with capital letter and has minimum 3 characters ");
		}

	}
}
