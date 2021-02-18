
import java.util.Scanner;

 


public class mini_proj 
{
    public static void main(String[] args) 
    {
    	int n ,age;
    	int seat_available=12;
    	String name,gender;
        
    
System.out.println("Press 1 : Proceed for booking \n Press 2 : Flight search \n Press 3 : exit");
//System.out.println(" ");


Scanner s=new Scanner(System.in);
int option=s.nextInt();

 

switch(option)
{
case 1:  
    System.out.println("Enter no of passengers");
    n=s.nextInt();
    
    if( n <  seat_available)
   {
        for(int i=1;i<=n;i++) 
        {
    System.out.println("Enter Passenger Details:" +i);
    System.out.println("Enter Name:");
    name=s.next();
    System.out.println("Enter age:");
    age=s.nextInt();
    System.out.println("Enter gender:");
    gender=s.next();
    
  }
    
    System.out.println("Your price for "+n+"ticket is :");
     
    System.out.println("press 1 - proceed payment\n press 2 - exit");
    
    int option2 = s.nextInt();
    
    if(option2 == 1)
    {
    	System.out.println("payment");
    }
    
    else
    {
    	System.out.println("Thank you");
    	break;
    
    }
    
   }
    
    else {
        System.out.println("sorry seats are not available");
    }
    break;
case 2:
    System.out.println("Take to flight search");
    break;
    
case 3:
    System.out.println("Thankyou visit again");
    break;

 


default : 
    System.out.println("Invalid option");
    break;    
}
}
}