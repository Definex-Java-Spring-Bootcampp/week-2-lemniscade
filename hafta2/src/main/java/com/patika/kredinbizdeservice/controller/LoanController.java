package com.patika.kredinbizdeservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.patika.kredinbizdeservice.model.Loan;
import com.patika.kredinbizdeservice.service.LoanService;

@RestController
@RequestMapping("api/loans")
public class LoanController {
	@Autowired
    private LoanService loanService;
	@Autowired
    public LoanController(LoanService loanService) {
        this.loanService = loanService;
    }
	@PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Loan create(@RequestBody Loan loan) {
        System.out.println("userService: " + loanService.hashCode());
        return loanService.save(loan);
    }
}
