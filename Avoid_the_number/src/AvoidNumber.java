/*
 * 17.03.2024
 * Version 1.0
 * by Artem Sinchuk
 */

import java.util.Scanner;

class AvoidNumber{
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    boolean found = false;
    int userNum = 0;
    int secretNumber = 0;
    System.out.println("Try to avoid choosing the same number as me; \nI'm going to ask you 5 questions. If we have the same answer, you are out.");
    
    while (found == false) {
    //1:
      System.out.println("Starting with question 1, pick a number from 1 to 100");
      secretNumber = (int) (Math.random() * 100) + 1;
      System.out.print("1: ");
      userNum = s.nextInt();
      if (secretNumber != userNum) {
        // if (userNum < 0 || userNum > 100){
        //   System.out.println("not fair, you are out");
        //   found = true;
        // } else {
        System.out.println("my number is " + secretNumber);
        System.out.println("congratulations");
        System.out.println(" ");
    //2:
        secretNumber = (int) (Math.random() * 25) + 1;
        System.out.println("next name a number from 1 to 25");
        System.out.print("2: ");
        userNum = s.nextInt();
        if (secretNumber != userNum) {
        System.out.println("my number is " + secretNumber);
        System.out.println("congratulations");
        System.out.println(" ");
    //3:
        secretNumber = (int) (Math.random() * 10) + 1;
        System.out.println("next name a number from 1 to 10");
        System.out.print("3: ");
        userNum = s.nextInt();
        if (secretNumber != userNum) {
        System.out.println("my number is " + secretNumber);
        System.out.println("congratulations");
        System.out.println(" ");
    //4:
      secretNumber = (int) (Math.random() * 5) + 1;
      System.out.println("next name a number from 1 to 5");
      System.out.print("4: ");
      userNum = s.nextInt();
      if (secretNumber!= userNum) {
      System.out.println("my number is " + secretNumber);
      System.out.println("congratulations");
      System.out.println(" ");
    //5:
      secretNumber = (int) (Math.random() * 3) + 1;
      System.out.println("next name a number from 1 to 3");
      System.out.print("5: ");
      userNum = s.nextInt();
      if (secretNumber!= userNum) {
      System.out.println("my number is " + secretNumber);
      System.out.println("congratulations");
      System.out.println(" ");
      found = true;

                     } else { //1:3
                       System.out.println("you are out");
                       found = true;
                     }
                   } else { //1:5
               System.out.println("you are out");
               found = true;
             }
          } else { //1:10
          System.out.println("you are out");
          found = true;
        }
        } else { //1:25
          System.out.println("you are out");
          found = true;
        }
      } else { //1:100
        System.out.println("you are out");
        found = true;
      }
    }
  
    s.close();
  }
}