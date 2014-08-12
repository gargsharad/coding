package com.sharad.interview.coding;

import java.util.regex.*;
public class Solution {

    public int evalRPN(String[] tokens) {
        return 1;
    }

    public boolean validateInput(String[] input){
    	boolean result = true;
    	Pattern pattern = Pattern.compile("\\d*|[\\-+/*]{1}");
    	Matcher matcher;
    	int i = 0;
    	System.out.println(input.length);
    	if (input.length<=0)
    		result=false;
		for(String token : input){
    		matcher = pattern.matcher(token);
    		if(token.trim().length() <= 0){
    			continue;
    		}else{
    			if(!matcher.matches()){
	    			result=false;
	    			break;
    			}
    		}
	    }
    	return result;
    }
    public static void main(String[] args) {
    	System.out.println("##################Start###################");
    	Solution sol = new Solution();
    	if(sol.validateInput(args)){
    	}else{
    		System.out.println("Error please provide an valid input");
    	}
    	System.out.println("##################End#####################");
    }
}