class cloned implements Cloneable{
	String hair;
	String eyes;
	public static void main(String args[]) throws CloneNotSupportedException{
		cloned o = new cloned();
		o.hair = "black";
		o.eyes = "red";
		System.out.println(o.hair);
		cloned o1 = (cloned)o.clone();
		System.out.println("Eyes are "+ o1.eyes);
	}
}