package com.generation.lessons;

import com.generation.library.Console;

public class Lesson006 {

	public static void main(String[] args) {
		String city, province, profession, donor;
		int price;
		String message ="";
		
		Console.print("Inserisci città");
		city = Console.readString();
		
		if (city.equals("Riedo"))
		{
			message = "Free ticket"; 
		}
		else
		{
			Console.print("Inserisci Provincia");
			province = Console.readString();
			
			if (province.equals("CO")) {
				price = 5;
				message = "Province Discount Ticket \nPrice "+price+" euro";
				
			}
			else {
				price = 10;
				Console.print("Inserire professione");
				profession = Console.readString();
				if(profession.equals("teacher") || profession.equals("student"))
				{
					price--;
					message+="Profession Discount - 1 euro\n";
				}
				Console.print("si è donatori?");
				donor = Console.readString();	
				if(donor.equals("S"))
				{
					price--;
					message+="Donor discount - 1 euro\n";
				}
				message+="Final price:"+price+"euro";
					}
		}
		Console.print(message);
	}

}
