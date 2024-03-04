package abstraction;
import java.util.Scanner;

public class AtmUI {
	public static void main(String[] args) {
		IBank bank=new BankImpl();
		System.out.println("Welcome to broke Bank for poor people like you...");
		 boolean flag=true;
		 Scanner sc=new Scanner(System.in);
		 
		 while(flag) {
			 System.out.println("Enter 1 for deposit");
			 System.out.println("========================");
			 System.out.println("Enter 2 for withdrawal");
			 System.out.println("========================");
			 System.out.println("Enter 3 to exit");
			 System.out.println("========================");
			 System.out.print("Enter your choice: ");
			 int choice=sc.nextInt();
			 sc.close();
			 switch(choice) {
			 case 1:bank.deposit();
			 System.out.println("========================\n\n\n");
			 break;
			 case 2:bank.withdraw();
			 System.out.println("========================\n\n\n");
			 break;
			 case 3:flag=false;
			 System.out.println("Well get going then...");
			 break;
			 default:System.out.println("Please enter a valid choice");
			 System.out.println("========================\n\n\n");
			 }
		 }
		
	}

}
