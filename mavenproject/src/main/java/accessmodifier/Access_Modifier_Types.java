package accessmodifier;

public class Access_Modifier_Types {
	public void public1()
	{
		System.out.println("PUBLIC METHOD");
	}
	private void private1()
	{
		System.out.println("PRIVATE METHOD");
	}
	protected void protected1()
	{
		System.out.println("PROTECTED METHOD");
	}
	void default1()
	{
		System.out.println("DEFAULT METHOD");
	}

	public static void main(String[] args) {
		Access_Modifier_Types a = new Access_Modifier_Types();
		a.public1();
		a.private1();
		a.protected1();
		a.default1();
		// TODO Auto-generated method stub

	}
	}
