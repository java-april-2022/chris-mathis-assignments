class BankAccount{

    private double checking;
    private double saving;
    public static int numAccounts = 0;
    public static double total = 0;

    public BankAccount(){
        BankAccount.numAccounts += 1;
        this.checking = 0;
        this.saving = 0;
    }

    public double checkingTotal(){
        return this.checking;
    }

    public double savingTotal(){
        return this.saving;
    }

    public void deposit(double amount, String account){
        if(account == "checking"){
            this.checking += amount;
        }
        else{
            this.saving += amount;
        }
        this.total += amount;
    }

    public void withdraw(double amount, String account){
        if(account == "checking"){
            if(this.checking < amount){
                System.out.println("Wait For Payday!!");
                return;
            }
            this.checking -= amount;
        }
        else{
            if(this.saving < amount){
                System.out.println("Not Enough Cash!!");
                return;
            }
            this.saving -= amount;
        }
        this.total -= amount;
    }

}