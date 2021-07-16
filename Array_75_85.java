class Array_75_85{
	public static void main ( String args []){
		int sum = 75;
		int [] sum_array = new int [85];
		for (int x = 75; x < 85; x++){
			sum = sum + x;
			sum_array[x] = sum;
		}
		for ( int y = 75; y < 85; y++){
			System.out.println( sum_array [y]);
		}
	}
}