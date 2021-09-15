package com.bridgelabz.regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpressions {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		RegularExpressions.firstName();
		RegularExpressions.lastName();
		RegularExpressions.email();
		RegularExpressions.mobileNumber();
		RegularExpressions.passwordRule2();
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
			System.out.println("Invalid Firstname....!");
			System.out.println("Your Firstname should start with capital letter and has minimum 3 characters ");
		}

	}

	public static void lastName() {

		System.out.println("Enter Your Lastname");
		String input = sc.next();

		String regex = "^[A-Z]{1}[a-z]{2,}$";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(input);

		if (matcher.matches()) {
			System.out.println("Valid Lastname");
		} else {
			System.out.println("Invalid Lastname....!");
			System.out.println("Your Lastname should start with capital letter and has minimum 3 characters ");
		}

	}

	public static void email() {

		System.out.println("Enter Your Email ID");
		String input = sc.next();

		String regex = "^[a-z0-9]{3,}+([_+-.][a-z0-9]{3,}+)*@[a-z0-9]+.[a-z]{2,3}+(.[a-z]{2,3}){0,1}$";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(input);

		if (matcher.matches()) {
			System.out.println("Valid email");
		} else {
			System.out.println("Invalid email...!");
			System.out.println(
					"Your Email has 3 mandatory parts (abc, bl\r\n" + "& co) and 2 optional (xyz & in) with\r\n"
							+ "precise @ and . positions --> E.g. abc.xyz@bl.co.in");
		}

	}

	public static void mobileNumber() {

		System.out.println("Enter Your mobileNumber");
		String input = sc.nextLine();

		String regex = "^[0-9]{2}\\s{1}[0-9]{10}$";

		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(input);

		if (matcher.matches()) {
			System.out.println("Valid mobileNumber");
		} else {
			System.out.println("Invalid mobileNumber...!");
			System.out.println("Your mobileNumber Format - E.g. 91 9919819801 - Country code follow by space and 10\r\n"
					+ "digit number");
		}

	}

	public static void passwordRule2() {

		System.out.println("Enter Your password with following conditions :\n");

		System.out.println("1)Your password must contain minimum 8 characters\n2)Should have atleast 1 UpperCase");
		String input = sc.next();

		String regex = "^(?=.*[A-Z]){1}(?=.*[a-z]).{8,}$";

		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(input);

		if (matcher.matches()) {
			System.out.println("Valid password");
		} else {
			System.out.println("Invalid password...!");

		}

	}
}
