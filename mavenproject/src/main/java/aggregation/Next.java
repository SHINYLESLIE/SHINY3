package aggregation;

public class Next {
int z;
Base w;
public Next(int z, Base w)
{
	this.z= z;
	this.w= w;
}
public void display()
{
	System.out.println(z);
	System.out.println(w.a);
	System.out.println(w.b);
	
}
	public static void main(String[] args) {
		Base o = new Base(2,3);
		Next o1 = new Next(5, o);
		o1.display();
		// TODO Auto-generated method stub

	}

}
