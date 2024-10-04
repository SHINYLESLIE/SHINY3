package finalkeyword;

public class Finalexam extends Finalmethod {
	final int a;
	public Finalexam()
	{
		int a= 54;
	}
	public void base()
	{
		System.out.println(a);
	}
	/*public final void data()
	{
	}
	*/Cant override a final method but can inherit.
	public static void main(String[] args) {
		Finalexam o = new Finalexam();
		o.base();
		o.data();
		// TODO Auto-generated method stub

	}

}
