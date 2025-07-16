package com.generation.lessons;

import com.generation.library.Console;

public class Lesson004 {

	public static void main(String[] args) {
		int revenue;
		int taxes;
		String message;
		
		
		Console.print("Inserire fatturato annuo");
		revenue = Console.readInt();
		
		if(revenue<=20000) 
		{
			message = "Lei è esente dalle tasse quest'anno";
		}
		else
		{
			taxes = (revenue-20000) * 20 / 100;
			message = "Lei deve pagare "+taxes+" euro";
		}
		Console.print(message);
		}
	}


