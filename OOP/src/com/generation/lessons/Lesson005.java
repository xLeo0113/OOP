package com.generation.lessons;

import com.generation.library.Console;

public class Lesson005 {

	public static void main(String[] args) {
		
		//D:
		int age; 
		String message;
		
		
		//I:
		Console.print("inserisci anni:");
		age = Console.readInt();
		//C:
		// if(age>17)
		//	message = "Benvenuto";
		//else 
		//	message = "Non possiamo accettare utenti non maggiorenni.";
		
		message = age > 17                                            ?
				  "Benevnuto al nostro sito"                          :
				  "Non possiamo accettare utenti non maggiorenni."    ;
		
		//O: 
		Console.print(message);
		
	}

}
