package com.company.structural.adapter;

public class EmployeeAdapterLdap implements Employee {

	public EmployeeAdapterLdap(EmployeeLdap instance) {
		this.instance = instance;
	}

	private EmployeeLdap instance;

	@Override
	public String getId() {
		return instance.getCn();
	}


	@Override
	public String getFirstName() {
		return instance.getGivenName();
	}


	@Override
	public String getLastName() {
		return instance.getSurname();
	}


	@Override
	public String getEmail() {
		return instance.getMail();
	}
}
