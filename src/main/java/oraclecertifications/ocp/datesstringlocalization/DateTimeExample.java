package oraclecertifications.ocp.datesstringlocalization;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;

public class DateTimeExample {

	public static void main(String[] args) {
		// Creation of current Date, Time, DateTime and ZoneDateTime
		System.out.println(LocalDate.now());// 2018-04-18
		System.out.println(LocalTime.now());// 10:49:52.206
		System.out.println(LocalDateTime.now());// 2018-04-18T10:49:52.206
		System.out.println(ZonedDateTime.now());// 2018-04-18T10:49:52.207+03:00[Europe/Helsinki]

		// Creation of specific Date, Time, DateTime and ZoneDateTime
		LocalDate date1 = LocalDate.of(2015, Month.JANUARY, 20);
		LocalTime time1 = LocalTime.of(6, 15, 30);
		LocalDateTime dateTime1 = LocalDateTime.of(date1, time1);
		ZoneId zone = ZoneId.of("US/Eastern");
		ZonedDateTime zoned2 = ZonedDateTime.of(date1, time1, zone);
		
		
		//Manipulating Dates and Times
		LocalDate date = LocalDate.of(2014, Month.JANUARY, 20);
		System.out.println(date); // 2014-01-20
		date = date.plusDays(2);//plusWeeks, plusMonths, plusYears, minusDays, minusHours, minusSeconds
		System.out.println(date); // 2014-01-22
		
		//Period 
		Period annually = Period.ofYears(1);//ofMonths, ofWeeks, ofDays or of(1, 0, 7)// every year and 7 days
		LocalDate start = LocalDate.of(2015, Month.JANUARY, 1);
		LocalDate end = LocalDate.of(2015, Month.MARCH, 30);
		Period period = Period.ofMonths(1); // create a period
		performAnimalEnrichment(start, end, period);
		
		//Duration
		Duration daily = Duration.ofDays(1); // PT24H - ofHours, ofMinutes, ofSeconds, ofMillis and ofNanos
		Duration daily1 = Duration.of(1, ChronoUnit.DAYS);
		LocalTime one = LocalTime.of(5, 15);
		LocalTime two = LocalTime.of(6, 30);
		System.out.println(ChronoUnit.HOURS.between(one, two)); // 1
		
		//Instants - represents a specific moment in time in the GMT time zone
		Instant now = Instant.now();
		   // do something time consuming
		for(int i=0; i<10000000; i++) {
			
		}
		Instant later = Instant.now();
		Duration duration = Duration.between(now, later);
		System.out.println(duration.toMillis());//10
	}

	private static void performAnimalEnrichment(LocalDate start, LocalDate end, Period period) {
		LocalDate upTo = start;
		if(upTo.isBefore(end)) {
			System.out.println("give new toy: " + upTo);
			upTo.plus(period);
		}
	}
	
}
