package isPEOSLprogram;

import java.util.Scanner;
import java.math.*;
public class peoslNumberPrinter {
    
	static Scanner input = new Scanner(System.in);
	static Math m;
    
	
	static int max(int list[]){
       	int max =list[0];
         for(int i=1;i<list.length-1;i++){
        	 if(list[i]>max)
        		 max = list[i];
         }	  
         return max;
    }
	//inserts all elements from list
    static void  insertList(int list[],int n){
	 			
		System.out.println("\nEnter the numbers one by one.\n");
	 	
		for(int i=0;i<n;i++){
	 		System.out.print("Enter number "+(i+1)+":");
	 	    list[i]=input.nextInt();
		}
	}
	
    //Displaying function
    static void display(int list[],int n){
    
    //Displays all even numbers from a list
    	System.out.print("\nEven Numbers: ");
    	for(int i=0;i<n;i++){
    		if(list[i]%2 == 0)
    		 System.out.print(list[i]+" ");
    	}
    	
   //Displays all odd numbers from a list 	
    	System.out.print("\nOdd Numbers: ");
    	for(int i=0;i<n;i++){
    		if(list[i]%2 !=0)
    		 System.out.print(list[i]+" ");
    	}
    
   //Displays all prime numbers from a list 	
    	System.out.print("\nPrime Numbers: ");
    	
       	for(int i=0;i<n;i++){
    		if(list[i]%2!=0 && list[i]%3!=0 && list[i]%5!=0 && list[i]%7 !=0)
    		    System.out.print(list[i]+" ");
    		  }
   //Displays the maximum Element from the list
    	System.out.print("\nLargest Number: ");
    	int larg =list[0];
    	for(int i=0;i<n;i++){
    		if(list[i] > larg)
    		  larg = list[i];
    	}
    	System.out.println(larg);

  //Displays the smallest elemtn from a list of numbers
    	System.out.print("Smallest Number: ");
    	int small = list[0];
    	for(int i=0;i<n;i++){
    		if(list[i] < small)
    		  small= list[i];
    	}
    	System.out.println(small);
    	
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int n;
       
       System.out.print("Enter the size of the list: ");	  	
	   n = input.nextInt();
	   
	   int listOne[] = new int[n];
	   
	   insertList(listOne,n);
	   display(listOne,n);
	}

}
