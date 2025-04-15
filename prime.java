
class prime{
	public static void main(String args[]){
		int n = 23,flag = 0;
		for(int i = 2;i*i<=n;i++){
			if(n%i == 0) 
				flag = 1;
				break;
		}
		if(flag==1) System.out.println("Not a Prime number");
		else System.out.println("Prime Number");
	}	
}