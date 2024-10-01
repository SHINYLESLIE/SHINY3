package sample;

public class Sample_Buffer {

	public static void main(String[] args) {
		StringBuffer b= new StringBuffer("SHINY");
		b.insert(3, "n");
		System.out.println(b);
		b.replace(0, 4, "A");
		System.out.println(b);
		b.delete(2, 3);
		System.out.println(b);
		b.reverse();
		System.out.println(b);
		// TODO Auto-generated method stub

	}

}
