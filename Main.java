import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

import pojo.Account;
import pojo.Checking;
import pojo.Credit;
import repository.AccountRepository;

public class Main {

    public static void main(String[] args) {
        AccountRepository repository = new AccountRepository();
        
        // Assume these were obtained from user input.
        List<Account> accounts = Arrays.asList(
            new Checking("A1234B", new BigDecimal("500.00")),
            new Checking("E3456F", new BigDecimal("300.50")),
            new Checking("I5678J", new BigDecimal("100.25")),
            new Credit("A1534B", new BigDecimal("0.50")),
            new Credit("G4567H", new BigDecimal("200.00"))
        );

        accounts.forEach(account -> repository.createAccount(account));

        // Account account = repository.retrieveAccount("A1234B");

        // Type casting it to a more specific type.
        Checking checkingAccount = (Checking) repository.retrieveAccount("A1234B");
        // set a new balance by getting the current balance and adding the new amount.
        checkingAccount.setBalance(checkingAccount.getBalance().add(new BigDecimal("100")));

        // updating the repository.
        repository.updateAccount(checkingAccount);
        repository.deleteAccount("G4567H");
    }


}