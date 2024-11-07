package banking;
import java.util.Scanner;
public class BankServer {
	
	   private static  int secretPin = 1234;
	   
	   public static int getSecretPin() {
		   return secretPin;
	   }
	   
	   public static String changePin(Scanner sc) {
		   System.out.println("Enter the current pin");
		   int enteredPin = sc.nextInt();
		   if(enteredPin==getSecretPin()) {
			   	System.out.println("Enter the new pin");
			   	int newPin = sc.nextInt();
			   	secretPin = newPin;
			   	return "Pin updated successfully";
		   }
		   return "something went wrong";
	   }
	}


