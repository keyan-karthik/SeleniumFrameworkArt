import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class WeekDayOperationsExample {
	
	static int weekdayno;
	static dayoftheweek weekday[]=dayoftheweek.values();
	enum dayoftheweek {
    	MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY,SUNDAY;
     }
	
	private static int weekdayoperation(int n)
	{
		int amount=n%7;
		return weekday[((weekdayno-1)+amount+7)%7];
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		/*
		 * Map<Integer,String> daymap=new HashMap(); int n; int m; Scanner sc=new
		 * Scanner(System.in); daymap.put(1,"Monday"); daymap.put(2,"Tuesday");
		 * daymap.put(3,"Wednesday"); daymap.put(4,"Thursday"); daymap.put(5,"Friday");
		 * daymap.put(6,"Saturday"); daymap.put(7,"Sunday"); System.out.println(daymap);
		 * System.out.println(daymap.values()); n=sc.nextInt();
		 * System.out.println("N value is:"+n);
		 * System.out.println("N value corresponds to day is:"+daymap.get(n));
		 * System.out.println("Enter the number to manipulate with day");
		 * m=sc.nextInt(); if(daymap.get(n+m)==null) { daymap.put(n+m,
		 * daymap.get(n+m-7)); } System.out.println("Expected day is:"+daymap.get(n+m));
		 */
		/*
		 * LocalDate localdate=LocalDate.now();
		 * System.out.println("Today date is:"+localdate); DayOfWeek
		 * dayofweek=localdate.getDayOfWeek();
		 * System.out.println("Day of week is:"+dayofweek); dayofweek.plus(10);
		 * System.out.println("After operation:"+dayofweek.plus(10));
		 * System.out.println(dayoftheweek.FRIDAY.ordinal()); dayoftheweek
		 * dayofweekArr[]=dayoftheweek.values();
		 * System.out.println(dayofweekArr[Enum.ordinal()]);
		 */
		
		System.out.println("Enter the weekday in number");
		 weekdayno=sc.nextInt();
		
		System.out.println("Corresponding weekday for this number is:"+weekday[weekdayno-1]);
		System.out.println("Enter the no to do addition or subraction operation");
		int n=sc.nextInt();
		int result=
		
		System.out.println("Expected day is:"+weekday[result]);
		
     
	}

}
