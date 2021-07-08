class ArrayEg_5{
	public static void main(String args[]){
		
		int sum = 0;
		int [] sum_array=new int[20];
		
		for(int x=0;x<20;x++){
			sum =sum+x;
			sum_array[x]=sum;
		}
		for(int y = 0; y<20;y++){
			System.out.println(sum_array[y]);
		}
	}
}