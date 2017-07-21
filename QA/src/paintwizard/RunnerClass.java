package paintwizard;

import java.util.*;
class RunnerClass
{
   public static void main(String arg[])
   {
     int a[]=new int[7];
     int total=0;
     Scanner n=new Scanner(System.in);
     System.out.println("Enter the no. for total");

     for(int i=0;i<=6;i++) 
     {
       a[i]=n.nextInt();
       total=total+a[i];
      }
       System.out.println("The total is :"+total);
    }
}