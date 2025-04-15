class constant{
	public static void main(String args[]){
		final int a = 0x16,b = 016;
		System.out.println(a);
		// a = 10; (here the error will be shown because we can not modify the value that is made final)
		System.out.println(b);
		boolean c = true;	
		System.out.println(c);
		String str = "Vanshika";
		System.out.println(str);
	}
}