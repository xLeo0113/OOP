package com.generation.lessons;
import com.generation.library.Console;

public class Lesson002 {

	public static void main(String[] args) {
		//  tipo nome
		int a; // due dichiarazione di variabili
		int b;
		
		Console.print("Inserire un numero"); // chiamata a metodo
		a = Console.readInt();               // chiamata a metodo con assegnamento
		Console.print("Hai inserito:");
		Console.print(a); // al posto di a java vede sempre e solo il suo valore
		
		b = a * 2; // prendi il valore di a moltiplicalo per 2 e mettilo in b
		
		Console.print("Il doppio è");
		Console.print(b);
	}

}
