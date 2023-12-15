public class BankAccount {
    private double amount;

    public BankAccount(double amount) {
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }
    public void deposit(double sum){
        amount+=sum;
    }
    public void withDraw(int sum) throws LimitException {
        if (sum<=amount){
            amount-=sum;
        }
        else {
            throw new LimitException("Не достаточно средств для операции! Текущий счет: ", amount);
        }
    }

}
