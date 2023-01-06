class Bank {
    // Static variable reference of bankInstance
    // of type Bank
    private static Bank bankInstance = null;
  
    // Declaring a variable of type String
    public String vaultKey;
  
    // Constructor
    // Here we will be creating private constructor
    // restricted to this class itself
    private Bank()
    {
        vaultKey = "Tigers";
    }
  
    // Static method
    // Static method to create instance of Bank class
    public static Bank getInstance()
    {
        if (bankInstance == null)
            bankInstance = new Bank();
  
        return bankInstance;
    }
}