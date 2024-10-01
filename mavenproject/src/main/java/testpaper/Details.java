package testpaper;

public class Details {
	String n;
	String i;
	String p;
	public void data(String a, String b, String c)
	{
		n= a;
		i= b;
		p= c;
		
	}
	public void display()
	{
		System.out.println("Name: "+ n);
		System.out.println("Id: "+i);
		System.out.println("Place: "+p);
	}

	public static void main(String[] args) {
		Details d = new Details();
		d.data("SHINY", "shiny56", "TVM");
		d.display();
		// TODO Auto-generated method stub

	}

}
