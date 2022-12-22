package bank;

public static void main(String[] args) {
	  Bank bankA = new BankA();
	  System.out.println("Balance in Bank A: " + bankA.getBalance());

	  Bank bankB = new BankB();
	  System.out.println("Balance in Bank B: " + bankB.getBalance());

	  Bank bankC = new BankC();
	  System.out.println("Balance in Bank C: " + bankC.getBalance());
	  } 