class A {
  public void show() {
    System.out.println("this show is in A");
  }
}

class B extends A {
  public void show1() {
    System.out.println("this show is in B");
  }
}

public class UpDownCasting {
  public static void main(String[] args) {

    // Upcasting means converting a child class object reference to a parent class
    // reference.
    A obj1 = new B();
    obj1.show();
    // obj1.show1(); this can not be done because obj reference to A

    // Downcasting means converting a parent reference back to a child reference.
    B obj2 = (B) obj1;
    obj2.show();
    obj2.show1();

  }

}
