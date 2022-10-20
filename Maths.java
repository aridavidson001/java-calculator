class Maths{
    public static void main(String[] args){
        
    }
  public static String checkEven(double initialValue) {
        if(initialValue % 2 == 0){
          return "Even";
        }
        else{
            return "Odd";
        }  
  }
  
  public static double addition(double userInputFirstNumber, double userInputSecondNumber){
      return userInputFirstNumber + userInputSecondNumber;
  }
   public static double subtraction(double userInputFirstNumber, double userInputSecondNumber){
      return userInputFirstNumber - userInputSecondNumber;
  }
   public static double multiplication(double userInputFirstNumber, double userInputSecondNumber){
      return userInputFirstNumber * userInputSecondNumber;
  }
   public static double division(double userInputFirstNumber, double userInputSecondNumber){
      return userInputFirstNumber / userInputSecondNumber;
  }
}
