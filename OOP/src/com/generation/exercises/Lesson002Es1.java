package com.generation.exercises;

import com.generation.library.Console;

public class Lesson002Es1 
{

	public static void main(String[] args) {
		
		
		int base, height; 
		int area, perimeter; 
		
		
		Console.print("Inserire la base");
		base = Console.readInt();
		
		Console.print("Inserisci l'altezza:");
		height = Console.readInt();
		
	
		area = base * height;
		perimeter = 2 * (base + height);
		
		
		Console.print("L'area del rettangolo è:"+area+",\nIl perimetro del rettangolo è "+perimeter);
		
	}
}
