public class staticvar{
   int rollno;//instance variable  
   String name;  
   static String college ="ITS";//static variable  
   //constructor  
   staticvar(int r, String n){  
   rollno = r;  
   name = n;  
   }  
   //method to display the values  
   void display (){System.out.println(rollno+" "+name+" "+college);}  
}  
//Test class to show the values of objects  
class Staticvarmain{
 public static void main(String args[]){  
 staticvar s1 = new staticvar(111,"Karan");  
 staticvar s2 = new staticvar(222,"Aryan");  
 //we can change the college of all objects by the single line of code  
 //staticvar.college="BBDIT";  
 s1.display();  
 s2.display();  
 }  
}

