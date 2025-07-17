package com.generation.exercises;

import com.generation.library.Console;

public class Lesson005es2remake {

	public static void main(String[] args) {
		int age;
		int height;
		String message;
		
		
		Console.print("Inserire anni:");
		age = Console.readInt();
		
		Console.print("Inserire altezza");
		height = Console.readInt();
		
		message = age >= 13 && height >= 120               ?
				        "Ingresso consentito"            :
				        "Ingresso vietato"               ;
		Console.print(message);
	}
	

}
