package com.sharad.interview.coding;

import java.lang.Exception;

public class FibonacciNumber{
	public int getNumberRecursive(int num){
		if(num ==0 || num == 1){
			return num;
		}else{
			return getNumberRecursive(num-1) + getNumberRecursive(num-2); // order of n^2 should not use it for numbers more then 30
		}
	}
	
	public int getNumberIterative(int num){
		if(num < 2){
			return num;
		}else{
			int f1 = 0;
			int f2 = 1;
			int returnValue = 0;
			for(int i=1; i<num; i++){
				returnValue = f1 + f2;
				f1=f2;
				f2=returnValue;
			}
			return returnValue;
		}		
	}
	
	public static void main(String[] args) throws Exception{
		if(args.length < 1){
			System.out.println("Usage");
			System.out.println("Please provide an input to generate desired Fibbonacci Number  ");
		}else{
			int nthFibb = Integer.parseInt(args[0]);
			if(nthFibb<0){
				System.out.println("Please provide an +ve Integer input to generate desired Fibbonacci Number  ");
			}else{
				FibonacciNumber fibbonacciNumber  = new FibonacciNumber();
				System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
				System.out.println(nthFibb + "th Fibbonacci Number is "+fibbonacciNumber.getNumberIterative(nthFibb)+"\n");
				System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
				System.out.println("Generating first "+nthFibb+" numbers \n");
				for(int i=1; i<=nthFibb; i++){
					System.out.print(fibbonacciNumber.getNumberIterative(i)+ " ");
				}
				System.out.println("\n");
				System.out.println("-------------Recursive------------\n");
				
				System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
				System.out.println(nthFibb + "th Fibbonacci Number is "+fibbonacciNumber.getNumberRecursive(nthFibb)+"\n");
				System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
				System.out.println("Generating first "+nthFibb+" numbers \n");
				for(int i=1; i<=nthFibb; i++){
					System.out.print(fibbonacciNumber.getNumberRecursive(i)+ " ");
				}
				System.out.println();
			}
		}
	}
}