import java.util.Scanner;

class CheckOperator {
  public static void main(String[] args) {}
  public static boolean checkOperator(String userInputFunction) {
    // Create a Scanner object
    Scanner userInputScannerObj = new Scanner(System.in);
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
