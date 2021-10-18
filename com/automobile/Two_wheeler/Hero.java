package com.automobile.Two_wheeler;
import com.automobile.Vehicle;
public class Hero extends Vehicle{
    public String modelname;
    public String registrationno;
    public String ownername;
    public int speed;
    public Hero(String modelname,String resgistrationno,String ownername,int speed)
    {
        this.modelname=modelname;
        this.registrationno=resgistrationno;
        this.ownername=ownername;
        this.speed=speed;
    }

    @Override
    public void getmodelname() {
        System.out.println("modelname:"+modelname);
    }

    @Override
    public void getregistrationno() {
        System.out.println("registration no:"+registrationno);
    }

    @Override
    public void getownername() {
        System.out.println("owner name:"+ownername);
    }
    public int getspeed()
    {
        return speed;

    }
    public void radio()
    {
        System.out.println("radio");
    }

}
