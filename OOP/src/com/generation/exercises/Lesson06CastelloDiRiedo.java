package com.generation.exercises;

import java.util.Scanner;

public class Lesson06CastelloDiRiedo {

			public static void main(String[] args) {
		        Scanner input = new Scanner(System.in);
		        
		        String city, province, profession, donor;
		        int price;
		        String message = "";

		        // Input città
		        System.out.print("Inserisci città: ");
		        city = input.nextLine();

		        if (city.equalsIgnoreCase("Riedo")) {
		            message = "Free ticket";
		        } else {
		            // Input provincia
		            System.out.print("Inserisci provincia: ");
		            province = input.nextLine();

		            if (province.equalsIgnoreCase("CO")||province.equalsIgnoreCase("Como")) {
		                price = 5;
		                message = "Province Discount Ticket \nPrezzo: " + price + " euro";
		            } else {
		                price = 10;

		                // Input professione
		                System.out.print("Inserire professione: ");
		                profession = input.nextLine();
		                if (profession.equalsIgnoreCase("teacher") || profession.equalsIgnoreCase("student")) {
		                    price--;
		                    message += "Profession Discount - 1 euro\n";
		                }

		                // Input donatore
		                System.out.print("Sei donatore? (S/N): ");
		                donor = input.nextLine();
		                if (donor.equalsIgnoreCase("S")) {
		                    price--;
		                    message += "Donor Discount - 1 euro\n";
		                }

		                message += "Prezzo finale: " + price + " euro";
		            }
		        }

		        // Output finale
		        System.out.println("\n--- BIGLIETTO ---");
		        System.out.println(message);

		        input.close(); // buona pratica: chiudere lo scanner
		    }
		}