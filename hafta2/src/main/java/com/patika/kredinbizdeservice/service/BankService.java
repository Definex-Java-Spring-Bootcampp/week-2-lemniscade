package com.patika.kredinbizdeservice.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.patika.kredinbizdeservice.model.Bank;
import com.patika.kredinbizdeservice.model.Campaign;
import com.patika.kredinbizdeservice.model.CreditCard;
import com.patika.kredinbizdeservice.repository.BankRepository;
@Service
public class BankService {
	 private BankRepository bankRepository = new BankRepository();
	
    public Bank save(Bank bank) {
        System.out.println("userRepository: " + bankRepository.hashCode());

        bankRepository.save(bank);

        return bank;
    }
    public List<CreditCard> listCreditCard(Bank bank){
    	bankRepository.listByCreditCard(bank);
    	return bankRepository.creditCardList;
    }
    public List<Campaign> listCampaign(CreditCard creditCard){
    	bankRepository.listByCampaign(creditCard);
    	return bankRepository.campaginList;
    }
    public List<Campaign> listAllCampaign(){
    	return bankRepository.allCampaginList;
    }
}
