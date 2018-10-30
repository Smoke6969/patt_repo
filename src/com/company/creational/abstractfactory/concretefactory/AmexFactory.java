package com.company.creational.abstractfactory.concretefactory;

import com.company.creational.abstractfactory.abstractfactory.CreditCardFactory;
import com.company.creational.abstractfactory.creditcard.AmexGoldCreditCard;
import com.company.creational.abstractfactory.creditcard.AmexPlatinumCreditCard;
import com.company.creational.abstractfactory.creditcard.CreditCard;
import com.company.creational.abstractfactory.data.CardType;
import com.company.creational.abstractfactory.validators.AmexGoldValidator;
import com.company.creational.abstractfactory.validators.AmexPlatinumValidator;
import com.company.creational.abstractfactory.validators.Validator;

public class AmexFactory extends CreditCardFactory {

	@Override
	public CreditCard getCreditCard(CardType cardType){

		switch (cardType){

		case GOLD:
			return new AmexGoldCreditCard();

		case PLATINUM:
			return new AmexPlatinumCreditCard();
		}

		return null;
	}

	@Override
	public Validator getValidator(CardType cardType){

		switch (cardType){

		case GOLD:
			return new AmexGoldValidator();

		case PLATINUM:
			return new AmexPlatinumValidator();
		}

		return null;
	}

}
