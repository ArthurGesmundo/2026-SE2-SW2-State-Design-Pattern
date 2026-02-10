interface AccountState {
    void deposit(double amount);
    void withdraw(double amount);
    void activate(Account account);
    void suspend(Account account);
    void close(Account account);
    void getState();

    @Override
    public String toString();
    
}