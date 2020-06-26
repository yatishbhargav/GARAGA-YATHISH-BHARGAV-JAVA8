package com.epam.Functional_Interfaces_And_Streams;

import java.util.*;
import java.util.stream.*;

public class Streams {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int size=in.nextInt();
		ArrayList<String> listOfStrings=new ArrayList<>();
		for(int i=0;i<size;i++) listOfStrings.add(in.next());
		List<String> res=listOfStrings.stream().filter(str -> str.charAt(0)=='a' && str.length()==3).collect(Collectors.toList());
		System.out.println(res);
		in.close();
	}

}
