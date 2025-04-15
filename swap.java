class swap{
public static void main(String args[]){
int a = 6,b=7;
	a = a^b;
	b = a^b;
	a = a^b;
	System.out.println("After swapping a and b are"+ a + " " + b);
}
	
}