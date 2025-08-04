package com.gqt.corejava.stringProgramming;

public class StringCode_BuiltInMethods {
	public static void main(String[] args) {
		String str= "SachinRameshTendulkar";
		//1.length()
		int len=str.length();//it will provide the total length of the string
		System.out.println("The length of the String:"+len);
		
		//2.charAt();
		char c =str.charAt(0);//it will provide the character at the specified position
		System.out.println("The character at the 0th position = "+c);
		
//		c =str.charAt(100);//it lead to IndexOutOfBounds exception as we have only 21 positions
//		System.out.println("The character at the 100th position = "+c);
		
		
//		3.concat()
		String s1 =str.concat(" is the best batsman in the world.");//it will merges the content of the two strings.
		System.out.println(s1);
		
//		4.contains()
		boolean res1 =str.contains("Remesh");//it will check if the substring present in the main string  
		System.out.println("result of the contains method : "+res1);
		
//		5.endsWith()
		boolean res2 =str.endsWith("Tendulkar");//it will check if the substring present at the end of the main string  
		System.out.println("result of the endsWith method : "+res2);
		res2 =str.endsWith("Pendulkar");
		System.out.println("result of the endsWith method : "+res2);
		
//		6.startsWith()
		boolean res3 =str.startsWith("Sachin");//it will check if the substring present at the start of the main string  
		System.out.println("result of the startsWith method : "+res3);
		res3 =str.startsWith("Pachin");
		System.out.println("result of the startsWith method : "+res3);
		
//		7.getClass()
		Class class1 = str.getClass();//it will provide the root class path of the object.
		System.out.println("result of the getClass() method:"+class1);
		
//		8.hashCode()
		int hashValue = str.hashCode();//it will return the hash code of the given object.
		System.out.println("result of the hashCode() method:"+hashValue);
		
//		9.indexOf()
		int index1 = str.indexOf('S');//it will provide the index of the specified character in the main string.
		System.out.println("result of the indexOf() method:"+index1);
		index1 = str.indexOf('Z');//it will provide the index of the specified character in the main string.
		System.out.println("result of the indexOf() method:"+index1);
		
//		10.isBlank()
		boolean res4 = str.isBlank();//it checks if the String is empty or has only spaces.
		System.out.println("result of the isBlank() method:"+res4);
		String str2 ="      ";
		 res4= str2.isBlank();//it checks if the String is empty or has only spaces.
		System.out.println("result of the isBlank() method:"+res4);
		String str3 ="";
		boolean res6= str3.isBlank();//it checks if the String is empty or has only spaces.
		System.out.println("result of the isBlank() method:"+res6);
		
//		11.isEmpty()
		boolean res7 =str.isEmpty();//it checks if the String is empty 
		System.out.println("result of the isEmpty() method:"+res7);
		String str4 ="";
		boolean res8= str4.isEmpty();//it checks if the String is empty 
		System.out.println("result of the isEmpty() method:"+res8);
		
//		12.lastIndexOf()
		int index2 = str.lastIndexOf('e');//it will provide the last occurrence position of the specified character. 
		System.out.println("result of the lastIndexOf() method:"+index2);
		
//		13.replace()
		String str5 = str.replace('S','$');//it will replace the last character by new character.
		System.out.println("result of the replace() method:"+str5);
		
//		14.subString()
		String str6 = str.substring(6);//it will display the substring from the specified position in the main string.
		System.out.println("result of the subString() method:"+str6);
		
//		15.subString()
		str6 = str.substring(6,12);//it will display the substring from the specified position to the specified position.
		System.out.println("result of the subString() method:"+str6);
		
//		16.toUpperCase()
		String str7 = str.toUpperCase(); //it converts string to upperCase.
		System.out.println("result of the toUpperCase() method:"+str7);
		
//		17.toLowerCase
		String str8 = str.toLowerCase(); //it converts string to lowerCase.
		System.out.println("result of the toLowerCase() method:"+str8);
		
	}
}
