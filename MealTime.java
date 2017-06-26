import java.io.Console;

public class MealTime {
  public static void main(String[] args) {
    Console myConsole = System.console();

    System.out.println("What did you eat for breakfast?");
    String yourBreakfast = myConsole.readLine();
    System.out.println("You had " + yourBreakfast + " for breakfast.");
  }
}
