class Students{
	public void meth2(int a){
		System.out.println("Number of students in the class is" + a);
	}
	public static void main ( String args []){
		Students x = new Students();
		x.meth2(50);
	}
}