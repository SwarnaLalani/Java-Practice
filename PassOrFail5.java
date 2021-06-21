class PassOrFail5{
	public static void main(String[]args){
		int science_mark=75;
		if(science_mark>40){
			Result='P';
		}
		else{
			Result='F';
		}
		else{
			if(science_mark<0){
				Result='i';
			}
			if(science_mark>100){
				Result='i';
				System.out.println(Result);
				System.out.println("If obtained a P, means, pass, if obtained f means, if obtained I means, invalid")
			}
		}
	}
}