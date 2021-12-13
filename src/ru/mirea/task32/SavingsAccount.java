package ru.mirea.task32;

public class SavingsAccount extends SpecialAccount {
    public SavingsAccount(BankAccount bankAcc){
        super(bankAcc, "Сберегательный счёт", 10);
    }
}
