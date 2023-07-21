package byteBank.Alura;

class Account {
    private double balance;
    private int agency;
    private int AccountNumber;
    private Client titular = new Client();

    // don't return a value (to that use of "void")
    public void deposit(double valor){
        this.balance += valor;
    }

    //return a value
    public boolean withdraw(double valor){
        if (this.balance >= valor){
            this.balance -= valor;
            return true;
        }

        return false;
    }

    public boolean transfer(double valor, Account account){
        if (this.balance >= valor){
            this.balance -= valor;
            account.deposit(valor);
            return  true;
        }

        return false;
    }

    //get and set balance
    public double getBalance(){
        return this.balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    //get and set from agency
    public void setAgency(int agency){
        if (agency > 0){
            this.agency = agency;
        }
        else{
            System.out.println("negative values are not allowed");
        }
    }
    public int getAgency(){
        return agency;
    }


    //get and set from AccountNumber
    public void setAccountNumber(int accountNumber){
        if(accountNumber > 0){
            this.AccountNumber = accountNumber;
        }
        else{
            System.out.println("negative values are not allowed");
        }
    }
    public int getAccountNumber(){
        return AccountNumber;
    }

    //get and set from titular
    public Client getTitular() {
        return titular;
    }
    public void setTitular(Client titular) {
        this.titular = titular;
    }
}
