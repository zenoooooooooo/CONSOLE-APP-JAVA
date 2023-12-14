package quiz;

import java.util.Scanner;

public class Main {

    private static String name;
    private static int score = 0;
    private static String answer;
    private static Scanner sc;
    private static QuizQuestions qq;
    private static String randomQuestion;
    private static int rounds = 0;
    
    public static void welcomeUser() {
        sc = new Scanner(System.in);

        System.out.println("Enter your name...");
        name = sc.nextLine();
        System.out.println("Welcome " + name + "!" + "\n");
        while (true) {
            System.out.println("How many rounds do you want to play?");
            if (sc.hasNextInt()) {
                rounds = sc.nextInt();
                sc.nextLine(); 
                break;
            } else {
                System.out.println("Please enter a valid number.");
                sc.nextLine(); 
            }
        }
        qq = new QuizQuestions();
    }

    public static void generateQuestions() {
    	randomQuestion = qq.getQuestions();

        System.out.println("\n" + randomQuestion);
        System.out.print("Your answer: ");
        answer = sc.nextLine();
    }

    public static void checkAnswer() {
        String correctAnswer = qq.getAnswer(randomQuestion);

        if (answer.equalsIgnoreCase(correctAnswer)) {
            score++;
        } else {
        	System.out.println("\nIncorrect. Correct Answer: " + correctAnswer);
        }
    }

    public static int getScore() {
        return score;
    }

    public static void main(String[] args) {
        welcomeUser();
        
        
        for (int i = 1; i <= rounds; i++) {
            generateQuestions();
            checkAnswer();
        }

      
        System.out.println("\nThanks for playing, " + name + "! Your final score is: " + getScore() + "/" + rounds);
        sc.close();
    }
}
