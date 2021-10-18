package com.automobile;
//import com.automobile.Vehicle;
public class Honda extends Vehicle{
    public String modelname;
    public String registrationno;
    public String ownername;
    public int speed;
    public Honda(String modelname,String resgistrationno,String ownername,int speed)
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
    public void cdplayer()
    {
        System.out.println("cd");
    }

}

