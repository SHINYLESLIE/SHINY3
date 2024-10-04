package tpr;

public class Poly2 extends Poly1 {
	int f;
	public void sub()
	{
		f= a-b;
		System.out.println("Difference between "+ a +" and "+b +"= "+f);
	}

	public static void main(String[] args) {
		System.out.println("Let the numbers be 75 and 25");
		Poly2 o = new Poly2();
		o.add(75,25);
		o.sub();
		
		// TODO Auto-generated method stub

	}

}
