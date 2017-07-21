package enokkamuanga;

import java.util.*; 

public class People {
	
	 
	
	 public static void main(String args[]){  
	  //Creating user-defined class objects  
	  RunnerClass rc1 = new RunnerClass ("Lionel Messi","30","Footballer");  
	  RunnerClass rc2 = new RunnerClass("David Jones","28","Plumber");  
	  RunnerClass rc3 = new RunnerClass ("Megan Davis","18","Waitress");   
	  //creating arraylist  
	  ArrayList<RunnerClass> al=new ArrayList<RunnerClass>();  
	  al.add(rc1);//adding Student class object  
	  al.add(rc2);  
	  al.add(rc3);  
	  //Getting Iterator  
	  Iterator itr=al.iterator();  
	  //traversing elements of ArrayList object  
	  while(itr.hasNext()){  
	    RunnerClass st=(RunnerClass)itr.next();  
	    System.out.println(st.name+" "+st.age+" "+st.jobTitle);  
	  }  
	 }  
	}  


	