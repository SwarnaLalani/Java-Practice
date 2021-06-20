import java.util.Scanner;
class Average{
  public static void main (String[]args){
    Scanner a = new Scanner(System.in);
    System.out.println("Enter the first number");
    int x = a.nextInt();

    System.out.println("Enter the second number");
    int y = a.nextInt();

    System.out.println("Enter the third number");
    int z = a.nextInt();

    System.out.println("Enter the fourth number");
    int p = a.nextInt();

    System.out.println("Enter the fifth number");
    int q = a.nextInt();

    int aver = (x+y+z+p+q)/5;
    System.out.println("Average of five given numbers = " + aver);
  }
}
