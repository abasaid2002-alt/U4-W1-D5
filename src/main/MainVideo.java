package main;

import elementi.Video;

public class MainVideo {
    public static void main(String[] args) {

        // creo un video di prova
        Video video = new Video("Clip", 2, 2, 3);

        // controllo se il costruttore salva bene i dati
        System.out.println("TEST COSTRUTTORE");
        System.out.println("Titolo: " + video.getTitolo());
        System.out.println("Durata: " + video.getDurata());
        System.out.println("Volume: " + video.getVolume());
        System.out.println("luminosità: " + video.getluminosità());

        // controllo la stampa iniziale
        System.out.println();
        System.out.println("TEST PLAY");
        video.play();

        // aumento il volume e controllo se cambia
        System.out.println();
        System.out.println("TEST ALZA VOLUME");
        video.alzaVolume();
        System.out.println("Volume: " + video.getVolume());
        video.play();

        // diminuisco il volume e controllo se torna giusto
        System.out.println();
        System.out.println("TEST ABBASSA VOLUME");
        video.abbassaVolume();
        System.out.println("Volume: " + video.getVolume());
        video.play();

        // aumento la luminosità e controllo se cambia
        System.out.println();
        System.out.println("TEST AUMENTA LUMINOSITA");
        video.aumentaluminosità();
        System.out.println("luminosità: " + video.getluminosità());
        video.play();

        // diminuisco la luminosità e controllo se torna giusta
        System.out.println();
        System.out.println("TEST DIMINUISCI LUMINOSITA");
        video.diminuisciluminosità();
        System.out.println("luminosità: " + video.getluminosità());
        video.play();

        // provo esegui
        System.out.println();
        System.out.println("TEST ESEGUI");
        video.esegui();
    }
}