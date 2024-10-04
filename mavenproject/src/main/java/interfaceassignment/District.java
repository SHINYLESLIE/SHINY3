package interfaceassignment;

public class District implements Place{
	String d= "Thiruvananthapuram";
	public void details3()
	{
		System.out.println("District: "+d);
	}

	public static void main(String[] args) {
		Place o = new District();
		o.details1();
		o.details2();
		District o1 = new District();
		o1.details3();
		// TODO Auto-generated method stub

	}

	@Override
	public void details1() {
		System.out.println("Name: "+n);
		System.out.println("Phone No: "+m);
		// TODO Auto-generated method stub
		
	}

	@Override
	public void details2() {
		System.out.println("Place: "+p);
		System.out.println("Pin code: "+i);
		// TODO Auto-generated method stub
		
	}

}
