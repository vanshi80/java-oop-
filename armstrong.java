class arm{
public static void main(String args[]){
	int a = 153;
	int n =a;
	int count = 0;
	while(n!=0){
		n/=10;
		count++;
	}
	
	int sum = 0;
	n = a;
	while(n!=0){
		int rem = n%10;
		int power = 1;
		for(int j = 0;j<count;j++){
			power *= rem;	
		}
		sum+=power;
		n/=10;
	}
	
System.out.println(sum);
	if(sum == a){
		System.out.println("armstrong");
	}

}
}