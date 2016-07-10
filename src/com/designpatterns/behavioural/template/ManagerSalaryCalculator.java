package com.designpatterns.behavioural.template;

public class ManagerSalaryCalculator extends SalaryCalculator {

	@Override
	public double hourlyRate() {
		return 150.00;
	}

	@Override
	public double workingDays() {
		return 22;
	}

}
