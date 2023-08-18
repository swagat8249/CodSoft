package swagat;

public class ATM {
    private double balance;
    private double depositAmount;
    private double wthdrawAmount;

    //default constructor
    public ATM(){

    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getDepositAmount() {
        return depositAmount;
    }

    public void setDepositAmount(double depositAmount) {
        this.depositAmount = depositAmount;
    }

    public double getWthdrawAmount() {
        return wthdrawAmount;
    }

    public void setWthdrawAmount(double wthdrawAmount) {
        this.wthdrawAmount = wthdrawAmount;
    }
}
