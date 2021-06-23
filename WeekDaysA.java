import java.util.Scanner;
class WeekDaysA{
	public static void main(String[]args){
		Scanner x = new Scanner(System.in); // Creat a new Scanner Object
		System.out.println("Enter the number of the day 1 to 10");
		
		int DayNumber == 1;
		String WeekDay;
		
		if (DayNumber == 1){
			WeekDay = Sunday;
		}
		else if (DayNumber == 2){
			WeekDay = Monday;
		}
		else if (DayNumber == 3){
			WeekDay = Tuesday;
		}
		else if (DayNumber == 4){
			WeekDay = Wednesday;
		}
		else if (DayNumber == 5){
			WeekDay = Thursday;
		}
		else if (DayNumber == 6){
			WeekDay = Friday;
		}
		else if (DayNumber == 7){
			WeekDay = Satruday;
		}
		else {
			WeekDay = invalid number;
		}	
		System.out.println("The day of the week is" = WeekDay);
	}
}