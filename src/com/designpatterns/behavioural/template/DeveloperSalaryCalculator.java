package com.designpatterns.behavioural.template;

public class DeveloperSalaryCalculator extends SalaryCalculator {

	@Override
	public double hourlyRate() {
		return 80.00;
	}

	@Override
	public double workingDays() {
		return 22;
	}

}
