import java.util.Scanner;
class Mul1_2{
  public static void main(String[]args){
    Scanner a = new Scanner(System.in);
    System.out.println("Enter the first number");
    int x = a.nextInt();

    System.out.println("Enter the second number");
    int y = a.nextInt();

    int Mul= x*y;
    System.out.println("Multiplication of two given numbers = " + Mul);
  }
}
