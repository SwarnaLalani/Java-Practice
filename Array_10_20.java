class Array_10_20{
	
	public static void main ( String args []) {
		
		int sum = 10 ;
		
		int [] sum_array = new int [20] ;
		
		for ( int x = 10 ; x < 20 ;  x++ ) {
			
			sum = sum + x ;
			
			sum_array [x] = sum ;
		}
		
		for (int y = 10; y < 20; y++ ) {
			
			System.out.println ( sum_array [ y ]) ;
		}
	}
}