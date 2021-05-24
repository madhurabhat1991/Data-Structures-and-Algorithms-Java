import java.util.*;

class _03_context{
  public static void main(String[] args){
    // Scope
    // System.out.println(a);  // a is out of scope
    ClassA classA = new ClassA();
    System.out.println(classA.a); // a is in the scope of classA

    // Context
    classA.functionA(); // functionA is in the context of ClassA. What object is to the left of "."?

  }
}

public class ClassA{
  public int a = 10;
  public void functionA(){
    System.out.println(this);
  }
}