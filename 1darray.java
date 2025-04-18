class onedarray{
	public static void main(String args[]){
		float a[] = new float[5];
		a[0] = 10.34f;
		a[1] = 20.2f;
		a[2] = 22.67f;
		a[3] = 50.43f;
		a[4] = 45.90f;  //if we do not initialise any value of the array we get 0
		for(float i:a){
			System.out.println(i+ " ");
		}
 	}	
}