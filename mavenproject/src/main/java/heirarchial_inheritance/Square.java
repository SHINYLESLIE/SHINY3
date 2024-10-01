package heirarchial_inheritance;

public class Square extends Triangle {
int d;
public void area2(int e)
{
	d=e;
	int f= e*e;
	System.out.println("Area of square="+ f);
}
	public static void main(String[] args) {
		Square z = new Square();
		z.area2(4);
		z.area1(5,7);
		
		// TODO Auto-generated method stub

	}

}
