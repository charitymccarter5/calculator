import java.util.Scanner;

class App {
  public static void main (String[] args) {
    // System.out.println("Hello, World!");
    String stringPrompt = "What would you like to do? add, subtract, multiply, divide, or exit?";
    String doublePrompt = "Please enter a Double.";
    App myApp = new App();
    String input = "";
    
    
    Calculator calc = new Calculator();
    while (!input.equals("exit")){
        input = myApp.getString(stringPrompt);
        if (input.equals("exit")) {
            System.out.println("Goodbye.");
        } else {
        Double num1 = myApp.getDouble(doublePrompt);
        Double num2 = myApp.getDouble(doublePrompt);
        if (input.equals("add")) {
            calc.add(num1, num2);
        } else if (input.equals("subtract")){
            calc.subtract(num1, num2);
        } else if (input.equals("multiply")) {
            calc.multiply(num1, num2);
        } else if (input.equals("divide")) {
            calc.divide(num1, num2);
        }
       } //myApp.getString(stringPrompt);
    }
    
    
    
    
}



    private static final Scanner inputScanner = new Scanner(System.in);

    private static String getString(String prompt) {
        System.out.println(prompt);
        String userString = inputScanner.nextLine();
        return userString;
   }
   private static double getDouble(String prompt) {
        System.out.println(prompt);
        Double userDouble = inputScanner.nextDouble();
        inputScanner.nextLine();
        return userDouble;
   } 
}
