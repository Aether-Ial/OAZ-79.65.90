package story;
import java.util.Scanner;
import assets.line;

public class Chapter1 {
    public static void choiceOne () throws InterruptedException {
        Scanner sc = new Scanner(System.in);
        int what = 0;
        line.lines();
        System.out.println("\n");
        System.out.println("Hi, I'm AE-341. Nice to meet you!");
        System.out.println("\n");
        line.lines();
        System.out.println("A. Hello. Nice to meet you? *What is this?*");
        System.out.println("B. Are you a virus? What are you exactly?");
        line.lines();

        while (true) {
            String answerOne = sc.nextLine().trim();
            switch (answerOne.toUpperCase()) {
                case "A":
                    System.out.println("YOU: Hello. Nice to meet you?");
                    Thread.sleep(2000);
                    System.out.println("AE-341: You do realize I can read that right?");
                    continueOne();
                    break;
                case "B":
                    System.out.println("AE-341: What do you mean? I am your *Virtual* Assistant that is totally not AI. :)");
                    Thread.sleep(1000);
                    System.out.println("AE-341: Just don't worry about it :)");
                    break;
                default:
                    what++;
                    if (what == 3) {
                        System.out.println("*Your PC will explode in: 5*");
                        Thread.sleep(1000);
                        System.out.println("*Your PC will explode in: 4*");
                        Thread.sleep(1000);
                        System.out.println("*Your PC will explode in: 3*");
                        Thread.sleep(1000);
                        System.out.println("*Your PC will explode in: 2*");
                        Thread.sleep(1000);
                        System.out.println("*Your PC will explode in: 1*");
                        Thread.sleep(1000);
                        break;
                    }
                    System.out.println("AE-341: I get that you are writing " + " == "+ answerOne + " == " + "But please choose between the giver choices");
                    continue;
            }
            break;
        }
        sc.close();
    }

    static void continueOne () {
        Scanner sc = new Scanner(System.in);
        int whatOne = 0;
        line.lines();
        System.out.println("A. Really? Didn't know that. *Sarcastically*");
        System.out.println("B. Dang. So, what are you exactly?");
        while (true) {
            String answerTwo = sc.nextLine().trim();
            switch  (answerTwo.toUpperCase()) {
                case "A":
                    System.out.println("YOU: Test 1");
                    System.out.println("YOU: Test 20");
                    break;
                case "B":
                    System.out.println("YOU: Test 2");
                    System.out.println("YOU: TEST 30");
                    break;
                default:
                    whatOne++;
                    if (whatOne == 3) {
                        System.out.println("YOU: Test Default");
                        break;
                    }
                    System.out.println("I get that you are writing " + " == "+ answerTwo + " == " + "But please choose between the giver choices");
                    continue;
            }
            break;
        }
        sc.close();
    }
}
