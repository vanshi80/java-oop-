class palindrome{
	public static void main(String args[]){
		int num = 152;
		int n = num,rev = 0;
		while(n!=0){
			int rem = n%10;
			rev = rev*10+rem;
			n/=10;
		}
		if(num==rev) System.out.println("The num is palindrome");
		else System.out.println("The num is not palindrome");
	}
}