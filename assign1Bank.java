package com.company;
public class assign1Bank {
    public static void main(String[] args) {
        ICICIBank iciciBank = new ICICIBank();
        kotmbank kotmBank = new kotmbank();
        System.out.println(iciciBank.getsavingInterestRate());
        System.out.println(iciciBank.getFixedInterestRate());
        System.out.println(kotmBank.getFixedInterestRate());
        System.out.println(kotmBank.getsavingInterestRate());
        GeneralBank gb1 = new ICICIBank();
        GeneralBank gb2 = new kotmbank();
        System.out.println(gb1.getsavingInterestRate());
        System.out.println(gb1.getFixedInterestRate());
        System.out.println(gb2.getFixedInterestRate());
        System.out.println(gb2.getsavingInterestRate());

    }

}
