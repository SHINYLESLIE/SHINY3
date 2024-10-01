package testpaper;

public class Addition {
static int a;
static int b;
static int c;
public static int add(int x, int y)
{
	a=x;
	b=y;
	c= x+y;
	return c;
}
	public static void main(String[] args) {
		Addition.add(5,7);
		System.out.println("Let the numbers be " + a + " and "+b);
		System.out.println("Sum of the given numbers= "+ c );
		
		
		// TODO Auto-generated method stub

	}

}
