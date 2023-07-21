package byteBank.Alura;

public class TestReference {
    public static void main(String[] args) {
        Account FirstAccount = new Account();
        FirstAccount.setBalance(200);

        Account secondAccount = FirstAccount;
        secondAccount.setBalance(400);

        System.out.println("1 balance is " + FirstAccount.getBalance());

        System.out.println("2 balance is " + secondAccount.getBalance());

        //show memory space account 1 and 2
        System.out.println(FirstAccount);
        System.out.println(secondAccount);

    }
}
