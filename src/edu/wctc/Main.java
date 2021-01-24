package edu.wctc;

import java.util.Scanner; // Import the Scanner class

public class Main {

    public static void main(String[] args) {
        userQuiz();
    }

    public static void userQuiz() {
        Scanner preferences = new Scanner(System.in); // Create a Scanner object

        String[] choices = {"Do you prefer mild or spicy?", "Do you prefer tea or coffee?", "Do you prefer breakfast or brunch?",
                "Do you prefer summer or winter?", "Do you prefer paper or plastic?"};

        int[] userInput = new int[5];
        int total = 0;

        boolean stop = false;
        while (!stop) {
            System.out.println(choices[0] + " (Enter 0 for the left choice or 1 for the right choice)");
            String input = preferences.nextLine(); // Read user input
            userInput[0] = Integer.parseInt(input);

            System.out.println(choices[1] + " (Enter 0 for the left choice or 1 for the right choice)");
            String input2 = preferences.nextLine(); // Read user input
            userInput[1] = Integer.parseInt(input2);

            System.out.println(choices[2] + " (Enter 0 for the left choice or 1 for the right choice)");
            String input3 = preferences.nextLine(); // Read user input
            userInput[2] = Integer.parseInt(input3);

            System.out.println(choices[3] + " (Enter 0 for the left choice or 1 for the right choice)");
            String input4 = preferences.nextLine(); // Read user input
            userInput[3] = Integer.parseInt(input4);

            System.out.println(choices[4] + " (Enter 0 for the left choice or 1 for the right choice)");
            String input5 = preferences.nextLine(); // Read user input
            userInput[4] = Integer.parseInt(input5);

            for (int i = 0; i < userInput.length; i++) {
                total += userInput[i];
            }

            System.out.println("Your score: " + total);

            if (total < 3) {
                System.out.println("You prefer life to be calm and organized.");
            } else if (total > 3) {
                System.out.println("You prefer life to be spontaneous and active.");
            } else {
                System.out.println("You prefer a good balance in life.");
            }

            System.out.println("Would you like to take the quiz again? (yes or no)");
            String response = preferences.nextLine();
            if (response.equals("no")) {
                stop = true;
            }
        }
    }

}