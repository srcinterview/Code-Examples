public class Customer {

    private static String name;
    private static float balance;

    public Customer(String name, float balance) {
        name = name;
        balance = balance;
    }

    public void setName(String name) {
        name = name;
    }

    public int getName() {
        return name;
    }

    public float getBalance(int pin) {
        return balance;
    }

    public void makeDeposit(float deposit) {
        balance = balance + deposit;
    }

    public void makeWithdrawal(float amount) {
        if (balance > amount) {
            balance = balance - amount;
        }
    }
    
}