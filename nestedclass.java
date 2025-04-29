//this is the example of non static nested class
class outer{
	int a = 50;
	void access(){
		System.out.println("Outer class message");
	}
	//We need to create the object of the inner class in order to access its properties in the outer class
	void display(){
		Inner i = new Inner();
		System.out.println("Inner class variable " + i.b);
		i.display();
	}
	class Inner{
		int b = 30;
		void display(){
			access();
			System.out.println(a);
			System.out.println("Hello Inner Class");
		}
	}
}
class mainnested{
	public static void main(String args[]){
		outer o = new outer();
		//outer.Inner i = o.new Inner();
		i.display();
		o.display();
	}
}