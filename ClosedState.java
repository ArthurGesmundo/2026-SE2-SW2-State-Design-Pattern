class ClosedState implements AccountState {
    private final Account account;
    
    public ClosedState(Account account) {
        this.account = account;
    }
    
    @Override
    public void activate(Account account) {
        System.out.println("You cannot activate a closed account!");
    }
    @Override
    public void suspend(Account account) {
        System.out.println("You cannot suspend a closed account!");
    }
    @Override
    public void close(Account account) {
        System.out.println("Account is already closed!");
    }
    @Override
    public void deposit(double amount) {
        System.out.println("You cannot deposit on closed account!");
    }
    @Override
    public void withdraw(double amount) {
        System.out.println("You cannot withdraw on a closed account!");
    }
    
    @Override
    public void getState() {
        System.out.println("Closed");
    }
    
    @Override
    public String toString() {
        return "Closed";
    }
}