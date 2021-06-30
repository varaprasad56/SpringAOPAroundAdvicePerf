package com.vara.test;

import com.vara.service.BankInterestCalculator;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AopLauncher {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationConfiguration.xml");
        BankInterestCalculator interestCalculator = ctx.getBean("bankInterestService", BankInterestCalculator.class);
        double currentAmt = interestCalculator.calculateSimpleInterest(10000, 8, 5);
        System.out.println("Simple Interest Amt is " + currentAmt);
    }
}
