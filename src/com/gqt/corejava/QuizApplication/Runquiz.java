package com.gqt.corejava.QuizApplication;

import java.util.Scanner;

public class Runquiz {

//  ANSI colors:-
	public static final String RESET = "\u001B[0m";
	public static final String GREEN = "\u001B[32m";
	public static final String RED = "\u001B[31m";
	public static final String YELLOW = "\u001B[33m";
	public static final String BLUE = "\u001B[34m";
	public static final String PURPLE = "\u001B[35m";
	public static final String GOLD = "\u001B[33;1m";
	public static final String BROWN = "\u001B[0;33m";
	public static final String CYAN = "\u001B[36m";

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		char userAns = ' ';
		
//		variables used for scores
		int score = 0;
		int scoreat5 = 0;
		int scoreat7 = 0;
		
		boolean fiftyFiftyUsedThisQuestion = false;

		QuestionsAndOptions qa = new QuestionsAndOptions();
		LifeLines life = new LifeLines();

		System.out.println(
				BLUE + "<---------------------------- Welcome to the Quiz - Game...!---------------------------->\n"+ RESET);

//		display the questions and options
		for (int i = 0; i < qa.questions.length; i++) {
			System.out.println("Question number " + (i + 1) + " :-\n");
			System.out.println(qa.questions[i] + "\n");
			for (int j = 0; j < qa.options[i].length; j++) {
				System.out.println("Option " + qa.options[i][j]);
			}
			System.out.println(CYAN + "Option E) Lifeline options" + RESET);
			while (true) {
				System.out.print("\nEnter your answer from these 5 options (A/B/C/D/E): ");
				userAns = sc.next().toUpperCase().charAt(0);

//				life line functionalities start.
				if (userAns == 'E') {
					System.out.println(PURPLE + "Lifeline options you have :- " + RESET);
					if (!life.lifeline5050used) {
						System.out.print(PURPLE + "1) 50-50 (Removes two wrong options) \t" + RESET);
					}
					if (!life.audiencePollUsed) {
						System.out.print(PURPLE + "2) Audience Poll (Shows audience opinion) \t" + RESET);
					}
					if (!life.quit) {
						System.out.print(PURPLE + "3) Quit (End the quiz now)\n" + RESET);
					}

//				    get the life line choice from user.
					boolean validLifelineChosen = false;

					while (!validLifelineChosen) {
						System.out.print("Enter your lifeline choice: ");
						int ch = sc.nextInt();

						if (ch == 1 && !life.lifeline5050used) {
							life.use5050(qa.options[i], qa.answers[i]);
							life.lifeline5050used = true;
							fiftyFiftyUsedThisQuestion = true;
							validLifelineChosen = true;
						} else if (ch == 2 && !life.audiencePollUsed) {
							life.useAudiencePoll(qa.answers[i]);
							life.audiencePollUsed = true;
							validLifelineChosen = true;
						} else if (ch == 3 && !life.quit) {
							life.quit = true;
							System.out.println(PURPLE + "\nYou chose to quit.");
							System.out.println(BROWN + "The Quiz ended here." + RESET);
							System.out.print(GREEN + "Your Score is : " + score + RESET);
							sc.close();
							return;
						} else {
							System.out.println(
									BROWN + "❌ Invalid choice. Please enter the valid lifeline option." + RESET);
						}

						if (fiftyFiftyUsedThisQuestion) {
							System.out.println("\nEnter your Answer from the 2 options: ");
							fiftyFiftyUsedThisQuestion = false;
						} else {
							System.out.println("\nEnter your Answer from the 4 Options(A/B/C/D): ");
						}
						userAns = sc.next().toUpperCase().charAt(0);
					}
				}
				if (userAns < 'A' || userAns > 'D') {
					System.out.println(BROWN + "Invalid input. Please enter the valid option" + RESET);

					continue;
				}

//				score calculations
				if (userAns == qa.answers[i]) {
					if (i == 4) {
						score += 5000;
						scoreat5 = score;
					} else if (i == 6) {
						score += 7500;
						scoreat7 = score;
					} else {
						score += 2500;
					}
					System.out.println(GREEN + "Yeyy! Correct Answer...!\t Your Score:" + score + RESET);
					break;
				} else {
					System.out.println(RED + "\nWrong answer..." + RESET);
					System.out.println(BROWN + "Game Over! Better luck next time." + RESET);
					if (i <= 4) {
						System.out.println(GREEN + "Your Score is : " + 0 + RESET);
					} else if (i > 4 && i <= 6) {
						System.out.println(GREEN + "Your Score is : " + scoreat5 + RESET);
					} else {
						System.out.println(GREEN + "Your Score is : " + scoreat7 + RESET);
					}
					sc.close();
					return;
				}
			}
			System.out.println("--------------------------------------------------------------");
		}
		// final greetings and score display
		System.out.println(GOLD + "Congratulations! You completed the quiz!" + RESET);
		System.out.println(GOLD + "Your Final Score is : " + score + RESET);
	}
}
