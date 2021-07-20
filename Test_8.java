class Test_8{
	public static int addNumbers(int a, int b){
		int sum = a+b;
		return sum;
	}
	public static void main(String []args){
		int num1 = 10, num2 = 30, result;
		result = addNumbers(num1,num2);
		System.out.println("Sum of" + num1+ "and" + num2 + "is" + result);
	}
}