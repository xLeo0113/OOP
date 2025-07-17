package com.generation.exercises;

import java.util.Scanner;

public class Lesson06CastelloDiRiedoalternativa {

	public static void main(String[] args) {
		
		//  VISITA AL CASTELLO DI RIEDO
		// i residenti a Riedo pagano ridotto: 0 euro
		// i residenti in provincia di Como pagano ridotto: 5 euro
		// il prezzo pieno del biglietto è 10
		// sconto per insegnanti e studenti: 2 euro
		// sconto per donatori del sangue: 1 euro
		// gli sconti sono cumulabili tra di loro ma non applicabili ai biglietti ridotti
		
		Scanner tastiera =new Scanner(System.in);
		int prezzoBiglietto = 10, sconto = 0;
		String professione;
		String cittaResidenza;
		String provinciaResidenza;
		boolean isDonatore = false;
		String message = "Il prezzo del biglietto è: ";
		
		System.out.println("Benvenuti al castello di Riedo!\nInserisci il tuo comune di residenza: ");
		cittaResidenza = tastiera.nextLine();
		if(cittaResidenza.equalsIgnoreCase("RiEDo")) {
			prezzoBiglietto = 0;
		}else {
			System.out.println("Inserisci la tua provincia di residenza: ");
			provinciaResidenza = tastiera.nextLine();
			if(provinciaResidenza.equalsIgnoreCase("como") || provinciaResidenza.equalsIgnoreCase("CO")) {
				prezzoBiglietto = 5;
			} else {
				// chiedo la professione
				System.out.println("Inserisci la tua professione: ");
				professione = tastiera.nextLine();
				// chiedo se è un donatore
				System.out.println("Sei un donatore di sangue? ");
				if(tastiera.nextLine().equalsIgnoreCase("yes")) {
					isDonatore = true;
					// sconto += 1;   ->  così potrei evitare di usare la variabile booleana isDonatore
				}
				if(professione.equalsIgnoreCase("insegnante") || professione.equalsIgnoreCase("studente")) {
					sconto += 2;
				}
				if(isDonatore) {
					sconto += 1;
				}
			}
		}

		message += prezzoBiglietto - sconto;    // stessa cosa di message = message + prezzoBiglietto;
		System.out.println(message);
		tastiera.close();

	}

}
