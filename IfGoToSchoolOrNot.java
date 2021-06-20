import java.util.Scanner;
class IfGoToSchoolOrNot{
	public static void main (String [] args){
		Scanner a = new Scanner(System.in);
		System.out.println("Enter 1, if it rains or Enter 0, if it does not");
		int rain = a.nextInt();
		if (rain==1){
		System.out.println(" On days it rains, I do not go to school");
		}else{
		System.out.println(" Though it is not sunny.");
		}
	}
}