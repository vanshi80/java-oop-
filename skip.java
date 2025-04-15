class whileloop{
	public static void main(String args[]){
		int n =10,i=0;
		while(i<n){
			if(i%2==0){
				i++;
				continue;
			}
			System.out.println(i);
			i++;
		}
	}
}