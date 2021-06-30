import java.util.Scanner;
class WeekDays_7{
	public static void main(String [] args){
		Scanner x = new Scanner(System.in); // Creat a Scanner Object
		
		System.out.println("Enter Number 1 to 7 to know the name of the day"); // Output User InputContext
		int a = nextInt();
		
		switch (a){
			case 1:
			System.out.println("Sunday");
			break;
			
			case 2:
			System.out.println("Monday");
			break;
			
			case 3:
			System.out.println("Tuesday");
			break;
			
			case 4:
			System.out.println("Wednesday");
			break;
			
			case 5:
			System.out.println("Thursday");
			break;
			
			case 6:
			System.out.println("Friday");
			break;
			
			case 7:
			System.out.println("Saturday");
			break;
			
			default:
			System.out.println("invalid number");
		}
		
		
		
	}
}