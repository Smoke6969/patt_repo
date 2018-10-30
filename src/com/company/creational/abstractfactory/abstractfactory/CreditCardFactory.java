package com.company.creational.abstractfactory.abstractfactory;

import com.company.creational.abstractfactory.concretefactory.AmexFactory;
import com.company.creational.abstractfactory.concretefactory.VisaFactory;
import com.company.creational.abstractfactory.creditcard.CreditCard;
import com.company.creational.abstractfactory.data.CardType;
import com.company.creational.abstractfactory.validators.Validator;

public abstract class CreditCardFactory {

	public static CreditCardFactory getCreditCardFactory(int creditScore){

		if(creditScore > 650){
			return new AmexFactory();
		}else {
			return new VisaFactory();
		}
	}

	public abstract CreditCard getCreditCard(CardType cardType);

	public abstract Validator getValidator(CardType cardType);
}
