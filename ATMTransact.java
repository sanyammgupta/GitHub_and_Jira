/*Create a class ATMTransaction with a method named execute() which takes String transactionType as parameter.
	Create a class UnsupportedTransactionException.
	In the execute() method use a switch statement to check if transactionType is of: credit, debit, balanceInquiry and pinChange. If 
	the transactionType is other than these 4 types then throw UnsupportedTransactionException.
	Code should effectively handle exception scenario.
 */

import java.util.Scanner;


class UnsupportedTransactionException extends Exception{
	public String getMessage() {
		return "not a valid choice";
	}
}

	 class transaction{
		public void execute(String transactionType) {
			
			try {
			switch(transactionType) {
			case "credit" :
				Scanner sc = new Scanner(System.in);
				System.out.println("Enter the amount to be credited:- ");
				String cred = sc.nextLine();
				System.out.println("Amount credited : " + cred);
				break;
			case "debit" :
				Scanner pq = new Scanner(System.in);
				System.out.println("Enter the amount to be debited");
				String deb = pq.nextLine();
				System.out.println("Amount debited : " + deb);
				break;
			case "balanceenquiry" :
				System.out.println("Your balance is");
				break;
			case "pinchange" :
				Scanner rs = new Scanner(System.in);
				System.out.println("Enter your new pin");
				String pin = rs.nextLine();
				System.out.println("Changed pin is : "+pin);
				break;
			default:
				throw new UnsupportedTransactionException();
			}
			}
			catch(Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}
	public class ATMTransact {
		public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter transaction type:- ");
			String str = sc.nextLine();

			 transaction type =  new transaction();
			 type.execute(str);
		}
		}
        }




