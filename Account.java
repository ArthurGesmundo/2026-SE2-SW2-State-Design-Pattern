class Account{
    private final String accountNumber;
    private double balance;
    private AccountState currentState; // uses state object

    public Account(String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
        this.currentState = new ActiveState(this);
    }
    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }
    public String getAccountNumber() {
        return accountNumber;
    }
    public String getAccountState() {
        return currentState.toString();
    }
    public void setState(AccountState state) {
        this.currentState = state;
    }
    public void activate() {
        currentState.activate(this);
    }
    public void suspend() {
        currentState.suspend(this);
    }
    public void close() {
        currentState.close(this);
    }
    public void deposit(double amount) {
        currentState.deposit(amount);
    }
    public void withdraw(double amount) {
        currentState.withdraw(amount);
    }


    
    @Override
    public String toString() {
        return "Account Number: " + accountNumber + ", Current Balance: " + balance + ", Account State: " + currentState.toString();
    }
}