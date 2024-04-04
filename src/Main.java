import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" enter 1 for SBI Bank and 2 for HDFC Bank");
        int n = sc.nextInt();
        if(n == 1){
            System.out.println("Enter name Money and password to create an account");


            String name = sc.nextLine();
            String password = sc.next();
            double balance =  sc.nextDouble();

            // creating an object of sbibank
            SBIuser user = new SBIuser(name , balance, password);

            // adding amount to account
            String messege = user.addMoney(100000);
            System.out.println(messege);

            // withdaraw money
            System.out.println(" enter the amount to withdraw");
            int money = sc.nextInt();
            System.out.println("enter your password");
            String pass = sc.next();
            System.out.println(user.withdrawMoney(money, pass));
        }
        else if(n == 2){
            System.out.println(" enter name , password and amount for creating an account");

            String name = sc.nextLine();
            String pass = sc.next();
            double amount = sc.nextDouble();
            HDFCuser user = new HDFCuser(name,amount , pass);
            // input money

            String messege = user.addMoney( 1000000);
            System.out.println(messege);

            // withrdraw money
            System.out.println("enter  the amount you want to withdraw");

            int balance = sc.nextInt();
            System.out.println(" enter the password ");
            String password = sc.next();
            user.withdrawMoney(balance, password);
        }
        else{
            System.out.println(" please select the number between 1 and 2");
        }
        System.out.print("this is the first change");
        System.out.println(" this is my change");
        System.out.println("hello ");
    }

}