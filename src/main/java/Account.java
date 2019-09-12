public class Account {
    protected double mTotalBalance = 0;
    protected String mOwner;
    protected double amountOwed = 0; //The fee

    public Account(String mOwner, double mTotalBalance) {
        this.mTotalBalance = mTotalBalance;
        this.mOwner = mOwner;
    }

    //withdraw from balance
    public void withdraw(double withdrawAmount) {
        if (withdrawAmount <= 0) {
            System.out.println("Withdrawal amount cannot be less than 0");
        }
        else {
            mTotalBalance -= -withdrawAmount;
        }
    }

    //deposit to balance
    public void deposit(double depositAmount) {
        if (depositAmount <= 0) {
            System.out.println("Deposit amount cannot be less than 0");
        }
        else {
            mTotalBalance += depositAmount;
        }
    }

}
