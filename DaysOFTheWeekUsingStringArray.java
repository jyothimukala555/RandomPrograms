package com.java;

public class DaysOFTheWeekUsingStringArray {

	public static void main(String[] args) {
		String [] daysOfTheWeek = {"Sunday","Monday","Tuesday","Wednesday","Thrusday","Friday","Saturday"};
	
		String dayWithMostCharacters = "";
		for(String day : daysOfTheWeek) {
			if(day.length() > dayWithMostCharacters.length()) {
				dayWithMostCharacters = day;
			}
		}
	
		System.out.println("Days of the week with most characters : " + dayWithMostCharacters);
		
		for(int i=0;i<daysOfTheWeek.length;i++) {
			System.out.println("DaysOfTheWeek :" + daysOfTheWeek[i]);
		}
		System.out.println();
		//reverse order
		for(int i=daysOfTheWeek.length-1;i>=0;i--) {
			System.out.println("DaysOfTheWeek :" + daysOfTheWeek[i]);
		}
		
		
		
		
	}
}
