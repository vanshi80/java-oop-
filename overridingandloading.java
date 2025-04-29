class A{
	void display(){
		System.out.println("this hello is from base class");
	}
	int add(int a, int b){
		return a+b;
	}
	int add(int a, int b, int c){
		return a+b+c;
	}
	int add(String a, String b){
		return a+b;
	}
}
class B extends A{
	void display(){
		System.out.println("This hello is from derived class");
	}
}
class mainclass{
	public static void main(String args[]){
		B b = new B();
		b.display();
		A a = new A();
		a.add(2,3);
		a.add(2,4,3);
		System.out.println(a.add("Hello","java"));
	}	
}