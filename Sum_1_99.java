class Sum_1_99{
	public static void main(String [] args){
		int i = 1;
		int sum = 0;
		while (i<=99){
			sum = sum + i;
			i = i+2;
		}
			System.out.println("Sum of Odd Numbers from 1 to 99 is" + sum);
	}
}