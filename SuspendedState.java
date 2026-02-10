class SuspendedState implements AccountState {
    private final Account account;
    
    public SuspendedState(Account account) {
        this.account = account;
    }
    
    @Override
    public void activate(Account account) {
        account.setState(new ActiveState(account));
        System.out.println("Account is activated!");
    }
    @Override
    public void suspend(Account account) {
        System.out.println("Account is already suspended!");
    }
    @Override
    public void close(Account account) {
        account.setState(new ClosedState(account));
        System.out.println("Account is closed!");
    }
    @Override
    public void deposit(double amount) {
        System.out.println("You cannot deposit on a suspended account!");
    }
    @Override
    public void withdraw(double amount) {
        System.out.println("You cannot withdraw on a suspended account!");
    }
    
    @Override
    public void getState() {
        System.out.println("Suspended");
    }
    
    @Override
    public String toString() {
        return "Suspended";
    }
}