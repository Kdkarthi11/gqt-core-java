package com.gqt.corejava.QuizApplication;

public class LifeLines {
	public static final String RESET = "\u001B[0m";
	public static final String PURPLE = "\u001B[35m";
	
	boolean lifeline5050used =false;
	boolean audiencePollUsed = false;
	boolean quit = false;
	
	public void use5050(String options[],char correctAns){
		int wronganswer =0;
		
		System.out.println(PURPLE+"\nUsing 50-50 Lifeline:"+RESET);
        System.out.println(PURPLE+"Remaining Options:"+RESET);
        
        for(int i=0;i<options.length;i++) {
        	char optionLetter = options[i].charAt(0);
        	
        	if(optionLetter == correctAns) {
        		System.out.println("Option " + options[i]);
        	}
        	else if(wronganswer == 0) {
        		System.out.println("Option " + options[i]);
        		wronganswer++;
        	}
        }
	}
	
	public void useAudiencePoll(char correctAns) {
	    System.out.println(PURPLE + "\nUsing Audience Poll:" + RESET);
	    //generate the Audience poll percentage
	    int correctPercent = (int)(Math.random() * 16 + 40); // 40% to 55%
	    int remaining = 100 - correctPercent;
	    int wrong1 = remaining / 2;
	    int wrong2 = remaining - wrong1;

	    switch (correctAns) {
	        case 'A':
	            System.out.println("A) " + correctPercent + "%");
	            System.out.println("B) " + wrong1 + "%");
	            System.out.println("C) " + wrong2 + "%");
	            System.out.println("D) 0%");
	            break;
	        case 'B':
	            System.out.println("A) " + wrong1 + "%");
	            System.out.println("B) " + correctPercent + "%");
	            System.out.println("C) " + wrong2 + "%");
	            System.out.println("D) 0%");
	            break;
	        case 'C':
	            System.out.println("A) " + wrong2 + "%");
	            System.out.println("B) " + wrong1 + "%");
	            System.out.println("C) " + correctPercent + "%");
	            System.out.println("D) 0%");
	            break;
	        case 'D':
	            System.out.println("A) 0%");
	            System.out.println("B) " + wrong2 + "%");
	            System.out.println("C) " + wrong1 + "%");
	            System.out.println("D) " + correctPercent + "%");
	            break;
	    }
	}
}

