package com.generation.lessons;

import com.generation.library.Console;

public class Lesson003 
{

	public static void main(String[] args) {
		
		// dichiarazioni variabili
		int side; // variabile di input
		int area, perimeter; // varibili di output
		
		// I: Input
		Console.print("Inserire lato quadrato");
		side = Console.readInt();
		
		// C: Calcolo
		area = side * side;
		perimeter = side * 4;
		
		// O: Output
		Console.print("Area: "+area+", perimeter "+perimeter);
		// espressione di tipo stringa
	}
}
