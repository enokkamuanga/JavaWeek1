package enokkamuanga;

public class BlackJack {


		
			public static int jackblack (int a, int b)
			{
				if (a > b && a <= 21)
				{
					return a;
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
		
					
					
				System.out.println(jackblack(6,21));
	
				
				
		
				}
}