package enokkamuanga;

public class UniqueSum {


		
			public static int sum (int a, int b, int c)
			{
				if (a == b && a == c && b == c || a == b)
				{
					return a+b;
			}
				else if (b > a && b <= 21)
				{
					return 20;
				}
				else
				{
					return 0;
				}}
				public static void main(String[] args){
		
					
					
				System.out.println(sum(1,1,2));
	
				
				
		
				}
}