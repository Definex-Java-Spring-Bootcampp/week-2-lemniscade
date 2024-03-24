package com.patika.kredinbizdeservice.service;

import org.springframework.stereotype.Service;

import com.patika.kredinbizdeservice.model.Loan;
import com.patika.kredinbizdeservice.repository.LoanRepository;
@Service
public class LoanService {
	 private LoanRepository loanRepository = new LoanRepository();
		
	    public Loan save(Loan loan) {
	        System.out.println("userRepository: " + loanRepository.hashCode());

	        loanRepository.save(loan);

	        return loan;
	    }
}
