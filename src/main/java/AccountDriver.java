public class AccountDriver {
    public static void main(String[] args) {

        //Basic operations for checking account
        CheckingAccount checkingAccount = new CheckingAccount("Jim:", 15);
        System.out.println(checkingAccount.mOwner);
        checkingAccount.withdraw(250);
        System.out.println("totalBalance: " + checkingAccount.mTotalBalance);
        checkingAccount.deposit(500);
        System.out.println("total Balance: " + checkingAccount.mTotalBalance);
        checkingAccount.withdraw(2000);
        System.out.println("amount owed: " + checkingAccount.amountOwed);
        checkingAccount.deposit(-255550);

        //Basic Operations for savings account
        SavingsAccount savingsAccount = new SavingsAccount("Bob",1000);
        System.out.println("totalBalance: " + savingsAccount.mTotalBalance);
        savingsAccount.deposit(1000);
        for (int i =0; i < 11; i++) {
            System.out.println("totalBalance: " + savingsAccount.mTotalBalance);
            savingsAccount.withdraw(1);
        }
        System.out.println(savingsAccount.monthlyDepositTotal);
        savingsAccount.calculateFees();
        savingsAccount.newMonth();
        savingsAccount.calculateFees();
        savingsAccount.withdraw(100);
        savingsAccount.deposit(-654);


    }
}
