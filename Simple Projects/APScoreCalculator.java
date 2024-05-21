import java.util.*;

public class APScoreCalculator {
  public static void main(String[] args) {
    print("Welcome to our AP Computer Science Score Calculator!");
    print("This program will require your MCQ score and your four FRQ scores.");
    print("This calculator will loop until an action has been made.");
    runCalculatorLoop();
  }

  public static void runCalculatorLoop() {
    Scanner sc = new Scanner(System.in);
    while (true) {
      calcFinal();
      print("Would you like to exit this program? Type 1 to exit or 0 to stay.");
      int n = sc.nextInt();
      if (n == 1) {
        break;
      }
    }
  }

  public static double getMCQ(int mcq) {
    return (double) (mcq); // returns MCQ points in decimal form
  }

  public static double getFRQ(int frq) {
    return frq * 1.11111111; // returns scaled FRQ points
  }

  public static int finalScore(double total) { // calculates number grade
    if (total >= 62) {
      return 5;
    } else if (total >= 47) {
      return 4;
    } else if (total >= 37) {
      return 3;
    } else if (total >= 29) {
      return 2;
    } else
      return 1;
  }

  public static void print(String thing) { // delayed text is cool
    int wha = 0;
    while (wha < thing.length()) {
      System.out.print(thing.charAt(wha));
      try {
        Thread.sleep(20);
      } catch (Exception expn) {
        break;
      }
      wha++;
    }
    System.out.print("\n");
  }

  public static int calcFinal() {
    Scanner u = new Scanner(System.in);
    int mcq;
    int frq = 0;
    // creates scanner object 'u' and initializes 'mcq' and 'frq' integer variables
    while (true) {
      print("\nHow many multiple choice questions did you get right out of 40?");
      mcq = u.nextInt();
      if (mcq < 0 || mcq > 40) {
        continue; // asks again if received an invalid input
      }
      break; // ends loop once received valid input
    }
    for (int i = 0; i < 4; i++) {
      while (true) {
        print("How many free response points did you get out of 9 for question " + (i + 1));
        int frqp = u.nextInt();
        if (frqp < 0 || frqp > 9) {
          continue; // asks again if received an invalid input
        }
        frq += frqp;
        break; // ends loop once received valid input
      }
    }
    double sum = getMCQ(mcq) + getFRQ(frq); // adds up total points
    int finals = finalScore(sum); // calculates number grade from points

    print("You got a total score of " + Math.round(sum)); // prints points
    if (finals < 3) {
      print("Too bad! You got a " + finals + "! \nBetter luck next year.");
    } else if (finals == 3) {
      print("You passed! You got a " + finals + "!");
    } else {
      print("Great job! You got a " + finals);
    } // prints number grade
    return finals; // returns number grade
  }
}

/*
 * Threshholds:
 * 0-28 = 1
 * 29-36 = 2
 * 37-46 = 3
 * 47-61 = 4
 * 62+ = 5
 */
