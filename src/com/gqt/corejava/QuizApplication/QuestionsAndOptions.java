package com.gqt.corejava.QuizApplication;

class QuestionsAndOptions {
	
		String questions[] = {
				"What is the main function of the JVM in the Java platform?",
				"Why is JRE required to run a Java program?",
				"What part of memory is used for method call details and local variables?",
				"Which of the following conversions is not allowed implicitly (without casting)?",
				"Which package must be imported to use the Scanner class?",
				"Which of the following correctly describes the difference between int and Integer?",
				"Which loop in Java checks the condition after executing the loop body at least once?",
				"What is the primary role of an else if block in Java?",
				" What is true about jagged arrays in Java? ",
				"What is the result of comparing two string objects using == operator?"
		};

		String[][] options = {
			    {"A) Converts Java source code to bytecode", "B) Compiles .java files", 
			    	"C) Executes bytecode on the host machine", "D) Stores compiled libraries"},
			    {"A) It converts source code to bytecode", "B) It creates .class files", 
			    	"C) It contains JVM and runtime libraries", "D) It builds JAR files"},
			    {"A) Heap", "B) Stack", "C) Static Pool", "D) Method Area"},
			    {"A) float → long", "B) byte → int", "C) int → double", "D) char → int"},
			    {"A) java.util.input", "B) java.io", "C) java.scanner", "D) java.util"},
			    {"A) int is a class, Integer is a primitive", "B) int is a primitive, Integer is an object wrapper class", 
			    	"C) Both are primitive types", "D) Both are immutable objects"},
			    {"A) for", "B) while", "C) do-while", "D) nested-for"},
			    {"A) To execute when if and else both run", "B) To check additional conditions if if fails", 
			    	"C) To end the if-else chain", "D) To execute unconditionally"},
			    {"A) They are arrays of arrays, where each row can have different lengths",
			    	"B) They are supported only in 1D arrays", "C) All rows must have the same number of columns",
			    	"D) They are created using ArrayList instead of arrays"},
			    {"A) It compares the content of the strings", "B) It always returns true", 
			     "C) It performs a case-insensitive match", "D) It compares the references of the strings"}
			};
		
		char[] answers = {'C', 'C', 'B', 'A', 'D', 'B', 'C', 'B', 'A', 'D'};
}

