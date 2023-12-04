package bank.entities.client;

import static bank.common.ExceptionMessages.*;
import static bank.common.StringUtils.nullOrEmpty;

public abstract class BaseClient implements Client{
    private String name;
    private String ID;
    private int interest;
    private double income;

    protected BaseClient(String name, String ID, int interest, double income) {
        setName(name);
        setID(ID);
        this.interest = interest;
        setIncome(income);
    }

    @Override
    public void setName(String name) {
        if (nullOrEmpty(name)){
            throw  new IllegalArgumentException(CLIENT_NAME_CANNOT_BE_NULL_OR_EMPTY);
        }
        this.name = name;
    }

    public void setID(String ID) {
        if (nullOrEmpty(ID)){
            throw  new IllegalArgumentException(CLIENT_ID_CANNOT_BE_NULL_OR_EMPTY);
        }
        this.ID = ID;
    }

    public void setIncome(double income) {
        if (income <= 0){
            throw  new IllegalArgumentException(CLIENT_INCOME_CANNOT_BE_BELOW_OR_EQUAL_TO_ZERO);
        }
        this.income = income;
    }

    protected void setInterest(int interest) {
        this.interest = interest;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getInterest() {
        return interest;
    }

    @Override
    public double getIncome() {
        return income;
    }
}
