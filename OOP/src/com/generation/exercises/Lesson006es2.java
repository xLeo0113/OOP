package com.generation.exercises;

import com.generation.library.Console;

public class Lesson006es2 {

	public static void main(String[] args) {
		double statura, peso;
		String genere;
		int bmi;
		String message;

		Console.print("Inserisci statura:");
		statura = Console.readDouble();

		Console.print("\nInserisci peso:");
		peso = Console.readDouble();

		Console.print("\nInserisci il tuo genere:");
		genere = Console.readString();

		if (statura <= 0 || peso <= 0) {
			message = "Errore: inserisci dei valori positivi nell'altezza e nel peso!";
			Console.print(message);
			return;
		}

		bmi = (int) Math.round(peso / (statura * statura));

		if (genere.equalsIgnoreCase("m") || genere.equalsIgnoreCase("maschio")) {
			if (bmi < 22) {
				message = "Il BMI è basso";
			} else if (bmi > 28) {
				message = "Il BMI è alto";
			} else {
				message = "Il BMI è normale";
			}
		} else if (genere.equalsIgnoreCase("f") || genere.equalsIgnoreCase("femmina")) {
			message = bmi < 22
					? "Il BMI è basso"
					: (bmi > 28 ? "Il BMI è alto" : "Il BMI è nella norma");
		} else {
			Console.print("Genere non riconosciuto. Inserisci manualmente il tuo BMI:");
			bmi = Console.readInt();
			message = "Il tuo BMI va benissimo!";
		}

		Console.print("\n" + message);
	}
}			
				
		

	


