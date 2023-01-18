public class Customer {

    private static String name;
    private static float balance;

    public Customer(String name, float balance) {
        name = name;
        balance = balance;
    }

    // Setting name property
    public void setName(String name) {
        name = name;
    }

    // Getting name property
    public int getName() {
        return name;
    }

    // Getting customer balance
    public float getBalance(int pin) {
        return balance;
    }

    // Adjusting customer balance from deposit
    public void makeDeposit(float deposit) {
        balance = balance + deposit;
    }

    // Adjusting customer balance from withdrawal
    public void makeWithdrawal(float amount) {
        if (balance > amount) {
            balance = balance - amount;
        }
    }
    
}