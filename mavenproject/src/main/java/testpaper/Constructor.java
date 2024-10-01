package testpaper;

public class Constructor {
	static String a= "STANDARD V";
	String n;
	String m;
	String g;
	public Constructor(String x, String y, String z)
	{
		n=x;
		m=y;
		g=z;
	}
	public void details()
	{
		System.out.println("Name of the student: "+n);
		System.out.println("Mark obtained: "+m);
		System.out.println("Grade: "+g);
	}
	
	public static void main(String[] args) {
		System.out.println(a);
		Constructor s1 = new Constructor("Tuttu","38","C");
		s1.details();
		Constructor s2 = new Constructor("Mittu","49","A");
		s2.details();
		Constructor s3 = new Constructor("Kittu","42","B");
		s3.details();
		// TODO Auto-generated method stub

	}

}
