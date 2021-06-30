import java.util.Scanner;
class Sum1_1 {
public static void main (String [] args){
	Scanner a = new Scanner(System.in);
	System.out.println("Enter the first number");
	int x = a.nextInt();
	
	System.out.println("Enter the second number");
	int y = a.nextInt();
	
	int sum = x+y;
	System.out.println("Sum of two given numbers = " + sum);
	
}
}