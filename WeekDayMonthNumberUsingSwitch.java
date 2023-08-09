package com.java;

public class WeekDayMonthNumberUsingSwitch {
 
	public static void main(String [] args) {
		
//	String Result = NameOfTheWeek(5);
//	System.out.println("Name of the week is : " + Result);
		System.out.println("Name of the week is : " + NameOfTheWeek(5));
		System.out.println("Name of the month is : " + NameOfAMonth(5));
		System.out.println("Is it a WeekDay? :" + isWeekDay(4));
	}

    public static String NameOfTheWeek(int day) {
    	switch(day) {
    	case 0: 
    		return "Sunday";
    		
    	case 1: 
    		return "Sunday";
    		
    	case 2: 
    		return "Sunday";
    		
    	case 3: 
    		return "Sunday";
    		
    	case 4: 
    		return "Sunday";
    		
    	case 5: 
    		return "Sunday";
    		
    		default : 
    			return "Invalid";
    	}	
    }
    public static String NameOfAMonth(int month) {
    	switch(month) {
    	case 1: return "January";
    	case 2: return "February";
    	case 3: return "March";
    	case 4: return "April";
    	case 5: return "May";
    	case 6: return "June";
    	case 7: return "July";
    	case 8: return "August";
    	case 9: return "September";
    	case 10: return "October";
    	case 11: return "November";
    	case 12: return "December";
    	default : return "Invalid";
    	}
    }
    public static boolean isWeekDay(int day) {
    	switch(day) {
    	case 0: return false;
    	case 1:return true;
    	case 2:return true;
    	case 3:return true;
    	case 4:return true;
    	case 5:return true;
    	case 6:return false;
    	}
    	return false;
    	
    }
}
