import java.util.Scanner;

public class SimpleBot {
    final static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        greet("Steve", "2022");
        remindName();
        guessAge();
        count();
        test();
        end();
    }

    static void greet(String assistantName, String birthYear) {
        System.out.printf("Hello! My name is %s.\n", assistantName);
        System.out.printf("I was created in %s.\n", birthYear);
        System.out.println("Please, remind me your name.");
    }

    static void remindName() {
        String name = scanner.nextLine();
        System.out.printf("What a great name you have, %s!\n", name);
    }

    static void guessAge() {
        System.out.println(
            "Let me guess your age.\n" +
            "Enter remainders of dividing your age by 3, 5 and 7.");

        int rem3 = scanner.nextInt();
        int rem5 = scanner.nextInt();
        int rem7 = scanner.nextInt();
        int age = (rem3 * 70 + rem5 * 21 + rem7 * 15) % 105;
        System.out.printf("Your age is %d; that's a good time to start programming!\n", age);
    }

    static void count() {
        System.out.println("Now I will prove to you that I can count to any number you want.");
        int num = scanner.nextInt();
        for (int i = 0; i <= num; i++) {
            System.out.printf("%d!\n", i);
        }
    }

    static void test() {
        System.out.println(
            "Let's test your programming knowledge.\n" +
            "Which of the following categories DOES NOT fall under the imperative paradigm?");
        System.out.println(
            "1. Procedural\n" +
            "2. Functional\n" +
            "3. Object Oriented\n" +
            "4. Parallel Processing");

        int answer = 2; // 2. Functional is the correct answer
        int guess = scanner.nextInt();
        
        while (true) {
            if (answer == guess) {
                break;
            } else {
                System.out.println("Please, try again.\n");
                guess = scanner.nextInt();
            }
        }
    }

    static void end() {
        System.out.println("Congratulations, have a nice day!");
    }
}