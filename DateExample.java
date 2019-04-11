import java.util.Scanner;


public class DateExample {
	
	static boolean isLeapYear(int y){
		if(y%4==0||y%400==0||y%100==0)
			return true;
		return false;
	}
	
	public static void main(String args[]){
		System.out.println("Enter day month year and days to add");
		Scanner sc=new Scanner(System.in);
		int day=sc.nextInt();
		int month=sc.nextInt();
		int year=sc.nextInt();
		int addDays=sc.nextInt();
		int totaldays=0;
		int completedDays=0;
		if(!isLeapYear(year)){
			totaldays=365;
		switch(month){
		case 1: completedDays=day;
		case 2: completedDays=31+day;
		case 3: completedDays=59+day;
		case 4: completedDays=90+day;break;
		case 5:completedDays=120+day;break;
		case 6: completedDays=151+day;break;
		case 7: completedDays=181+day;break;
		case 8:completedDays=212+day;break;
		case 9:completedDays=243+day;break;
		case 10:completedDays=273+day;break;
		case 11:completedDays=304+day;break;
		case 12:completedDays=335+day;break;
		
		
		}
		
	}
	}

}
