package ru.mirea.task23;

public class Client {
    public String name;
    public int accountNumb = 0;
    public float balance = 10;

    Client(){}
    Client(String name, int accountNumb, float balance){
        this.name = name;
        this.accountNumb = accountNumb;
        this.balance = balance;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setAccountNumb(int accountNumb) {
        this.accountNumb = accountNumb;
    }
    public int getAccountNumb() {
        return accountNumb;
    }
    public void setBalance(float balance) {
        this.balance = balance;
    }
    public float getBalance() {
        return balance;
    }
    public void addMoney(int adding)
    {
        balance += adding;
    }
    public void takeMoney(int taking)
    {
        balance -= taking;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if((o == null) || (getClass() != o.getClass())) return false;
        Client cl = (Client) o;
        return getName().equals(cl.getName());
    }

    @Override
    public int hashCode() {
        int res = (getName() == null) ? 0 : getName().hashCode();
        res = 29 * res;
        return res;
    }
}
