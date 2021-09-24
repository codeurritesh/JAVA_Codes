class instance_block{  
    int speed;  
      
    instance_block(){System.out.println("speed is "+speed);}  
   
    {speed=100;}  
       
    public static void main(String args[]){  
    instance_block b1=new instance_block();  
    instance_block b2=new instance_block();  
    }      
}
