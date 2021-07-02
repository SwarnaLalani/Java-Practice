class TestCon_1{
	public static void main(String [] args){
		for(int i=1;i<=10;i++){
			if(i==2){
				continue;
			}
			System.out.println(i);
		}
		System.out.println("the end of this program");
	}
}