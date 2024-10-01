package encapsulation_assignment;

public class Details {
	private int a;
	
	public void pinset(int a)
	{
		this.a= a;
		
	}
	public void pinget()
	{
		if (a==1001)
		{
			System.out.println("Pin is valid "+a);
		}
		else if (a== 1234)
		{
			System.out.println("Pin is valid "+a);
		}
		else if (a== 1212)
		{
		System.out.println("Pin is valid "+a);
		}
		else
		{
			System.out.println("Pin is invalid");
		}
	}

		// TODO Auto-generated method stub


}
