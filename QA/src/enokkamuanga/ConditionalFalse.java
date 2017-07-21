package enokkamuanga;

public class ConditionalFalse
{
		public static int sum (int a, int b, Boolean c)
		{
			if (c == true)
			{
				return a+b;
		}
	
	
	
	else
{
	return a*b;
}
		}


public static void main(String[] args) {
	System.out.println(sum (3,3,false));
}

}
