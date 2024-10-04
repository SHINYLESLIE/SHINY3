package tpr;

public class Abs3 implements Abs2, Abs1{

	public static void main(String[] args) {
		Abs1 o = new Abs3();
		o.details1();
		Abs2 o1 = new Abs3();
		o1.details2();
		// TODO Auto-generated method stub

	}

	@Override
	public void details2() {
		System.out.println("District: "+c);
		System.out.println("Pincode: "+d);
		
		// TODO Auto-generated method stub
		
	}

	@Override
	public void details1() {
		System.out.println("Name: "+a);
		System.out.println("Place: "+b);
		// TODO Auto-generated method stub
		
	}

}
