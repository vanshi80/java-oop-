class paraCons{
	int a;
	int b;
	public paraCons(int c,int d){
		a = c;
		b = d;
	}
	void addition(){
		System.out.println(a+b);
	}	
}
class mainclassparacons{
	public static void main(String args[]){
		paraCons o = new paraCons(2,3);
		System.out.println(o.a + " " + o.b);
		o.addition();
	}
}