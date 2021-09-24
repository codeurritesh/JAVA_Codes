// Question related to scope of variable

// Guess what will be the output of this question

public class scope_1 {
    int z;
    void doStuff()
    { int z = 5;
      doStuff2();
      System.out.println(z);
    }
    void doStuff2() {
      z=4;
    }
  public static void main(String args[]){
    scope_1 myScope = new scope_1();
    int z = 6;
    System.out.println(z);
    myScope.doStuff();
    System.out.println(z);
    System.out.println(myScope.z);
  }
}
