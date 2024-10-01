package abstraction;

public abstract class Basic {
	static String a= "SHINY LESLIE";
	long b;
	String c;
	long d;
	public abstract void data();
	public Basic(String j, long m)
	{
		c=j;
		d=m;
		System.out.println("City: "+ j);
		System.out.println("Pin: "+ d);
	}

public static void name(String n)
{
	n=a;
	
}
public void number(long p)
{
	b=p;
	System.out.println("Phone No: "+ p);
}
}