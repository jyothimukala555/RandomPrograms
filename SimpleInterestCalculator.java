package com.java;

import java.math.BigDecimal;

public class SimpleInterestCalculator {
   // Simple Interest Formula
	// Total = principle + principle * Interest * noOfYears;
	//Total = 4500.00 +4500.00*(7.5)*5
	 
	BigDecimal principle;
	BigDecimal interest;
	public static void main (String [] args) {
		SimpleInterestCalculator sic = new SimpleInterestCalculator("4500.00","7.5");
		BigDecimal totalValue = sic.CalculateTotalValue(5);
		
		System.out.println("Print the total amount "+ totalValue);	
	}
   public SimpleInterestCalculator(String principle, String interest) {
	   this.principle= new BigDecimal(principle);
	   this.interest= new BigDecimal(interest).divide(new BigDecimal(100));  //interest is in percentage so we use divide by 100;
   }
   
   public BigDecimal CalculateTotalValue(int noOfYears) {
	   BigDecimal noOfYearsBigDecimal = new BigDecimal(noOfYears);  //or .multiply(new BigDecimal(noOfYears);
	   BigDecimal totalValue = principle.add(principle).multiply(interest).multiply(noOfYearsBigDecimal);
	     return totalValue;
   }

}
