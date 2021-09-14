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
	public static void lastName() {

		System.out.println("Enter Your Lastname");
		String input = sc.next();

		String regex = "^[A-Z]{1}[a-z]{2,}$";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(input);

		if (matcher.matches()) {
			System.out.println("Valid Lastname");
		} else {
			System.out.println("Invalid Lastname...!");
			System.out.println("Your Lastname should start with capital letter and has minimum 3 characters ");
		}

	}
	public static void email() {

		System.out.println("Enter Your Email");
		String input = sc.next();

		String regex = "^[a-z0-9]{3,}+([_+-.][a-z0-9]{3,}+)*@[a-z0-9]+.[a-z]{2,3}+(.[a-z]{2,3}){0,1}$";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(input);

		if (matcher.matches()) {
			System.out.println("Valid email");
		} else {
			System.out.println("Invalid email...!");
			System.out.println("Your Email has 3 mandatory parts (abc, bl\r\n"
					+ "& co) and 2 optional (xyz & in) with\r\n"
					+ "precise @ and . positions --> E.g. abc.xyz@bl.co.in");
		}

	}
}


