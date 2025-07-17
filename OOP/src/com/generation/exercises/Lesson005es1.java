package com.generation.exercises;

import com.generation.library.Console;

public class Lesson005es1 {

	public static void main(String[] args) {
	int age;
	String message;
	
	Console.print("Inserire anni:");
	age = Console.readInt();
	
	if(age<18)
	{
		message = "Ingresso vietato";
	}
	else
	{
		message = "Ingresso consentito";
	}
	Console.print(message);
}

}