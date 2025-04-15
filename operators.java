class operators{
	public static void main(String args[]){
		int a = 10,b = 8;
		//Arithmetic operators
		System.out.println("Performing all the arithmetic operations");
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a/b);
		System.out.println(a%b);
		System.out.println(-a%b);
		System.out.println(a%-b);

		//Logical operators and comparison operators
		System.out.println("Performing all the logical operations and comparison operations");
		if(a>b && b<10) System.out.println("Good work!");
		if(a>b  || b<10) System.out.println("Good job!");
		if(a!=b) System.out.println("not equal");

		//Bitwise operators
		System.out.println("Performing the bit manipulation operations");
		System.out.println(a&b);
		System.out.println(a|b);
		System.out.println(-a>>2);
		System.out.println(a<<b);
		System.out.println(-a>>>2);
		System.out.println(~a);
		System.out.println(~b);
		System.out.println(a^b);

		//Unary operators
		System.out.println("Performing the unary operations");
		System.out.println(a++);
		System.out.println(b--);
		System.out.println(++a + b--);
		System.out.println(++b - --b + a++ + --a);
		System.out.println(a + "and" + b);

		//instance of operator
		System.out.println("Using instance of operator");
		operators obj = new operators();
		System.out.println(obj instanceof operators);

	}
}