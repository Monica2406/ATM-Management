package banking;
import java.util.Scanner;
public class BankUtil {
	
		static int minBal = 500;
		static int currentBal = minBal;
		public static String deposit(Scanner sc) {
			System.out.println("Enter the amount to be deposited");
			int depositAmount = sc.nextInt();
			if(depositAmount < 100) {
				return "Can't deposit amount lesser than 100";
			}
			currentBal = balEnquiry() + depositAmount;
			return "Amount Rs."+depositAmount+" deposited successfully";
		}
		
		public static String withdraw(Scanner sc) {
			System.out.println("Enter the amount to be withdrawn...");
			int withdrawnAmount = sc.nextInt();
			if((balEnquiry()-minBal) < withdrawnAmount) {
				return "Need to maintain min bal";
			}
			currentBal = balEnquiry() - withdrawnAmount;
			return "Amount Rs."+withdrawnAmount+" has debited from account.";
		}
		
		public static int balEnquiry() {
			return currentBal;
		}

	}


