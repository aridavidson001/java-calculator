import java.util.Scanner;

class CheckOperator {
  public static void main(String[] args) {}
  public static void checkOperatorFunc(String userInputFunction) {
    Scanner userInputScannerObj = new Scanner(System.in);
    if (checkOperator(userInputFunction) == false) {
      while (checkOperator(userInputFunction) == false) {
        System.out.println("Error, please input +, -, /, or x");
        userInputFunction = userInputScannerObj.nextLine();
      }
    }
  }

  public static boolean checkOperator(String userInputFunction) {
    // cycle through possible operators
    switch (userInputFunction) {
      case "+":
        return true;
      case "-":
        return true;
      case "/":
        return true;
      case "x":
        return true;
      case "%":
        return true;
      default:
        return false;
    }
  }
}
