class ArrayEg_N{
	public static void main(String args[]){
		int sum=20;
		int [] sum_array=new int[30];
		for(int x=20;x<30;x++){
			sum = sum+x;
			sum_array[x]=sum;
		}
		for(int y=20;y<30;y++){
		System.out.println(sum_array[y]);	
		}
	}
}