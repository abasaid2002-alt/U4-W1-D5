package main;

import elementi.Audio;

public class MainAudio {
    public static void main(String[] args) {

        // creo un audio di prova
        Audio audio = new Audio("Canzone", 3, 2);

        // controllo se il costruttore salva bene i dati
        System.out.println("TEST COSTRUTTORE");
        System.out.println("Titolo: " + audio.getTitolo());
        System.out.println("Durata: " + audio.getDurata());
        System.out.println("Volume: " + audio.getVolume());

        // controllo la stampa iniziale
        System.out.println();
        System.out.println("TEST PLAY");
        audio.play();

        // aumento il volume e controllo se cambia
        System.out.println();
        System.out.println("TEST ALZA VOLUME");
        audio.alzaVolume();
        System.out.println("Volume: " + audio.getVolume());
        audio.play();

        // diminuisco il volume e controllo se torna giusto
        System.out.println();
        System.out.println("TEST ABBASSA VOLUME");
        audio.abbassaVolume();
        System.out.println("Volume: " + audio.getVolume());
        audio.play();

        // provo esegui
        System.out.println();
        System.out.println("TEST ESEGUI");
        audio.esegui();
    }
}