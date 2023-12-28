package com.imaginnovate.studentModule.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

import com.imaginnovate.studentModule.exception.InvalidDOBException;

public class AppUtil {

	public static boolean checkIfDobValid(String dob) throws ParseException, InvalidDOBException{
		SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy", Locale.ENGLISH);
		Date now=Calendar.getInstance().getTime();
		
		String nowDate=formatter.format(now);
		int year=Integer.parseInt(nowDate.substring(6,nowDate.length()));
		String fifteenYrsBackDate=nowDate.replace(String.valueOf(year), String.valueOf(year-15));
		Date fftnYrsBckDate=formatter.parse(fifteenYrsBackDate);
		
		String twentyYrsBackDate=nowDate.replace(String.valueOf(year), String.valueOf(year-20));
		Date twentyYrsBckDate=formatter.parse(twentyYrsBackDate);
		
		Date dobDate=formatter.parse(dob);
		//28-12-2003 < 28-12-2006 < 28-12-2008
		
		if(dobDate.getTime()<twentyYrsBckDate.getTime()
				||dobDate.getTime()>=fftnYrsBckDate.getTime()){
		
//		if(fftnYrsBckDate.getTime()<=dobDate.getTime()
//				&&dobDate.getTime()<=twentyYrsBckDate.getTime()){
			throw new InvalidDOBException("DOB not falling under date range");
		}
		return true;
		
	}
}
