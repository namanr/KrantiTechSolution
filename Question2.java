package com.krantitech;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Question2 {
	
//	Question 2 - Given a sentence find number of times each word occurs in it using one of the built in collection types. This needs to be the most efficient algorithm, You may assume that in a sentence a word is separated from another word using a space character.
//	We expect this code to run by java Question2

	
	public static void main(String[] args) {
	 String sentance ="hello world java hello";
	  String[] words=sentance.split(" ");
      List<String> ls= Arrays.asList(words);
      
      Map<String,Integer> hs = new HashMap<>();
      for (String string : ls) {
    	 // System.out.println(string);
    	  
    	  hs.put(string,ls.stream().filter(str->str.equals(string)).collect(Collectors.toList()).size());
    	  
	}
      
	System.out.println(hs);

	}
	
	
	
	
}
