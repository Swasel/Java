class A {
  public void show() {
    System.out.println("in show");
  }

  class B {
    public void config() {
      System.out.println("In config");
    }
  }
}

public class InnerClass {
  public static void main(String[] args) {
    A obj = new A();
    obj.show();
    A.B obj1 = obj.new B();
    obj1.config();

    // Anonymous Inner class
    //this can be done in abstract class also
    A obj2 = new A() {
      public void show() {
        System.out.println("new show");
      }
    };
    obj2.show();
  }
}
