class fibo{
	public static void main(String args[]){
		int n = 5,first = 0,second =1;
		System.out.println(first);
		System.out.println(second);
		for(int i=3;i<=n;i++){
			int third = first+second;
			System.out.println(third);
			first = second;
			second = third;
		}
	}
}