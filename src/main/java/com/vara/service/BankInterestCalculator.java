package com.vara.service;

public class BankInterestCalculator {
    public double calculateSimpleInterest(int principal, int interestRate, int noOfYears) {
        return principal * interestRate * noOfYears / 100.0f;
    }
}
