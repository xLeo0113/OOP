package com.generation.exercises;

import com.generation.library.Console;

public class Lesson005es1remake {

	public class Lesson005es01 {

		public static void main(String[] args) {
		int age;
		String message;
		
		Console.print("Inserire anni:");
		age = Console.readInt();
		
		message = age > 18                                        ?
		      "Benvenuto al nostro sito"                          :
			  "Non possiamo accettare utenti non maggiorenni."    ;
		
		
		
		Console.print(message);
	}

	}
}
