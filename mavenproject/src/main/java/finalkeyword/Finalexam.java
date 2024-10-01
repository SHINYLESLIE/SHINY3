package finalkeyword;

public class Finalexam extends Finalmethod {
	final int a;
	public Finalexam()
	{
		a= 54;
	}
	public void base()
	{
		System.out.println(a);
	}
	/*public final void data()
	{
	}
	*/Cant override but can inherit.
	public static void main(String[] args) {
		Finalexam o = new Finalexam();
		o.base();
		o.data();
		// TODO Auto-generated method stub

	}

}
