class InvalidAgeException extends Exception {
  InvalidAgeException(String message) {
    super(message);
  }
}

public class ExceptionDemo {

  static void checkAge(int age) throws InvalidAgeException {
    if (age < 18) {
      throw new InvalidAgeException("Age must be 18 or above");
    }
    System.out.println("Eligible to Vote");
  }

  public static void main(String[] args) {

    // Exception Handling using try-catch
    try {
      int result = 10 / 0;
      System.out.println(result);
    } catch (ArithmeticException e) {
      System.out.println("Arithmetic Exception Caught");
    }

    // Multiple Catch
    try {
      int[] arr = { 10, 20, 30 };
      System.out.println(arr[5]);
    } catch (ArithmeticException e) {
      System.out.println("Arithmetic Exception");
    } catch (ArrayIndexOutOfBoundsException e) {
      System.out.println("Array Index Out Of Bounds Exception");
    }

    // throw, Custom Exception
    try {
      checkAge(15);
    } catch (InvalidAgeException e) {
      System.out.println("Custom Exception Caught: " + e.getMessage());
    }

    System.out.println("Program Executed Successfully");
  }
}