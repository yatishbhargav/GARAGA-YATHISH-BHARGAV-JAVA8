package com.epam.Functional_Interfaces_And_Streams;

import java.util.*;
import java.util.function.Predicate;

public class Average {

	public static float average(ArrayList<Integer> l,Predicate<Integer> predicate){
        int sum=0,size=l.size();
        for(Integer ele: l){
            if(predicate.test(ele)){
                sum+=ele;
            }
        }
        return (float)(sum/(size*1.0));
    }
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int size=in.nextInt();
		ArrayList<Integer> listOfElements=new ArrayList<>();
		for(int i=0;i<size;i++) listOfElements.add(in.nextInt());
		float avg=average(listOfElements,(Integer ele) -> ele>=0);
		System.out.println(avg);
		in.close();
	}

}
