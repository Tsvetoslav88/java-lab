package oraclecertifications.ocp.datesstringlocalization;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class DateTimeFormatting {

	public static void main(String[] args) {
		///////////////Predefine formats ////////////
		//ISO Formatting
		LocalDate date = LocalDate.of(2020, Month.JANUARY, 20);
		LocalTime time = LocalTime.of(11, 12, 34);
		LocalDateTime dateTime = LocalDateTime.of(date, time);
		System.out.println(date.format(DateTimeFormatter.ISO_LOCAL_DATE));//2020-01-20
		System.out.println(time.format(DateTimeFormatter.ISO_LOCAL_TIME));//11:12:34
		System.out.println(dateTime.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME));//2020-01-20T11:12:34
		
		//Localize methods - ofLocalizedDate, ofLocalizedDateTime and ofLocalizedTime 
		DateTimeFormatter shortDateTime = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
		System.out.println(dateTime.format(shortDateTime)); // 1/20/20 - We can reverse the order without cause result changing
		System.out.println();
		
		/////////////Custom formats//////////////
		DateTimeFormatter f = DateTimeFormatter.ofPattern("MMMM dd, yyyy, hh:mm");
		System.out.println(dateTime.format(f)); // January 20, 2020, 11:12
		
		
		
	}

}
