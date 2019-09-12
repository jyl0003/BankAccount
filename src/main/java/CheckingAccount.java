public class CheckingAccount extends Account {
    private static double OVERDRAFT_FEE = 35;

    public CheckingAccount(String owner, double mTotalBalance) {
        super(owner, mTotalBalance);
    }

    //Override withdraw from parent class
    @Override
    public void withdraw(double withdrawAmount) {
        if (withdrawAmount < 0) {
            System.out.println("Error: withdraw amount has to be greater than or equal to 0!");
        }
        else {
            if (withdrawAmount > mTotalBalance) {
                amountOwed += OVERDRAFT_FEE;
            }
            mTotalBalance -= withdrawAmount;
        }
    }

    //Calls the parent deposit method.
    public void deposit(double depositAmount) {
        super.deposit(depositAmount);
    }
}
