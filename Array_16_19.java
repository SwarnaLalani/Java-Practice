class Array_16_19{
	public static void main ( String args []){
		int sum = 16;
		int []sum_array = new int [19];
		for (int x = 16; x<19 ; x++){
			sum = sum+x;
			sum_array[x]=sum;	
		}
		for (int y = 16; y<19; y++){
			System.out.println(sum_array[y]);
		}
	}
}