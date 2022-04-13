public class TestBankAccount {
    
    public static void main(String[] args) {
        
        BankAccount myBankAccount = new BankAccount();
        myBankAccount.deposit(5000, "saving");
        myBankAccount.deposit(2500, "checking");
        myBankAccount.withdraw(275, "checking");
        myBankAccount.withdraw(1000, "saving");

        BankAccount herBankAccount = new BankAccount();
        herBankAccount.deposit(7500, "saving");
        herBankAccount.deposit(3500, "checking");
        herBankAccount.withdraw(2000, "checking");
        herBankAccount.withdraw(500, "saving");
        herBankAccount.withdraw(2000, "checking");

        System.out.println(myBankAccount.checkingTotal());
        System.out.println(myBankAccount.savingTotal());

        System.out.println(herBankAccount.checkingTotal());
        System.out.println(herBankAccount.savingTotal());

        System.out.println(BankAccount.total);
    }
}
