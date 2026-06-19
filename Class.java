import java.util.*;

class Calculator {

  // Method overloading
  /* Same class name ifferent number of parameters */
  public int add(int num1, int num2) {
    int result = num1 + num2;
    return result;
  }

  public int add(int num1, int num2, int num3) {
    int result = num1 + num2 + num3;
    return result;
  }
}

public class Class {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Calculator c = new Calculator();
    // obj of the class calculator. this obj can use the methods in that class
    System.out.print("Enter a value: ");
    int num1 = sc.nextInt();
    System.out.print("Enter a value: ");
    int num2 = sc.nextInt();
    int result = c.add(num1, num2);
    int result2 = c.add(num1, num2, 10);
    System.out.println(num1 + "+" + num2 + "=" + result);
    System.out.println(result2);
    sc.close();
  }
}