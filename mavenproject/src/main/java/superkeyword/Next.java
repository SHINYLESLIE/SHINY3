package superkeyword;

public class Next extends Basic
{
	String e;
	int f;
	char g;
	public Next(String m, int n, char o)
	{
	super("TUTTU", 46, 'A');
	m=e;
	f=n;
	g=o;
	System.out.println("Name: "+m);
	System.out.println("Mark: "+n);
	System.out.println("Grade: "+o);
	super.display();
	}


	public static void main(String[] args) {
		Next j1 = new Next("MITTU", 42, 'B');
		Next j2 = new Next("KITTU", 39, 'C');
		
		// TODO Auto-generated method stub

	}

}
