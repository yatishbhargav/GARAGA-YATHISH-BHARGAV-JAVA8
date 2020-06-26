package com.epam.Functional_Interfaces_And_Streams;

import java.util.*;
import java.util.function.Function;

public class Palindrome {

	public static ArrayList<String> palindromeCheck(ArrayList<String> l){
        ArrayList<String> palindromes=new ArrayList<>();
        for(String str:l){
            int i=0,j=str.length()-1,f=0;
            while(i<j){
                if(str.charAt(i)!=str.charAt(j)){
                    f=1;
                    break;
                }
                i++;j--;
            }
            if(f==0) palindromes.add(str);
        }
        return palindromes;
    }
	
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int size=in.nextInt();
		ArrayList<String> listOfStrings=new ArrayList<>();
		for(int i=0;i<size;i++) listOfStrings.add(in.next());
		Function<ArrayList<String> , ArrayList<String>> palindromes=Palindrome::palindromeCheck;
		ArrayList<String> listOfPalindromeStrings=palindromes.apply(listOfStrings);
		System.out.println(listOfPalindromeStrings);
		in.close();
	}

}
