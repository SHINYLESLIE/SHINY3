package polymorphism;

public class Substraction extends Addition {
	int s;
	public void operation(int a, int b)
	{
		super.operation(80,50);
		x=a;
		y=b;
		s= a-b;
		System.out.println("Difference between "+ a+ " and "+b+ " is "+s);
		
	}

	public static void main(String[] args) {
		Substraction o = new Substraction();
		o.operation(80,50);
		// TODO Auto-generated method stub

	}

}
