package byteBank.Alura;

public class CreateAccount {
    public static void main(String[] args) {
        Account firstAccount = new Account();
        firstAccount .setBalance(500);
        System.out.println(firstAccount .getBalance());

        //account for other user
        Account secondAccount = new Account();
        secondAccount.setBalance(250);

        //we use a method "deposit"
        secondAccount.setBalance(750);
        System.out.println("the balance 2 account is " + secondAccount.getBalance());

        //we use a method "withdraw"
        secondAccount.withdraw(300);
        System.out.println("the balance 2 account is " + secondAccount.getBalance());

        //we use a method "transfer"
        secondAccount.transfer(300, firstAccount );
        System.out.println("the balance 1 account is " + firstAccount.getBalance());
        System.out.println("the balance 2 account is " + secondAccount.getBalance());
    }
}
