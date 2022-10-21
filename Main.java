import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    // setup - decleration of variables, importing other classes, etc.
    // declares variables for user input
    double userInputFirstNumber;
    String userInputFunction;
    double userInputSecondNumber;
    // creates a scanner function
    Scanner userInputScannerObj = new Scanner(System.in);
    // imports other classes
    Maths maths = new Maths();
    CheckOperator checkOperator = new CheckOperator();

    // takes input from user
    System.out.println("Input First Number");
    userInputFirstNumber = userInputScannerObj.nextDouble();
    System.out.println(
        "Add(+), Subtract(-), Divide(/), Multiply(x), or Modulus(%)?");
    userInputFunction = userInputScannerObj.nextLine();
    userInputFunction = userInputScannerObj.nextLine();
    // loops the error untill a satisfactory character is input
    if (checkOperator.checkOperator(userInputFunction) == false) {
      while (checkOperator.checkOperator(userInputFunction) == false) {
        System.out.println("Error, please input +, -, /, or x");
        userInputFunction = userInputScannerObj.nextLine();
      }
    }

    System.out.println("Input Second Number");
    userInputSecondNumber = userInputScannerObj.nextDouble();

    for (int rep = 0; rep < 10; rep++) {
      System.out.println();
    }
    // calls the correct function based on the userInputFunction
    switch (userInputFunction) {
      case "+":
        System.out.println(userInputFirstNumber + " " + userInputFunction + " "
            + userInputSecondNumber + " = "
            + maths.addition(userInputFirstNumber, userInputSecondNumber));
        break;
      case "-":
        System.out.println(userInputFirstNumber + " " + userInputFunction + " "
            + userInputSecondNumber + " = "
            + maths.subtraction(userInputFirstNumber, userInputSecondNumber));

        break;
      case "x":
        System.out.println(userInputFirstNumber + " " + userInputFunction + " "
            + userInputSecondNumber + " = "
            + maths.multiplication(
                userInputFirstNumber, userInputSecondNumber));

        break;
      case "/":
        System.out.println(userInputFirstNumber + " " + userInputFunction + " "
            + userInputSecondNumber + " = "
            + maths.division(userInputFirstNumber, userInputSecondNumber));

        break;
      case "%":
        System.out.println(userInputFirstNumber + " " + userInputFunction + " "
            + userInputSecondNumber + " = "
            + maths.mod(userInputFirstNumber, userInputSecondNumber));
        break;
    }
  }
}
