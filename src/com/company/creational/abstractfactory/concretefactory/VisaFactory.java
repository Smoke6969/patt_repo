package com.company.creational.abstractfactory.concretefactory;

import com.company.creational.abstractfactory.abstractfactory.CreditCardFactory;
import com.company.creational.abstractfactory.creditcard.CreditCard;
import com.company.creational.abstractfactory.creditcard.VisaBlackCreditCard;
import com.company.creational.abstractfactory.creditcard.VisaGoldCreditCard;
import com.company.creational.abstractfactory.data.CardType;
import com.company.creational.abstractfactory.validators.Validator;
import com.company.creational.abstractfactory.validators.VisaValidator;

public class VisaFactory extends CreditCardFactory {

	@Override
	public CreditCard getCreditCard(CardType cardType){

		switch (cardType){

		case GOLD:
			return new VisaGoldCreditCard();

		case PLATINUM:
			return new VisaBlackCreditCard();
		}

		return null;
	}

	@Override
	public Validator getValidator(CardType cardType){
		return new VisaValidator();
	}

}
