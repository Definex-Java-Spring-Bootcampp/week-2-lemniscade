package com.patika.kredinbizdeservice.model;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.patika.kredinbizdeservice.service.BankService;

@RestController
@RequestMapping("api/banks")
public class BankController {
	@Autowired
    private BankService bankService;
	@Autowired
    public BankController(BankService bankService) {
        this.bankService = bankService;
    }
	@PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Bank create(@RequestBody Bank bank) {
        System.out.println("userService: " + bankService.hashCode());
        return bankService.save(bank);
    }
	@GetMapping("listCard")
	public List<CreditCard> listCreditCard(@RequestBody Bank bank){
		return bankService.listCreditCard(bank);
	}
	@GetMapping("listCampaign")
	public List<Campaign> listCampaign(@RequestBody CreditCard creditCard){
		return bankService.listCampaign(creditCard);
	}
	@GetMapping("listAllCampaignByDate")
	public List<Campaign> listAllCampaignByDate(){
		return bankService.listAllCampaign();
	}
	
}
