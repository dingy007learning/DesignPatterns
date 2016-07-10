package com.designpatterns.behavioural.template;

public class TemplatePatternTest {
	public static void main(String[] args) {
		SalaryCalculator calculator  = new DeveloperSalaryCalculator();
		System.out.println("Salary: " + calculator.calculateSalary());
		calculator = new ManagerSalaryCalculator();
		System.out.println("Salary: " + calculator.calculateSalary());
	}
}
