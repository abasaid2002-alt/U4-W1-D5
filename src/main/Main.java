package main;

import elementi.Immagine;

public class Main {
    public static void main(String[] args) {

        // creo un'immagine di prova
        Immagine img = new Immagine("Foto", 3);

        // controllo se il costruttore salva bene i dati
        System.out.println("TEST COSTRUTTORE");
        System.out.println("Titolo: " + img.getTitolo());
        System.out.println("Luminosita: " + img.getLuminosità());

        // controllo la stampa iniziale
        System.out.println();
        System.out.println("TEST SHOW");
        img.show();

        // aumento la luminosita e controllo se cambia
        System.out.println();
        System.out.println("TEST AUMENTA LUMINOSITA");
        img.aumegetLuminosità();
        System.out.println("Luminosita: " + img.getLuminosità());
        img.show();

        // diminuisco la luminosita e controllo se torna giusta
        System.out.println();
        System.out.println("TEST DIMINUISCI LUMINOSITA");
        img.diminuigetLuminosità();
        System.out.println("Luminosita: " + img.getLuminosità());
        img.show();

        // provo esegui
        System.out.println();
        System.out.println("TEST ESEGUI");
        img.esegui();
    }
}