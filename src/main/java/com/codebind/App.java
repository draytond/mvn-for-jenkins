package com.codebind;

public class App {
//	public String Sample() {
//		return "hello world";
//	}

	public static void main(String[] args) {
		if (args.length > 0) {
			System.out.println("Hello " + args[0] + "!");
		} else {
			System.out.println("Hello world!");
		}
	}
}
