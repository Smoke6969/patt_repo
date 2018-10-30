package com.company.creational.abstractfactory.validators;

import com.company.creational.abstractfactory.creditcard.CreditCard;

public class AmexPlatinumValidator implements Validator {

	@Override
	public boolean isValid(CreditCard creditCard) {
		return false;
	}
}
