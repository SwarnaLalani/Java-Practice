class Mul_1_15{
	public static void main(String [] args){
		int i = 1 ;
		int mul = 1;
		while (i<=15){
			mul = mul*i;
			i = i+2;
		}
			System.out.println("Multiplication of odd numbers from 1 to 15 is"+mul);
	}
}