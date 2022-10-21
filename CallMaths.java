public class CallMaths{
  public static void main(String[] args) {}
public static void callMaths(double userInputFirstNumber, String userInputFunction, double userInputSecondNumber){
     //imports the math class
     Maths maths = new Maths();
   
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