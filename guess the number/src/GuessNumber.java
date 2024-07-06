import java.util.Scanner;
class GuessNumber {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    boolean result = false;

    System.out.print("The game starts - select the range of the numbers: ");
    int userNumber = s.nextInt();
    System.out.println("selected range: 0 - " + userNumber); 
    
    int randomNumber = 0;
    randomNumber = (int) (Math.random()*(userNumber-0));

    while (result == false) {
      System.out.println("your choice: ");
      int userChoice = s.nextInt();
      if (randomNumber == userChoice) {
        result = true;
      } else {
        if (randomNumber < userChoice) {
          System.out.println("the number is smaller");
        } else {
          System.out.println("the number is greater");
        }
      }
    }
    s.close();
  }
}