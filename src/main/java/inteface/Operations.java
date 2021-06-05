package inteface;

import exception.AccountNotFoundException;
import exception.InSufficientBalanceException;
import model.Account;
public interface Operations {
    void addAccount();
    void displayAnAccount(String accountNumber) throws AccountNotFoundException;
    void displayAllAccounts() throws AccountNotFoundException;
    boolean removeAnAccount(String accountNumber);
    void withdraw(String accountNumber) throws InSufficientBalanceException, AccountNotFoundException;
    void deposit(String accountNumber) throws AccountNotFoundException;
    void transfer(String fromAccountNo, String toAccountNo, double amount) throws AccountNotFoundException, InSufficientBalanceException;
    boolean searchAccountUsingName(String name) throws AccountNotFoundException;
    boolean searchAccountUsingEmail(String email);
    boolean searchAccountUsingPhone(String phone);
}
