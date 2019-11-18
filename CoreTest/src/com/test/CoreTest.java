package com.test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CoreTest {
	
	
	
	public static void main (String args[] ) {
		
		Integer[] numArr= {1,2,3,4,5};
		List<Integer> number = Arrays.asList(numArr); 
		
		List<Integer> square = number.stream().map(x -> x*x). 
                collect(Collectors.toList()); 
System.out.println(square); 

List<Integer> filt = number.stream().filter(s->s!=4).collect(Collectors.toList());
System.out.println(filt); 
numArr=(Integer[]) filt.toArray(numArr);
System.out.println(numArr[3]);

		
		
	}
}
