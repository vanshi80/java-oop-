class first{
	int a;
	int b;
	public first(int c,int d){
		a =c;
		b= d;
	}
	public first(int c){
		a = 10;
		b = c;
	}
	public first(){
		a  =30;
		b = 54;
	}
}
class mainconsoverload{
	public static void main(String args[]){
		first o1 = new first();
		System.out.println(o1.a + " " + o1.b);
		first o2 = new first(4);
		System.out.println(o2.a + " " + o2.b);
		first o3 = new first(80,43);
		System.out.println(o3.a + " " + o3.b);
	}
}