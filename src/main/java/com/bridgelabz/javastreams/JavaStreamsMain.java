package com.bridgelabz.javastreams;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class JavaStreamsMain {
	public static void main(String[] args) {

		ArrayList<Integer> myNumberList = new ArrayList<Integer>();
		for (int i = 0; i < 15; i++)
			myNumberList.add(i);
		myNumberList.stream().forEach(n -> System.out.println("number is: " + n));

		Function<Integer, Double> toDoubleFunction = Integer::doubleValue;
		Predicate<Integer> isEvenFunction = n -> n > 0 && n % 2 == 0;

		List<Double> doubleList=myNumberList.stream()
				.map(toDoubleFunction)
				.collect(Collectors.toList());
		System.out.println("Obtained double list is "+doubleList);

		List<Integer> evenStreamList=myNumberList.stream().filter(isEvenFunction).collect(Collectors.toList());
		System.out.println("Even number list is: "+evenStreamList);
		Integer firstEvenNumber=myNumberList.stream()
				.filter(isEvenFunction)
				.findFirst()
				.orElse(null);
		System.out.println("The first even number is :"+firstEvenNumber);

		Integer minEvenNumber=myNumberList.stream()
				.filter(isEvenFunction)
				.min(Integer::compare).orElse(null);
		System.out.println("Minimum even number is: "+minEvenNumber);

		Integer maxEvenNumber = myNumberList.stream()
				.filter(isEvenFunction)
				.max(Integer::compare)
				.orElse(null);
		System.out.println("Maximum even number is: "+maxEvenNumber);
	}

}
