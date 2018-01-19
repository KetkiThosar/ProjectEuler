package com.project.euler;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.TreeSet;

public class LargestPrimeFactor {

	public static void main(String[] args) {
	
		System.out.println(solution(600851475143l));

	}
	
	
	public static long solution(long number){
		TreeSet<Long>ts=new TreeSet<>();
		long divider=2l;
		int test=0;
		while(number>1){
			while(number%divider==0){
				divider/=2;
			}
			divider++;
			if(divider*divider>number&&number>1){
				test=1;
				ts.add(divider);
				break;
			}
		}
		if(test==0){
			ts.add(divider-1);
		}
		return ts.last();
		
	}

}
