package com.java;

public class ForWhileExample {

	public static void main(String [] args) {
	 String[] names = {"A", "B", "C", "D"};
	for (int j =0; j<names.length; j++){
	System.out.println( names[j]);
	}
	
	boolean isProcessed = false;
	int i = 0;
	
	while( isProcessed == false) {
	if( names[i] == "C" ){
	System.out.println("Found : " + names[i]);
	
	isProcessed = true;
	}
	i++;
}
	}
}
