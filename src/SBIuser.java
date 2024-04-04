import java.util.Objects;
import java.util.UUID;

public class SBIuser implements  BankInterface{
    String name;
    String accountNo;
    double balance;
    String password;
    double rateOFInterest;

    public SBIuser(String name, double balance, String password) {
        this.name = name;
        this.balance = balance;
        this.password = password;

        this.rateOFInterest = 6.5;
        this.accountNo = String.valueOf(UUID.randomUUID());
    }

    @Override
    public double checkbalance() {
        return balance;
    }

    @Override
    public String addMoney(int amount) {
        balance = balance + amount;
        return "your new balance is: "+balance;
    }

    @Override
    public String withdrawMoney(int amount, String enteredpassword) {
        if(Objects.equals(password,enteredpassword)){
            if(amount > balance){
                return " insufficient money";
            }else {
                balance = balance - amount;
                return " paisa hi paisa";
            }
        }else{
            return  " wrong  password!";
        }
    }

    @Override
    public double calculateInterest(int years) {
        return (rateOFInterest*years*balance)/100;
    }
}
