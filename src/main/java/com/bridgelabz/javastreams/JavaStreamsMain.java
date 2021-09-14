package com.bridgelabz.javastreams;

import java.util.ArrayList;

public class JavaStreamsMain {
	public static void main(String[] args) {

		ArrayList<Integer> myNumberList = new ArrayList<Integer>();
		for (int i = 0; i < 5; i++)
			myNumberList.add(i);
		myNumberList.stream().forEach(n -> System.out.println("number is: " + n));
	}

}
