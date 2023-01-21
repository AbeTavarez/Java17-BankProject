package service;

import repository.AccountRepository;

public class CheckingService {
        
    AccountRepository accountRepository;

    public CheckingService(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }



}
