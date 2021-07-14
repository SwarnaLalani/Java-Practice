class Array_110_120{
	public static void main (String args []){
		int sum = 110;
		int [] sum_array = new int [120];
		for ( int x = 110 ; x < 120 ; x ++){
			sum = sum + x;
		sum_array [x] = sum;
	}
		for (int y = 110 ; y < 120 ; y++){
				System.out.println(sum_array [y]);
	}
	}
}