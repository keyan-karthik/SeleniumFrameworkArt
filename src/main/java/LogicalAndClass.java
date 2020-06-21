
public class LogicalAndClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		if(true&&false)
		{
			System.out.println("first condition should be true to evaluate second"+true);
		}
		if(false&&true)
		{
			System.out.println("first condition may not be true to evaluate second"+false);
		}
	}

}
