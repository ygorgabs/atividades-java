public class Account {
    String accountNumber;
    String accountOwner;
    double balance;

    void printBalance(){
        System.out.println("Balance: R$ " + balance);
    }

    boolean deposit(double amount) {

        if(amount > 0) {
            balance += amount;
            return true;
        }else{
            return false;
        }

    }

    boolean deposit(String amount){
        return deposit(Double.parseDouble(amount));
    }

    boolean withdraw(double amount){
        if (amount > 0){
            balance -= amount;
            return true;
        }else {
            return false;
        }
    }

    void transfer(double amount, Account targetAccount){
        this.withdraw(amount);
        targetAccount.deposit(amount);
    }
}
