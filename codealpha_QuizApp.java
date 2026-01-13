import java.util.Scanner;

public class QuizApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] questions = {
            "1. Java kis type ki language hai?",
            "2. Java me entry point method ka naam kya hai?",
            "3. Java me OOP concept kaun sa nahi hai?"
        };

        String[][] options = {
            {"a) Procedural", "b) Object Oriented", "c) Assembly", "d) Machine"},
            {"a) start()", "b) run()", "c) main()", "d) init()"},
            {"a) Inheritance", "b) Encapsulation", "c) Compilation", "d) Polymorphism"}
        };

        char[] answers = {'b', 'c', 'c'};
        int score = 0;

        for (int i = 0; i < questions.length; i++) {
            System.out.println(questions[i]);
            for (String opt : options[i]) {
                System.out.println(opt);
            }

            System.out.print("Your answer: ");
            char userAnswer = sc.next().toLowerCase().charAt(0);

            if (userAnswer == answers[i]) {
                score++;
            }
            System.out.println();
        }

        System.out.println("Quiz Completed!");
        System.out.println("Your Score: " + score + "/" + questions.length);

        sc.close();
    }
}
