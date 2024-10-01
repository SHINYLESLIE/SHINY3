package aggregation_assignment;

public class Details2 {
	String d;
	Details e;
	public Details2( String d, Details e)
	{
		this.d =d;
		this.e =e;
	}
	public void display()
	{
		
		System.out.println("Address of the student: " + d);
	}

	public static void main(String[] args) {
		Details o = new Details("ETHAN ALEX", 9);
		Details2 o2 = new Details2("ROSEDALE Peyad", o);
		o.std();
		o2.display();
		
		// TODO Auto-generated method stub

	}

}
