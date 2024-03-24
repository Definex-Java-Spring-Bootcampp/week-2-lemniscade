package com.patika.kredinbizdeservice.model;

import java.math.BigDecimal;
import java.util.List;

public class CreditCard implements Product{

    private BigDecimal fee;
    private List<Campaign> campaignList;
    private Bank bank;
    private String CardName;

   /* public CreditCard(BigDecimal fee, List<Campaign> campaignList, Bank bank, String cardName) {
		super();
		this.fee = fee;
		this.campaignList = campaignList;
		this.bank = bank;
		CardName = cardName;
	}*/

	public CreditCard(BigDecimal fee, List<Campaign> campaignList,String cardName) {
        this.fee = fee;
        this.campaignList = campaignList;
        this.CardName=cardName;
    }
    public String getCardName() {
		return CardName;
	}

	public void setCardName(String cardName) {
		CardName = cardName;
	}

	

    public BigDecimal getFee() {
        return fee;
    }

    public void setFee(BigDecimal fee) {
        this.fee = fee;
    }

    public List<Campaign> getCampaignList() {
        return campaignList;
    }

    public void setCampaignList(List<Campaign> campaignList) {
        this.campaignList = campaignList;
    }

    public Bank getBank() {
        return bank;
    }

    public void setBank(Bank bank) {
        this.bank = bank;
    }

    @Override
    public String toString() {
        return "CreditCard{" +
                "fee=" + fee +
                ", campaignList=" + campaignList +
                ", bank=" + bank +
                '}';
    }
}
