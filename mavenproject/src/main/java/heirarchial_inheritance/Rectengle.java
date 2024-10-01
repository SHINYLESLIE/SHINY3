package heirarchial_inheritance;

public class Rectengle extends Triangle{
	int g;
	int h;
public void area3(int i, int j)
{
	g=i;
	h=j;
	int l= i*j;
	System.out.println("Area of rectangle= "+ l);
}

	public static void main(String[] args) {
		Rectengle o =new Rectengle();
		o.area3(3,5);
		o.area1(5, 7);
		
		// TODO Auto-generated method stub

	}

}
