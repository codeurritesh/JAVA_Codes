package com.company;
    public class ICICIBank extends GeneralBank{
        @Override
        public double getsavingInterestRate() {
            return 4.0;
        }
        @Override
        public double getFixedInterestRate()
        {
            return 8.5;
        }
    }


