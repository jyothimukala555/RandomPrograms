package com.java;
public class BiNumber {
	//add multiply double and return the getnum1 and getnum2
	private int number1;
	private int number2;
	public static void main (String [] args) {
		BiNumber num = new BiNumber(2,3);
	 num.doubleValue();
	 num.setNumber1(5);
	 num.setNumber2(6);
	System.out.println("Print add of number: "+ num.add() );
	System.out.println("Print multiplication of number: "+ num.multiply());
	System.out.println("get value of number1: "+ num.getNumber1());
	System.out.println("get value of number2: "+ num.getNumber2());
	
	}
       public BiNumber(int number1,int number2) {
    	   this.number1 =number1;
    	   this.number2 =number2;  
       }
	public int getNumber1() {
		return number1;
	}
	public void setNumber1(int number1) {
		this.number1 = number1;
	}
	public int getNumber2() {
		return number2;
	}
	public void setNumber2(int number2) {
		this.number2 = number2;
	}
	public int add() {
		return number1 + number2;
	}
	public int multiply() {
		return number1 * number2;
	}
	public void doubleValue() {
		this.number1 *=2;
		this.number2 *=2;
	}
	
}
