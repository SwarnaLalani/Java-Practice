class Array_25_35{
	public static void main ( String args []){
		int sum = 25;
		int []sum_array = new int [35];
		for (int x = 25; x<35; x++){
			sum =  sum + x;
			sum_array[x]=sum;
		}
		for (int y = 25; y<35; y++){
			System.out.println ( sum_array [y]);
		}
	}
}