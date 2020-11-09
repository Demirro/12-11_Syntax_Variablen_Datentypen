package de.uk.java;

public class PersonalAusweis {
	// Alles passiert hier in der Main-Methode
	public static void main(String[] args) {
		/*
		 * Hier werden alle Felder des Personalausweises in separaten Variablen gespeichert
		 * String für Zeichenkette
		 * char für einen einzelnen Buchstaben
		 * int für kleine Zahlen
		 * long für große Zahlen
		 * float für durch Komma getrennte Zahlen
		 * boolean für die Gültigkeit, die nur wahr oder falsch sein kann
		 */
		String vorname = "Max";
		String nachname = "Mustermann";
		char geschlecht = 77;
		String geburtstag = "01.01.1997";
		int alter = 50;
		float groesse = 1.76f;
		String nationalitaet = "DE";
		long ausweisID = 2147483700L;
		boolean gueltig = true;

		/*
		 * Jede Variable wird in einer neuen Zeile ausgegeben.
		 * Beachte: Ich füge einen String bei jeder Ausgabe hinzu (bspw "Vorname: "), um die Ausgabe übersichtlicher zu gestalten
		 * Mit dem + kann die entsprechende Variable der Ausgabe hinzugefügt werden.
		 */
		
		//					String		Variable
		//						|			|
		System.out.println("Vorname: " + vorname);
		System.out.println("Nachname: " + nachname);
		System.out.println("Geschlecht: " + geschlecht);
		System.out.println("Geburtstag: " + geburtstag);
		System.out.println("Alter: " + alter);
		System.out.println("Größe: " + groesse);
		System.out.println("Nationalität: " + nationalitaet);
		System.out.println("Gültig: " + gueltig);
		System.out.println("Ausweis-ID: " + ausweisID);
	}

}
