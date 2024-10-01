package inheritance;

public class Child_Substract extends Parent_Add{
	int d;
	public void substract()
	{
	d= a-b;
	System.out.println("Difference="+d);
	}
	

	public static void main(String[] args) {
		Child_Substract s= new Child_Substract();
		s.add(7,5);
		s.substract();
		// TODO Auto-generated method stub

	}

}
