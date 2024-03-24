package com.patika.kredinbizdeservice.model;

import java.util.ArrayList;
import java.util.List;

public class Bank {

    private String name;
    private List<Loan> loanList;
    public List<CreditCard> creditCards=new ArrayList<>();

    public List<CreditCard> getCreditCards() {
		return creditCards;
	}

	public Bank(String name, List<CreditCard> creditCards) {
		super();
		this.name = name;
		this.creditCards = creditCards;
	}

	public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Loan> getLoanList() {
        return loanList;
    }

    public void setLoanList(List<Loan> loanList) {
        this.loanList = loanList;
    }

    @Override
    public String toString() {
        return "Bank{" +
                "name='" + name + '\'' +
                ", loanList=" + loanList +
                '}';
    }
}
