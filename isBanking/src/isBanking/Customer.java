package isBanking;
/*
 * A bank customer class that 
 * have withdrawing depositing 
 * methods and all information
 * about one customer 
 * 
 * */

public class Customer {
    private String name;
    private int accountNumber;
    private double balance;
    
    Customer(){
    	balance = 0.0;
    }
    
    public void setBalance(double balan){
    	balance = balan;
    }
    
    public double getBalance(){
    	return balance;
    }
    
    
    public void setName(String n){
    	name = n;
    }
    public String getName(){
    	return name;
    }
    
    public void setAccount(int acc){
    	accountNumber = acc;
    }
    public int getAccountNumber(){
    	return accountNumber;
    }
    
    //to deposit given amount of money to their account
    public void deposit(double amount){	
     
    	if(amount>0)
    	   balance +=amount;
        else
           System.out.println("Invalid amount");	  	
     }
    
    //To withdraw given money from  account
    public void withdraw(double amount){
    	if(amount < (balance-50))
    		balance -=amount;
    	else
    		System.out.println("Invalid amount");
    }
    
    
    
}
