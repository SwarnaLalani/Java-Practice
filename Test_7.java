class Test_7{
	public static int mulNumbers(int a, int b, int c){
	int mul = a*b*c;
	return mul;
}
	public static void main ( String args []){
		int num1 = 10, num2 = 30,  num3 = 5, result;
		result = mulNumbers(num1,num2, num3);
		System.out.println("mul of " + num1 + "and" + num2 + "and" +num3+ "is" + result);
	}
}