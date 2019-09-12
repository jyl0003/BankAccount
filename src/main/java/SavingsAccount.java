public class SavingsAccount extends Account {
    protected int timesWithdrawn = 0;
    protected double monthlyDepositTotal = 0;
    private static final int MAX_WITHDRAWAL_TIMES = 10;
    private static final double MONTHLY_MIN_DEPOSIT = 25;
    private static final double MONTHLY_FEE = 40;
    //Basic Constructor
    public SavingsAccount(String owner, double totalBalance) {
        super(owner, totalBalance);
    }

    //Override withdraw from parent class
    @Override
    public void withdraw(double withdrawAmount) {
        if (withdrawAmount < 0) {
            System.out.println("Error: withdraw amount has to be greater than or equal to 0!");
        }
        else {
            if (timesWithdrawn < MAX_WITHDRAWAL_TIMES) {
                if (withdrawAmount > mTotalBalance) {
                    System.out.println("Withdraw Failed! Your withdraw amount is greater than your balance available");
                } else {
                    mTotalBalance -= withdrawAmount;
                    timesWithdrawn++;
                    System.out.println("Available withdrawals left: " + (MAX_WITHDRAWAL_TIMES - timesWithdrawn));
                }
            } else {
                System.out.println("Max allowed withdrawals have been exceeded, please wait a month.");
            }
        }
    }

    //Override deposit method from parent class.
    @Override
    public void deposit(double depositAmount) {
        if (depositAmount <= 0) {
            System.out.println("Deposit amount cannot be less than 0");
        }
        else {
            monthlyDepositTotal += depositAmount;
            mTotalBalance += depositAmount;
        }
    }
    //Calculate amount owed
    public void calculateFees() {
        if (monthlyDepositTotal >= MONTHLY_MIN_DEPOSIT) {
            System.out.println("No monthly fee this month.");
        }
        else {
            amountOwed += MONTHLY_FEE;
            System.out.println("Total fee is: " + amountOwed);
        }
    }
    //New month: monthly amount of withdrawals allowed goes back to 0 and monthly deposit total goes back to 0
    public void newMonth() {
        System.out.println("New month: withdrawal and monthly deposit totals have been reset!");
        timesWithdrawn = 0;
        monthlyDepositTotal = 0;
    }
}
