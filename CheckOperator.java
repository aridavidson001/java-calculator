import java.util.Scanner;

class CheckOperator {
  public static void main(String[] args) {}
  public static boolean checkOperator(String userInputFunction) {
    Scanner userInputScannerObj =
        new Scanner(System.in); // Create a Scanner object

    switch (userInputFunction) {
      case "+":
        return true;
      case "-":
        return true;
      case "/":
        return true;
      case "x":
        return true;
      default:
        return false;
    }
  }
}
