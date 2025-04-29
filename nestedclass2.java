class outer{
	static int a = 50;
	static void display(){
		System.out.println("This is the display of outer class");
	}
	static class inner{
		void message(){
			System.out.println("Hello from inner class");
			display();
			System.out.println(a);
		}
	}
}
class maininner{
	public static void main(String args[]){
		//Since it is a static inner class so we do not require the instance of the outer class to instantiate it.
		outer.inner o = new outer.inner();
		o.message();
	}
}