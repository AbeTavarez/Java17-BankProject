package service;

import repository.AccountRepository;

public class CreditService {

    AccountRepository accountRepository;

    public CreditService(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }



}
