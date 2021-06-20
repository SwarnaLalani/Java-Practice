import java.util.Scanner;
class TraArea{
  public static void main (String [] args){
    Scanner a = new Scanner(System.in);
    System.out.println("Enter the Base of Traingle");
    int b = a.nextInt();

    System.out.println("Enter the Height of Traingle");
    int h = a.nextInt();

    int Area = (b*h)/2;
    System.out.println("Area of Traiangle = " + Area);
 }
}
