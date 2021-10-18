package com.automobile;
import com.automobile.Vehicle;
import com.automobile.Two_wheeler.Hero;




public class test_auto {

    public static void main(String[] args) {

        Hero hero = new Hero("maestro", "UP85 4958", "tanya", 6);
        hero.getregistrationno();
        hero.getownername();
        hero.getmodelname();
        hero.getspeed();
        hero.radio();
        System.out.println();
        Honda honda = new Honda("city", "UP81 2775", "ritesh", 12);
        honda.getmodelname();
        honda.getownername();

        honda.getregistrationno();
        honda.getspeed();
        honda.cdplayer();
    }
}








