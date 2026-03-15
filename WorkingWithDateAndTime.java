import java.time.LocalDate;
import java.time.LocalTime;

public class WorkingWithDateAndTime{
	public static void main(String[] args){
		
		LocalDate currentDate = LocalDate.now();
		LocalDate myDate = LocalDate.of(2014,5,17);
		LocalDate resumptionDate = LocalDate.parse("2026-06-17");
		
		if(myDate.equals(currentDate)){
			System.out.println("Today is your appointment day");
		}
		else{
			System.out.println("Today is not your appointment day");
		}	
		
		System.out.printf("Working for date");
		System.out.printf("Today's data is %s%n",currentDate);
		System.out.printf("The wedding date is %s%n",myDate);
		System.out.printf("The resumption date is %s%n",resumptionDate);
		System.out.printf("The year is %s%n",currentDate.getYear());
		System.out.printf("The month is %s%n",currentDate.getMonth());
		System.out.printf("The day  is %s%n",currentDate.getDayOfMonth());
		System.out.printf("My exams on the %s%n",currentDate.plusDays(7));
		System.out.printf("The year is %s%n",currentDate.plusYears(2));
		
		
		System.out.println("Working with time");
		LocalTime currentTime = LocalTime.now();
		LocalTime myTime = LocalTime.of(2,3,12);
		LocalTime resumptionTime = LocalTime.parse("3:55:17");
		
	
		System.out.printf("The time is %s%n",currentTime);
		System.out.printf("The time for my weddings is %s%n",myTime);
		System.out.printf("The resumption time is %s%n",resumptionTime);
		System.out.printf("The hour is %s%n",currentTime.getHour());
		System.out.printf("The minutes is %s%n",currentTime.getMinute());
		System.out.printf("The seconds  is %s%n",currentTime.getSecond());
		System.out.printf("My exams time will be by %s%n",currentTime.plusHours(2));
		System.out.printf("The time is %s%n",currentTime.plusSeconds(2));
			
	}
}	
	