package com.company.creational.abstractfactory.validators;

import com.company.creational.abstractfactory.creditcard.CreditCard;

public interface Validator {

	boolean isValid(CreditCard creditCard);
}
