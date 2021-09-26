package com.company;
public class kotmbank  extends GeneralBank {
    @Override
    public double getsavingInterestRate() {
        return 6.0;
    }
    @Override
    public double getFixedInterestRate()
    {
        return 9.0;
    }
}
