package elementi;

public class Video extends ElementoRiproducibile {

    // il video ha volume e luminosità
    private int volume;
    private int luminosità;

    public Video(String titolo, int durata, int volume, int luminosità) {
        super(titolo, durata);

        // tengo il volume positivo
        if (volume > 0) {
            this.volume = volume;
        } else {
            this.volume = 1;
        }

        // tengo la luminosità positiva
        if (luminosità > 0) {
            this.luminosità = luminosità;
        } else {
            this.luminosità = 1;
        }
    }

    public int getVolume() {
        // leggo il volume
        return volume;
    }

    public int getluminosità() {
        // leggo la luminosità
        return luminosità;
    }

    public void alzaVolume() {
        // aumento di uno
        volume++;
    }

    public void abbassaVolume() {
        // non scendo sotto 1
        if (volume > 1) {
            volume--;
        }
    }

    public void aumentaluminosità() {
        // aumento di uno
        luminosità++;
    }

    public void diminuisciluminosità() {
        // non scendo sotto 1
        if (luminosità > 1) {
            luminosità--;
        }
    }

    @Override
    public void play() {
        // preparo i punti esclamativi in base al volume
        String puntiEsclamativi = "";

        for (int i = 0; i < volume; i++) {
            puntiEsclamativi += "!";
        }

        // preparo gli asterischi in base alla luminosità
        String asterischi = "";

        for (int i = 0; i < luminosità; i++) {
            asterischi += "*";
        }

        // stampo il titolo per tutta la durata
        for (int i = 0; i < getDurata(); i++) {
            System.out.println(getTitolo() + puntiEsclamativi + asterischi);
        }
    }
}