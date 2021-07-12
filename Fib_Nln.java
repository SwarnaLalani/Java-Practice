class Fib_Nln{
	public static void main(String [] args){
		int num_one=0,num_two=1,fib;
		
		System.out.println("0 1");
		
		for(int count=3;count<=10;count++){
			
			fib=num_one+num_two;
			num_one=num_two;
			num_two=fib;
			System.out.print(" "+fib);
			
			if (count==10){
				System.out.println("are the fibnacci numbers upto "+count);
			}
		}
	}
}