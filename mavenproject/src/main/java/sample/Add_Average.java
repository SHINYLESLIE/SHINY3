package sample;

public class Add_Average {
	int a;
	int b;
	int c;
	int d;
	
		public void add(int x,int y)
		{
			a=x;
			b=y;
			c=x+y;
			System.out.println("Sum ="+c);
		}
		public void average()
		{
			int d= c/2;
			System.out.println("Average="+d);
		}

	public static void main(String[] args) {
		Add_Average e= new Add_Average();
		e.add(4,6 );
		e.average();
		// TODO Auto-generated method stub

	}

}
