package EPAM.Task3;

import java.util.*;
public class App 
{
    public static void main( String[] args )
    {
        Scanner sc=new Scanner(System.in);
         System.out.println("------calculator Application--------"); 
System.out.println("enter the first operator");
         int operator1=sc.nextInt();
         System.out.println("enter the second operator");
         int operator2=sc.nextInt();
        System.out.println("enter the operation to perform");
        System.out.println("1.Add\n2.sub\n3.subtract\n4.Divide");
       int x=sc.nextInt();
       if(x==1)
       {
    	   Cal c=new Addition();
    	   c.calculate(operator1, operator2);
       }
       else if(x==2)
       {
    	   Cal c=new Subtraction();
    	   c.calculate(operator1, operator2);
    	   
       }
       else if(x==3)
       {
    	   Cal c=new Multiplication();
    	   c.calculate(operator1, operator2);
       }
       else if(x==4)
       {
    	   Cal c=new Divide();
    	   c.calculate(operator1, operator2);
       }
    }
}
