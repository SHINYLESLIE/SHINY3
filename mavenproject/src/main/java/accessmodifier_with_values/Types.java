package accessmodifier_with_values;

public class Types {
	int a;
	int b;
	int c;
	int d;
	int e;
	int f;
	public void public_add(int x,int y)
	{
		a=x;
		b=y;
		c=x+y;
		System.out.println("Sum="+c);
					
		
	}
	private void private_substraction(int x, int y)
	{
		a=x;
		b=y;
		d=x-y;
		System.out.println("Difference= "+d);
	}
	protected void protected_multiplication(int x, int y)
	{
		a=x;
		b=y;
		e= x*y;
		System.out.println("Product= "+e);
	}
	void defaullt_division(int x, int y)
	{
		a=x;
		b=y;
		f= x/y;
		System.out.println("Quotient= "+f);
	}

	public static void main(String[] args) {
		Types g= new Types();
		g.public_add(10, 2);
		g.private_substraction(10, 2);
		g.protected_multiplication(10, 2);
		g.defaullt_division(10, 2);
		// TODO Auto-generated method stub

	}

}
