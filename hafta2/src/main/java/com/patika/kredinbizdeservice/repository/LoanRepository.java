package com.patika.kredinbizdeservice.repository;

import java.util.ArrayList;
import java.util.List;

import com.patika.kredinbizdeservice.model.Loan;

public class LoanRepository {
	private List<Loan> loanList = new ArrayList<>();
	public void save(Loan loan) {
    	loanList.add(loan);
    }
}
