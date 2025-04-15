
class quadratic{
	public static void main(String args[]){
		int a = 4,b=5,c =10;
		if(a==0||b==0){
			System.out.println(c);
			return ;
		}
		float d = b*b - 4*a*c;
		double r1,r2;
		if(d == 0){
			r1 = -b/(2*a);
			System.out.println("roots are" + r1 +"and" + r1);
		}else if(d>0){
			r1 = (-b+Math.sqrt(d))/(2*a);
			r2 = (-b-Math.sqrt(d))/(2*a);
			System.out.println("roots are" + r1 +"and" + r2);
		}else{
			d = -d;
			double det = Math.sqrt(d)/(2.0*a);
			r1 = -b/(2.0*a);
			System.out.println("roots are" + r1 + "+" + det + "i");
			System.out.println("roots are" + r1 + "-" + det + "i");
		}
	}
	
}