package com.project.euler;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _10001_th_prime_no {

	
	
	
public static void main(String[] args) {
	
	solution(10000001);
	//solution(36);
}
	static public void solution(int number){
		int arr[]=new int[number+1];
		Arrays.fill(arr, 1);
		int sqroot=(int)Math.sqrt((double)number);
		arr[0]=0; arr[1]=0;
		for(int i=2;i<=sqroot;i++){
			for(int k=i;(k*i)<=number;k++){
				arr[k*i]=0;
			}
		}
		List<Integer> ansList=new ArrayList<>();
		for(int i=0;i<arr.length;i++){
			if(arr[i]==0){
				continue;
			}
			ansList.add(i);
		}
		
		System.out.println(ansList.size());
		
		if(ansList.size()>=(10001+1)){
			System.out.println("" +ansList.get(10002));
		}
		else{
			System.out.println("not found");
		}
		
	}
	
	
	
}
