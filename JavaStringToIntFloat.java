package com.java;

public class JavaStringToIntFloat {

	public static void main(String[] args) {
		String strPrice = "20000.99";
		String strDiscount = "10";
		
		float price =Float.parseFloat(strPrice);
		int discount = Integer.parseInt(strDiscount);
		System.out.println( price / discount);
}
}
