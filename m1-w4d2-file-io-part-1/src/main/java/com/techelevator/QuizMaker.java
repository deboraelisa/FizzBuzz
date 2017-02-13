package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class QuizMaker {

	public static void main(String[] args) {

		try(Scanner userInput = new Scanner(System.in)) {
			System.out.print("Let's play a quiz! Please start answering the questions. >>> ");
			System.out.println();
			String filePath = "Quizmakerinput.txt";
			int totalCorrectAnswers = 0;
			int correctAnswer = 0;
			File quizFile = getSearchFile(filePath);
			try(Scanner fileInput = new Scanner(quizFile)){
				while(fileInput.hasNextLine()) {

					String line = fileInput.nextLine();
					String[] questionsAndAnswers = line.split("[|]");
					System.out.println();
					System.out.println(questionsAndAnswers[0]);
					for(int i = 1; i < questionsAndAnswers.length; i++){
						if(questionsAndAnswers[i].endsWith("*")){
							questionsAndAnswers[i] = questionsAndAnswers[i].substring(0, questionsAndAnswers[i].length() - 1);
							correctAnswer = i;
						}

						System.out.println(i + ")" + questionsAndAnswers[i]);
					}
					System.out.print("Please select your answer:");
					Scanner userAnswer = new Scanner(System.in);
					int userAnswer1 = userAnswer.nextInt();
					if(userAnswer1 == correctAnswer){
						totalCorrectAnswers++;
						System.out.println("RIGHT!");
					} else {
						System.out.println("WRONG!");
					}
				}
				System.out.println();
				System.out.println("You got " + totalCorrectAnswers + " answers correct out of the total 10 questions asked.");
			}

		} catch (FileNotFoundException ex) {
			System.out.println(ex.getMessage());
			System.exit(1);
		} catch (IOException ex) {
			System.out.println(ex.getMessage());
			System.exit(1);
		}
	}

	private static File getSearchFile(String filePath) throws IOException{
		
		File searchFile = new File(filePath);

		if(!searchFile.exists()){
			throw new FileNotFoundException("Search file: " + filePath + " does not exist");
		}
		if(!searchFile.isFile()){
			throw new IOException("Search file " + filePath + " exists but is not a file!");
		}
		return searchFile;
	}

}



//## QuizMaker
//
//#### Challenge
//
//Create a quiz maker program which asks the user a question, 
//presents multiple choice answers, and allows the user to specify
//a correct answer.
//
//The program will read the questions from an input file during 
//startup. The questions and answers will be pipe delimited | and 
//correct answers will be marked with an asterisk in the file.
//
//```
//Question-1|answer-1|answer-2|correct-answer*|answer-4
//```
//
//Example file
//
//```
//What color is the sky?|yellow|blue*|green|red
//What are Cleveland's odds of winning a championship?|Not likely*|Highly likely|Fat chance|Who cares??
//```
//
//**Tips**
//
//* Create a class that can model a quiz question, available answers, 
//and a correct answer.
//* While reading the input file, create an instance of the `quiz 
//question` class and store it in a collection of quiz questions.
//
//**Step 1**
//
//Ask a single question to the user when the application is opened.
//Don't show the right answer in the list of choices.
//
//Example
//
//```
//What color is the sky?
//1. Yellow
//2. Blue
//3. Green
//4. Red
//
//Your answer: 2
//
//WRONG!
//``` 
//
//**Step 2**
//
//Go through all of the available quiz questions and ask 
//the user each one sequentially, recording how many answers they got
//correct.
//
//Example
//
//```
//What color is the sky?
//1. Yellow
//2. Blue
//3. Green
//4. Red
//
//Your answer: 2
//
//WRONG!
//
//What are Cleveland's odds of winning a championship?
//1. Not likely
//2. Highly likely
//3. Fat chance
//4. Who cares??
//
//Your answer: 1
//
//RIGHT!
//
//You got 1 answers correct out of the total 2 questions asked
//