package com.kenzie.app;

// import necessary libraries

import com.fasterxml.jackson.databind.ObjectMapper;
import com.kenzie.app.game.data.Clues;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;


public class Main {
    /* Java Fundamentals Capstone project:
       - Define as many variables, properties, and methods as you decide are necessary to
       solve the program requirements.
       - You are not limited to only the class files included here
       - You must write the HTTP GET call inside the CustomHttpClient.sendGET(String URL) method
         definition provided
       - Your program execution must run from the main() method in Main.java
       - The rest is up to you. Good luck and happy coding!

     */
    //getRandom cited from Baeldung.com
    //get random int and use as clue ID to return single random question with category
    public static int getRandomIdNum() {
        int min = 1;
        int max = 355237;
        return (int) ((Math.random() * (max - min)) + min);
    }

    //check if userAnswer is correct if correct .add to ArrayList
    public static void checkIfCorrect(String userAnswer, String answer, ArrayList<String> points) {

        if (userAnswer.trim().equalsIgnoreCase(answer.trim())) {
            points.add("1");
            System.out.println("YOUR CORRECT! GREAT JOB!");
        } else {
            System.out.println("Your Answer: " + userAnswer);
            System.out.println("Correct Answer: " + answer);
        }
    }

    public static void main(String[] args) throws IOException {
        //Write main execution code here

        final String BASE_URL = "https://jservice.kenzie.academy";
        final String QUERY_STRING = "/api/clues/";


        //Store response from GET
        String responseStr1;
        String responseStr2;
        String responseStr3;
        String responseStr4;
        String responseStr5;
        String responseStr6;
        String responseStr7;
        String responseStr8;
        String responseStr9;
        String responseStr10;


        //question variables 1-10
        String question1;
        String answer1;
        String category1;
        String userAnswer1;

        String question2;
        String answer2;
        String category2;
        String userAnswer2;

        String question3;
        String answer3;
        String category3;
        String userAnswer3;

        String question4;
        String answer4;
        String category4;
        String userAnswer4;

        String question5;
        String answer5;
        String category5;
        String userAnswer5;

        String question6;
        String answer6;
        String category6;
        String userAnswer6;

        String question7;
        String answer7;
        String category7;
        String userAnswer7;

        String question8;
        String answer8;
        String category8;
        String userAnswer8;

        String question9;
        String answer9;
        String category9;
        String userAnswer9;

        String question10;
        String answer10;
        String category10;
        String userAnswer10;


        //object mapper DTO Object
        ObjectMapper objectMapper = new ObjectMapper();
        Clues questionDTOObj;

        //initialize Arraylist to add as a "point" and keep score
        ArrayList<String> points = new ArrayList<>();

        //boolean for eventLoop
        boolean continueLoop = true;

        //Scanner for userInput
        Scanner scanner = new Scanner(System.in);

        //Game start
        while (continueLoop) {

            System.out.println("Welcome to trivia quiz game!");
            System.out.println();

            //question 1 get question and category + answer
            responseStr1 = CustomHttpClient.sendGET(BASE_URL + QUERY_STRING + getRandomIdNum());
            questionDTOObj = objectMapper.readValue(responseStr1, Clues.class);
            question1 = questionDTOObj.getQuestion();
            category1 = questionDTOObj.getCategory().getTitle();
            answer1 = questionDTOObj.getAnswer();

            System.out.println("Question 1 || Question category: " + category1);
            System.out.println(question1);
            System.out.println("Type your guess and press enter!");

            //get user answer
            userAnswer1 = scanner.nextLine();
            //check answer  (userInput, question answer)
            checkIfCorrect(userAnswer1, answer1, points);

            //repeat above for question 2-10
            //question 2
            responseStr2 = CustomHttpClient.sendGET(BASE_URL + QUERY_STRING + getRandomIdNum());
            questionDTOObj = objectMapper.readValue(responseStr2, Clues.class);
            question2 = questionDTOObj.getQuestion();
            answer2 = questionDTOObj.getAnswer();
            category2 = questionDTOObj.getCategory().getTitle();
            System.out.println();
            System.out.println("Question 2 || Question category: " + category2);
            System.out.println(question2);
            System.out.println("Type your guess and press enter!");

            userAnswer2 = scanner.nextLine();
            checkIfCorrect(userAnswer2, answer2, points);

            //question 3
            responseStr3 = CustomHttpClient.sendGET(BASE_URL + QUERY_STRING + getRandomIdNum());
            questionDTOObj = objectMapper.readValue(responseStr3, Clues.class);
            question3 = questionDTOObj.getQuestion();
            answer3 = questionDTOObj.getAnswer();
            category3 = questionDTOObj.getCategory().getTitle();

            System.out.println();
            System.out.println("Question 3 || Question category: " + category3);
            System.out.println(question3);
            System.out.println("Type your guess and press enter!");

            userAnswer3 = scanner.nextLine();
            checkIfCorrect(userAnswer3, answer3, points);

            //question 4
            responseStr4 = CustomHttpClient.sendGET(BASE_URL + QUERY_STRING + getRandomIdNum());
            questionDTOObj = objectMapper.readValue(responseStr4, Clues.class);
            question4 = questionDTOObj.getQuestion();
            answer4 = questionDTOObj.getAnswer();
            category4 = questionDTOObj.getCategory().getTitle();

            System.out.println();
            System.out.println("Question 4 || Question category: " + category4);
            System.out.println(question4);
            System.out.println("Type your guess and press enter!");

            userAnswer4 = scanner.nextLine();
            checkIfCorrect(userAnswer4, answer4, points);

            //question 5
            responseStr5 = CustomHttpClient.sendGET(BASE_URL + QUERY_STRING + getRandomIdNum());
            questionDTOObj = objectMapper.readValue(responseStr5, Clues.class);
            question5 = questionDTOObj.getQuestion();
            answer5 = questionDTOObj.getAnswer();
            category5 = questionDTOObj.getCategory().getTitle();

            System.out.println();
            System.out.println("Question 5 || Question category: " + category5);
            System.out.println(question5);
            System.out.println("Type your guess and press enter!");

            userAnswer5 = scanner.nextLine();
            checkIfCorrect(userAnswer5, answer5, points);

            //question 6
            responseStr6 = CustomHttpClient.sendGET(BASE_URL + QUERY_STRING + getRandomIdNum());
            questionDTOObj = objectMapper.readValue(responseStr6, Clues.class);
            question6 = questionDTOObj.getQuestion();
            answer6 = questionDTOObj.getAnswer();
            category6 = questionDTOObj.getCategory().getTitle();

            System.out.println();
            System.out.println("Question 6 || Question category: " + category6);
            System.out.println(question6);
            System.out.println("Type your guess and press enter!");

            userAnswer6 = scanner.nextLine();
            checkIfCorrect(userAnswer6, answer6, points);

            //question 7
            responseStr7 = CustomHttpClient.sendGET(BASE_URL + QUERY_STRING + getRandomIdNum());
            questionDTOObj = objectMapper.readValue(responseStr7, Clues.class);
            question7 = questionDTOObj.getQuestion();
            answer7 = questionDTOObj.getAnswer();
            category7 = questionDTOObj.getCategory().getTitle();

            System.out.println();
            System.out.println("Question 7 || Question category: " + category7);
            System.out.println(question7);
            System.out.println("Type your guess and press enter!");

            userAnswer7 = scanner.nextLine();
            checkIfCorrect(userAnswer7, answer7, points);

            //question 8
            responseStr8 = CustomHttpClient.sendGET(BASE_URL + QUERY_STRING + getRandomIdNum());
            questionDTOObj = objectMapper.readValue(responseStr8, Clues.class);
            question8 = questionDTOObj.getQuestion();
            answer8 = questionDTOObj.getAnswer();
            category8 = questionDTOObj.getCategory().getTitle();

            System.out.println();
            System.out.println("Question 8 || Question category: " + category8);
            System.out.println(question8);
            System.out.println("Type your guess and press enter!");

            userAnswer8 = scanner.nextLine();
            checkIfCorrect(userAnswer8, answer8, points);

            //question 9
            responseStr9 = CustomHttpClient.sendGET(BASE_URL + QUERY_STRING + getRandomIdNum());
            questionDTOObj = objectMapper.readValue(responseStr9, Clues.class);
            question9 = questionDTOObj.getQuestion();
            answer9 = questionDTOObj.getAnswer();
            category9 = questionDTOObj.getCategory().getTitle();

            System.out.println();
            System.out.println("Question 9 || Question category: " + category9);
            System.out.println(question9);
            System.out.println("Type your guess and press enter!");

            userAnswer9 = scanner.nextLine();
            checkIfCorrect(userAnswer9, answer9, points);

            //question 10
            responseStr10 = CustomHttpClient.sendGET(BASE_URL + QUERY_STRING + getRandomIdNum());
            questionDTOObj = objectMapper.readValue(responseStr10, Clues.class);
            question10 = questionDTOObj.getQuestion();
            answer10 = questionDTOObj.getAnswer();
            category10 = questionDTOObj.getCategory().getTitle();

            System.out.println();
            System.out.println("Question 10 || Question category: " + category10);
            System.out.println(question10);
            System.out.println("Type your guess and press enter!");

            userAnswer10 = scanner.nextLine();
            checkIfCorrect(userAnswer10, answer10, points);

            //game over
            //display total score/points
            //return int of points.size for totalPoints
            int totalPoints = points.size();

            System.out.println();
            System.out.println("Game Over!");
            System.out.println("Total correct answers: " + totalPoints);
            System.out.println();
            System.out.println("Play again ? Y/N");


            //End game or replay
            String playAgain;
            playAgain = scanner.nextLine();

            if (playAgain.equalsIgnoreCase("N")) {
                continueLoop = false;
                System.out.println("Thanks for playing!");
            }
            //clear list if play new game
            else {
                points.clear();
            }
        }
    }
}

