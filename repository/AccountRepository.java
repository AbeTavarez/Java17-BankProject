package repository;

import java.util.HashMap;
import java.util.Map;

import pojo.Account;

public class AccountRepository {

    private Map<String, Account> datastore = new HashMap<>();

    public void createAccount(Account account) {
        this.datastore.put(account.getId(), account.clone());
    }

    public Account retrieveAccount(String id) {
        // we access a Account object by its id and call its clone method
        return this.datastore.get(id).clone(); // returns a clone of the Account object
    }

    public void updateAccount(Account account) {
        this.datastore.put(account.getId(), account.clone());
    }

    public void deleteAccount(String id) {
        this.datastore.remove(id);
    }

}

