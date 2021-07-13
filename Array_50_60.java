class Array_50_60{
	public static void main(String args []){
		int sum =50;
		int []sum_array = new int[60];
		for(int x=50;x<60;x++){
			sum=sum+x;
			sum_array[x]=sum;
		}
		for(int y = 50;y<60;y++){
		System.out.println(sum_array[y]);
		}	
	}
}