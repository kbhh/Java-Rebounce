import java.util.Scanner;

public class FactoAndFabio {

  //Calculates factorial of any number	
	
	static void factorial(int n){
	   int fact=1;	
	 if(n != 0){	
	   for(int i=1;i<=n;i++){
		   fact *=i; 
	   }
	  } 
	   System.out.println(fact);
	}
	
 // Generates the fibonacci serises of n	
	
	static void fibonacci(int n){
		int f1 = 0,f2=1,f3 =0;
	 	System.out.print("0\t1\t");
	 	if(n >= 2){
	 	  for(int i=1;i<n;i++){
	 	    f3 = f2 + f1;
	 	    System.out.print(f3+ "\t");
	 	    f1 = f2;
	 	    f2 = f3; 
	 	  }  
	 	}
	 	  
	 	
	}
	public static void main(String[] args) {
		
       Scanner input = new Scanner(System.in);  //an object to accept user input
       
       int x;
       
       System.out.print("Input the number: ");
       x = input.nextInt();
       
       int choice;
       
       System.out.print("\nEnter 1 for factorial. \nEnter 2 for fibonacci seris\n");
       choice = input.nextInt();
       
       if(choice == 1)
    	   factorial(x);
       else
    	   fibonacci(x);
	}

}
