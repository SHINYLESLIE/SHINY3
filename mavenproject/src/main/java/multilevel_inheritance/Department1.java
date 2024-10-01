package multilevel_inheritance;

public class Department1 extends Id
{
	String d;
public void dep(String f)
{
d=f;
System.out.println("Department of the candidate: "+ f);
}

	public static void main(String[] args) {
	Department1 g= new Department1();
	g.name1("SHINY LESLIE");
	g.id1("shinyleslie91@gmail.com");
	g.dep("IT");
		// TODO Auto-generated method stub
	}
}