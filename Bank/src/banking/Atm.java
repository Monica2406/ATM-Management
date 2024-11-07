package banking;
import java.util.Scanner;
public class Atm {

	   public static boolean validateLength(int key) {
		   boolean isValid = false;
		   int count=0;
		   while(key>0) {
			   key = key/10;
			   count++;
		   }
		   if(count==4) {
			   isValid=true;
			   return isValid;
		   }
		   return isValid;
	   }
		public static void main(String[] args) {
			int count=0;
			int totalAttempts = 3;
			char res='n';
			System.out.println("Welcome to ABC Bank");
			System.out.println("_______________________________");
			Scanner sc = new Scanner(System.in);
			while(true) {
				System.out.println("Enter the secret pin");
				int pin = sc.nextInt();
				if(pin==BankServer.getSecretPin() && validateLength(pin)) {
					do {
						System.out.println("1.deposit  2.withdraw  3.balEnquiry  ");
						System.out.println("Select option");
						int option = sc.nextInt();
						switch(option) {
						case 1:System.out.println(BankUtil.deposit(sc));
						       break;
						case 2:System.out.println(BankUtil.withdraw(sc));
						       break;
						       
						case 3:System.out.println(BankUtil.balEnquiry());
						       break;
						
						default:System.out.println("Invalid option");
						}
						System.out.println("Do you want to continue?y/n");
						res = sc.next().charAt(0);//yes
					}while(res=='y');
					break;
				}else {
					count++;
					System.out.println("You have entered the wrong pin");
					System.out.println("Remaining attempts :"+(totalAttempts-count));
					if(count==3) {
						System.out.println("Card blocked for 24hrs.Contact to your nearest branch");
					    break;
					}
				}
			}
			System.out.println("Thank you for banking with us..");
		}

	}


