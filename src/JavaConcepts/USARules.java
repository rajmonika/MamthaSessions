package JavaConcepts;

public class USARules implements HSBC, UKRules{

	public static void main(String[] args) {
		
		
		USARules us = new USARules();
		us.credit();
		us.debit();
		us.transfermoney();
		us.educationloan();
		System.out.println(us.min_bal);
		us.mutualfunds();
		us.FixedDeposits();

	}

	@Override
	public void credit() {
 System.out.println("HSBC in USA --- credit rules");
		
	}

	@Override
	public void debit() {
		System.out.println("HSBC in USA --- debit rules");
		
	}

	@Override
	public void transfermoney() {
		System.out.println("HSBC in USA --- transfer money rules");
		
	}
	
	public void educationloan()
	{
		System.out.println("HSBC in USA ---own method--- education loan");
	}

	@Override
	public void mutualfunds() {
		System.out.println("HSBC in UK ---Mutual Funds");
		
	}

	@Override
	public void FixedDeposits() {
		System.out.println("HSBC in UK ---Fixed Deposits Funds");
		
	}

}
