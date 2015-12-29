package isBanking;

public class testBank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Customer cust1 = new Customer();
		
		cust1.setName("Kibrom");
		cust1.setAccount(100);
		cust1.setBalance(100000);
		
		System.out.println("Name: "+cust1.getName());
		System.out.println("Account Number: "+cust1.getAccountNumber());
		System.out.println("Balance: " + cust1.getBalance());
		
		cust1.deposit(1000000);
		System.out.println("Balance: " + cust1.getBalance());
        
		cust1.withdraw(500);
		System.out.println("Balance: " + cust1.getBalance());
		
	}

}
