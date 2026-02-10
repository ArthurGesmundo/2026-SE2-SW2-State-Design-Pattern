class ActiveState implements AccountState {
    //
    private final Account account;
    
    public ActiveState(Account account) {
        this.account = account;
    }//
    
    @Override
    public void activate(Account account) {
        System.out.println("Account is already activated!");
    }
    @Override
    public void suspend(Account account) {
        account.setState(new SuspendedState(account));
        System.out.println("Account is suspended!");
    }
    @Override
    public void close(Account account) {
        account.setState(new ClosedState(account));
        System.out.println("Account is closed!");
    }
    @Override
    public void deposit(double amount) {
        account.setBalance(account.getBalance() + amount);
        System.out.println("Deposited: " + amount);
        System.out.println(account.toString());
    }
    @Override
    public void withdraw(double amount) {
        if (amount > account.getBalance()) {
            System.out.println("Insufficient funds!"); 
        } else {    
            account.setBalance(account.getBalance() - amount);
            System.out.println("Withdrew: " + amount);
        }
        System.out.println(account.toString());
    }
    @Override
    public void getState() {
        System.out.println("Active");
    }
    
    @Override
    public String toString() {
        return "Active";
    }
}