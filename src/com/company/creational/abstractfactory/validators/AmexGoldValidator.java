package com.company.creational.abstractfactory.validators;

import com.company.creational.abstractfactory.creditcard.CreditCard;

public class AmexGoldValidator implements Validator {

	@Override
	public boolean isValid(CreditCard creditCard) {
		return false;
	}
}
