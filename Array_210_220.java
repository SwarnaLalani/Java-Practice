class Array_210_220{
	public static void main ( String args []){
		int sum = 210;
		int []sum_array=new int[220];
		for (int x = 210;x<220;x++){
			sum = sum + x;
			sum_array[x]=sum;
		}
		for (int y = 210;y<220;y++){
			System.out.println(sum_array[y]);
		}
	}
}