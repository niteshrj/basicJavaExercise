package com.thoughtworks.basicJavaExercise.Abstraction;

public class BankInterest {
    int rate;
    public BankInterest(Bank bank) {
        rate = bank.getRateOfInterest();
    }

    public int getRate(){
        return rate;
    }

    public static void main(String[] args) {
        SBI sbi = new SBI();
        BankInterest i = new BankInterest(sbi);
        System.out.println(i.getRate());
    }
}
