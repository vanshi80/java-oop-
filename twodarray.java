class twodarray{
	public static void main(String args[]){
		int[] arr[] = {{1,2,3},{3,4,5},{7,8,9}};
		for(int i = 0;i<3;i++){
			for(int j = 0;j<3;j++){
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();
		//printing array using for each loop
		for(int[] x:arr){
			for(int y:x){
				System.out.print(y+" ");
			}
			System.out.println();
		}
	}
}