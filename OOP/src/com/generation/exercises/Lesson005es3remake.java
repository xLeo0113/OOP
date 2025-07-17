package com.generation.exercises;

import com.generation.library.Console;

public class Lesson005es3remake {

	public static void main(String[] args) {
		int age;
		int revenue;
		String message;
		
		
		Console.print("Inserire anni:");
		age = Console.readInt();
		
		Console.print("Inserire reddito");
		revenue = Console.readInt();
		

		
		 message = age < 13 && revenue < 20000                  ?
				   "Abbonamento richiesto 15 euro al mese"      :
		           "abbonamento richiesto 50 euro al mese"      ;
		           
				 
		Console.print(message);
	}

}