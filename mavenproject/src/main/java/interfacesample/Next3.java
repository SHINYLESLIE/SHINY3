package interfacesample;

public class Next3 implements Next2, Newinterface {
int d;
	public static void main(String[] args) {
		Next3 j = new Next3();
		j.add();
		j.sub();
		
		// TODO Auto-generated method stub

	}

	@Override
	public void add() {

		// TODO Auto-generated method stub
		
	}

	@Override
	public void sub() {
		int d = b-a;
		System.out.println(d);
		// TODO Auto-generated method stub
		
	}

}
