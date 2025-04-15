class noArg{
	int a;
	int b;
	public noArg(){
		a = 10;
		b = 12;
	}
	void addition(){
		System.out.println(a+b);
	}

}
class mainclassnoarg{
	public static void main(String args[]){
		noArg o = new noArg();
		System.out.println(o.a + " " + o.b);
		o.addition();
	}
}