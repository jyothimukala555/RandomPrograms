package com.java;

public class MyChar {
	
	private char ch;
	
	public MyChar(char ch) {
		this.ch = ch;
	}
	
	public static void main(String [] args) {
		MyChar myChar = new MyChar('D');
		 
		System.out.println("The input data contains isVowel : " + myChar.isVowel());
		System.out.println("The input data contains isDigit : " + myChar.isDigit());
		System.out.println("The input data contains isConsonant : " + myChar.isConsonant());
     	System.out.println("The input data contains isAlphabet : " + myChar.isAlphabet());
		
		MyChar.isUpperCase();
		MyChar.isLowerCase();
	}
	
	public boolean isVowel() {
		
	// 'a','e','i','o','u'  or 'A','E','I','O','U'---true..else false
		
		if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
			
		return true;
		}
		
		else if(ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
			return true;
	}
		return false;
	}

	
	public boolean isDigit() {
		// 0 to 9---ch values for 0 is 48 and for 9 is 57 so if the digit is b/w 0 to 9 returns true else false.
		
		if(ch >= 48 && ch <=57) {
			return true;
		}
		return false;
	}
	
	public boolean isAlphabet() {
		//'a' to 'z' or 'A' to 'Z' ---alphabets...
		//so ch values of 'a' to 'z' is 98 to 122; ch is b/w those returns true
		//ch values of 'A' to 'Z' is 65 to 90;  ch is b/w those returns true
		if (ch >=97 && ch <=122) {
		return true;
		}
		if (ch >=65 && ch <=90) {
			return true;
			}
		return false;
	}
	
	public boolean isConsonant() {
		//constant means it should be an alphabet but not an vowel so both conditions must satisfy then true
		if(isAlphabet() && !isVowel())
			return true;
		return false;
	}
	
	public static void isUpperCase() {
		// 'A' to 'Z'--65 to 90
		for (char ch ='A'; ch <='Z'; ch++) {
			System.out.println(ch);	
		}
	}
	
	public static void isLowerCase() {
		// 'a' to 'z'--98 to 122
		for (char ch ='a'; ch <='z'; ch++) {
			System.out.println(ch);	
		}
	}
}
