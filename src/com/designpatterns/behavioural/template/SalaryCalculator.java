package com.designpatterns.behavioural.template;

public abstract class SalaryCalculator {

	public double calculateSalary() {
		return (hourlyRate() * workingDays());
	}

	public abstract double hourlyRate();

	public abstract double workingDays();

}
