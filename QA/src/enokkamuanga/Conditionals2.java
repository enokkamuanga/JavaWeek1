package enokkamuanga;

public class Conditionals2
{
	
	public static void main(String[] args) {
	System.out.println(sum (3,3,false));
}
		public static int sum (int a, int b, Boolean c)
		{
			if (c == true)
			{
				return a+b;
		}
			else if (a == 0)
			{
				return b;
			}
			else if (b == 0)
			{
				return a;
			}
	else
			{
	return a*b;
			}
		}




}
