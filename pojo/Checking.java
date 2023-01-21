package pojo;

import java.math.BigDecimal;

public class Checking extends Account {

    private BigDecimal balance;

    public Checking(String id, BigDecimal balance) {
        super(id);
        this.balance = balance;
    }

    public BigDecimal getBalance() {
        return this.balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    @Override
    public Account clone() {
        // call the getId from the super class and pass the balance from this class
        return new Checking(super.getId(), this.balance);
    }

}
