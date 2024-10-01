package assignmentpoly;

public class Onseason extends Offseason{
	public void discount(int y)
	{
		super.discount(1999);
		z= 0.40*y;
		r= x-z;
		System.out.println("During Onseason;");
		System.out.println("40% discount= Rs "+z +"/-");
		System.out.println("Price of cloth after 40% discount= Rs "+r+ "/-");
	}
	

	public static void main(String[] args) {
		Onseason p = new Onseason();
		System.out.println("Let the price of the cloth be Rs 1999/-");
		p.discount(1999);
		// TODO Auto-generated method stub

	}
}


