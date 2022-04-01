package java8tasks;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.ZoneId;
import java.time.ZoneOffset;
/*How are Collections different from Stream? Exaplain the following date and time with example 1.LocalDate 2.LocalTime 3.LocalDateTime APIs.*/
public class Problem4 {
	public static void main(String[] args) {
		LocalDate today=LocalDate.now();//LocalDate
		System.out.println("Current date="+today);
		LocalDate firstDay_2014=LocalDate.of(2013,Month.MARCH,7);
		System.out.println("Specific Date="+ firstDay_2014);
		LocalDate todayKolkata=LocalDate.now(ZoneId.of("Asia/Kolkata"));
		System.out.println("Current Date in IST="+todayKolkata);
		LocalDate dateFromBase=LocalDate.ofEpochDay(365);
		System.out.println("365th day from base date="+dateFromBase);
		LocalDate hundredDay2013=LocalDate.ofYearDay(2013, 100);
		System.out.println("100th day of 2013="+hundredDay2013);

		LocalTime time=LocalTime.now();//LocalTime
		System.out.println("Current Time="+time);
		LocalTime SpecificTime=LocalTime.of(11,12,13,15);
		System.out.println("Specific Time of Day="+SpecificTime);
		LocalTime timeKolkata=LocalTime.now(ZoneId.of("Asia/Kolkata"));
		System.out.println("Current Timein IST="+timeKolkata);
		LocalTime specficSecondTime=LocalTime.ofSecondOfDay(10000);
		System.out.println("10000th second time="+specficSecondTime);

		LocalDateTime today1=LocalDateTime.now();//LocalDateTime
		System.out.println("Current DateTime="+today1);
		today1=LocalDateTime.of(LocalDate.now(),LocalTime.now());
		System.out.println("Current DateTime="+today1);
		LocalDateTime specificDate=LocalDateTime.of(2013, Month.SEPTEMBER,10,20,30);
		System.out.println("Specific Date="+ specificDate);
		LocalDateTime todayKolkata1=LocalDateTime.now(ZoneId.of("Asia/Kolkata"));
		System.out.println("Current Date in IST="+todayKolkata1);
		LocalDateTime dateFromBase1=LocalDateTime.ofEpochSecond(10000,1,ZoneOffset.UTC);
		System.out.println("10000th second time from 01/01/1970="+dateFromBase1);
	}

}
