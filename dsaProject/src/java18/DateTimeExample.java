package java18;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class DateTimeExample {
	public static void main(String[] args) {
		// LocalDate example: current date and specific date
		LocalDate currentDate = LocalDate.now();
		LocalDate specificDate = LocalDate.of(2021, 12, 25);
		System.out.println("Current Date: " + currentDate);
		System.out.println("Specific Date: " + specificDate);

		// LocalTime example: current time and specific time
		LocalTime currentTime = LocalTime.now();
		LocalTime specificTime = LocalTime.of(14, 30);
		System.out.println("Current Time: " + currentTime);
		System.out.println("Specific Time: " + specificTime);

		// LocalDateTime example: current date and time, specific date and time
		LocalDateTime currentDateTime = LocalDateTime.now();
		LocalDateTime specificDateTime = LocalDateTime.of(2021, 12, 25, 14, 30);
		System.out.println("Current DateTime: " + currentDateTime);
		System.out.println("Specific DateTime: " + specificDateTime);

		// ZonedDateTime example: current date and time with time zone, specific date
		// and time with time zone
		ZonedDateTime currentZonedDateTime = ZonedDateTime.now();
		ZonedDateTime specificZonedDateTime = ZonedDateTime.of(2021, 12, 25, 14, 30, 0, 0,
				ZoneId.of("America/New_York"));
		System.out.println("Current ZonedDateTime: " + currentZonedDateTime);
		System.out.println("Specific ZonedDateTime: " + specificZonedDateTime);

		// Period example: period between two dates
		LocalDate startDate = LocalDate.of(2020, 1, 1);
		LocalDate endDate = LocalDate.of(2021, 6, 15);
		Period period = Period.between(startDate, endDate);
		System.out.println("Period: " + period.getYears() + " years, " + period.getMonths() + " months, "
				+ period.getDays() + " days");

		// Duration example: duration between two times
		LocalTime startTime = LocalTime.of(10, 30);
		LocalTime endTime = LocalTime.of(15, 45);
		Duration duration = Duration.between(startTime, endTime);
		System.out.println("Duration: " + duration.toHours() + " hours, " + duration.toMinutes() % 60 + " minutes");

		// Date and Time arithmetic operations
		LocalDate oneMonthLater = currentDate.plusMonths(1);
		LocalTime twoHoursLater = currentTime.plusHours(2);
		LocalDateTime oneDayLater = currentDateTime.plusDays(1);
		ZonedDateTime oneWeekLater = currentZonedDateTime.plusWeeks(1);

		System.out.println("One Month Later: " + oneMonthLater);
		System.out.println("Two Hours Later: " + twoHoursLater);
		System.out.println("One Day Later: " + oneDayLater);
		System.out.println("One Week Later: " + oneWeekLater);
	}
}
