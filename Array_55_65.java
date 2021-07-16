class Array_55_65{
	public static void main (String args []){
		int sum = 55;
		int [] sum_array = new int [65];
		for (int x = 55; x<65; x++){
			sum = sum + x;
			sum_array[x]=sum;
		}
		for ( int y = 55; y<65; y++){
			System.out.println(sum_array[y]);
		}
	}
}