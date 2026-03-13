package elementi;

public class Audio extends ElementoRiproducibile {

    // l'audio ha un volume
    private int volume;

    public Audio(String titolo, int durata, int volume) {
        super(titolo, durata);

        // tengo il volume positivo
        if (volume > 0) {
            this.volume = volume;
        } else {
            this.volume = 1;
        }
    }

    public int getVolume() {
        // leggo il volume
        return volume;
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

    @Override
    public void play() {
        // preparo i punti esclamativi in base al volume
        String puntiEsclamativi = "";

        for (int i = 0; i < volume; i++) {
            puntiEsclamativi += "!";
        }

        // stampo il titolo per tutta la durata
        for (int i = 0; i < getDurata(); i++) {
            System.out.println(getTitolo() + puntiEsclamativi);
        }
    }
}