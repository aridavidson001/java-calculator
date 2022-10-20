import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner userInputScannerObj =
        new Scanner(System.in); // Create a Scanner object

    System.out.println("Input First Number");
    double userInputFirstNumber = userInputScannerObj.nextDouble();

    System.out.println("Add(+), Subtract(-), Divide(/), or Multiply(x)?");
    String userInputFunction = userInputScannerObj.nextLine();
    if (userInputFunction == "+" || userInputFunction == "-"
        || userInputFunction == "x" || userInputFunction == "/") {
    } else {
      System.out.println("Error, please input +, -, /, or x");
      System.out.println("Add(+), Subtract(-), Divide(/), or Multiply(x)?");
      userInputFunction = userInputScannerObj.nextLine();
    }
    System.out.println("Input Second Number");
    double userInputSecondNumber = userInputScannerObj.nextDouble();
    Maths maths = new Maths();

    switch (userInputFunction) {
      case "+":
        System.out.println(userInputFirstNumber + userInputFunction
            + userInputSecondNumber + " = "
            + maths.addition(userInputFirstNumber, userInputSecondNumber));
        break;
      case "-":
        System.out.println(userInputFirstNumber + userInputFunction
            + userInputSecondNumber + " = "
            + maths.subtraction(userInputFirstNumber, userInputSecondNumber));

        break;
      case "x":
        System.out.println(userInputFirstNumber + userInputFunction
            + userInputSecondNumber + " = "
            + maths.multiplication(
                userInputFirstNumber, userInputSecondNumber));

        break;
      case "/":
        System.out.println(userInputFirstNumber + userInputFunction
            + userInputSecondNumber + " = "
            + maths.division(userInputFirstNumber, userInputSecondNumber));

        break;
    }
  }
}
