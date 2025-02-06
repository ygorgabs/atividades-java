public class App {
    public static void main(String[] args) {
        Account a = new Account();

        boolean success = a.deposit(-100);

        if (!success){
            System.out.println("Depósito inválido");
        }
        a.printBalance();

        a.deposit(200);

        if (!a.withdraw(-50)) {
            System.out.println("Saque inválido");
        }

        a.printBalance();

    }
}
