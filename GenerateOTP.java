package com.java;

public class GenerateOTP{
	public static void main (String [] args)
{     
		double randomNum = Math.random();
		//0.644849936951174
		randomNum = randomNum *10000;
		//6448.49936951174

		int otp = (int)randomNum;
		//6448
		
		System.out.println(otp);
}
	
}
