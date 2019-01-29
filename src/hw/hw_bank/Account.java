package hw.hw_bank;

public class Account {
    private int accID;
    private User user;
    private double amount;
    private static int accIDGen = 0;

    public Account(User user) {
        this.user = user;
        this.accID = ++accIDGen;
    }

    public void setAmount(double amount) {
        if (amount >= 0) {
            this.amount = amount;
        } else {
            this.amount = 0;
        }
    }

    public double getAmount() {
        return amount;
    }

    public int getAccID() {
        return accID;
    }

    @Override
    public String toString() {
        return "Account{" +
                "accID=" + accID +
                ", user=" + user +
                ", amount=" + amount +
                '}';
    }
}
