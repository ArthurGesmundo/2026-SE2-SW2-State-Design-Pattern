# 2026-SE2-SW2-State-design-pattern
<p>A bank needs to manage different states of customer accounts, including active, suspended, and closed. Each state has specific rules and restrictions regarding allowed operations, and accounts have associated attributes like account number and balance.</p>

<h3>Active accounts: </h3>
<h4>Allow deposits and withdrawals.</h4>

<h3>Suspended accounts: </h3>
<h4>Disallow deposits and withdrawals transactions, but allow viewing account information.</h4>

<h3>Closed accounts: </h3>
<h4>Disallow all transactions and viewing of account information.</h4>

<p>Currently, the system relies on conditional statements within the Account class to check the account state and determine valid actions. This approach becomes cumbersome and error-prone as the number of states and their associated logic grows.</p>

<h3>Implement the State pattern to improve code maintainability and flexibility:</h3>

<h4>Define Account States: </h4>
Create separate classes representing different account states: ActiveState, SuspendedState, and ClosedState.

<h4>Implement State Interface: </h4>
Define an interface AccountState with methods for common actions like deposit, withdraw, activate, suspend, and close.

<h4>Implement State Behaviors:</h4> 
Each concrete state class implements the AccountState interface, providing specific behavior for its respective state. For example, the ActiveState class would allow deposits and withdrawals, while the ClosedState wouldn't allow any transactions.

<h4>Update Account Class:</h4>
Include attributes for accountNumber and balance.</br>
Remove state-specific logic from the Account class.</br>
Introduce a reference to the current AccountState object.</br>
Delegate actions like deposit, withdraw, activate, suspend, and close to the current state object through its corresponding methods.</br>
 
<h4>Logic:</h4>

<h5>If the account is active</h5>
    You can either suspend it or close it.</br>
<h5>If the account is suspended</h5>
    You can either activate or close it.</br>
     No deposits and withdrawals allowed.</br>
<h5>If the account is closed</h5>
     You can neither suspend nor activate it.</br>
      No deposits and withdrawals allowed.</br>


<h4>Composition of Account:</h4>
accountNumber : String </br>
balance:  Double</br>
accountState:  AccountState</br>

<h4>Methods:</h4>
deposit(Double depositAmount): void</br>
withdraw(Double withdrawAmount): void</br>
suspend(): void</br>
activate(): void</br>
close() : void</br>
toString()   // displays account number and balance</br>


# Note:  No if-else, switch will be used
