
public class Main {
    public static void main(String[] args) throws LimitException {
        BankAccount bankAccount = new BankAccount(0);
        bankAccount.deposit(15000);
        System.out.println("Остаток на счету: "+bankAccount.getAmount());
        while (true){
            try {
                bankAccount.withDraw(6000);
                System.out.println("Остаток на счету: "+bankAccount.getAmount());
            }catch (LimitException limitException){
                double sum = bankAccount.getAmount();
                bankAccount.withDraw((int) sum);
                System.out.println("Остаток на счету: "+bankAccount.getAmount());
                System.out.println(limitException.getMessage()+bankAccount.getAmount());
                break;
            }
        }
    }
}