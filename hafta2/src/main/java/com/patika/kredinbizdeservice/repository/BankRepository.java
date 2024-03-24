package com.patika.kredinbizdeservice.repository;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import com.patika.kredinbizdeservice.model.Bank;
import com.patika.kredinbizdeservice.model.Campaign;
import com.patika.kredinbizdeservice.model.CreditCard;

public class BankRepository {
	 private List<Bank> bankList = new ArrayList<>();
	 public List<CreditCard> creditCardList=new ArrayList<>();
	 public List<Campaign> campaginList=new ArrayList<>();
	 public List<Campaign> allCampaginList=new ArrayList<>();
	    public void save(Bank bank) {
	    	Bank bankac=new Bank(bank.getName(),bank.getCreditCards());
	    	bankList.add(bankac);
	    	List<CreditCard> creditList=new ArrayList<>();
	    	creditList=bankac.getCreditCards();
	    	List<CreditCard> newCreditCardList = new ArrayList<>();
	    	for (CreditCard creditCard : creditList) {
	    	    newCreditCardList.add(creditCard);
	    	}
	    	bankac.creditCards.addAll(newCreditCardList);
	    	for(CreditCard card:newCreditCardList) {
		    	allCampaginList.addAll(card.getCampaignList());
	    	}
	    	Collections.sort(allCampaginList, Comparator.comparing(Campaign::getCreateDate));
	    }
	    public void listByCreditCard(Bank banka) {
	    	for (Bank bank:bankList) {
	    		if(bank.getName().equals(banka.getName())) {
	    			creditCardList=bank.getCreditCards();
	    		}
	    		System.out.println("a");
	    	}
	    }
	    public void listByCampaign(CreditCard cardi) {
	    	for (CreditCard card:creditCardList) {
	    		if(card.getCardName()==cardi.getCardName()) {
	    			campaginList=card.getCampaignList();
	    		}
	    	}
	    }
}
