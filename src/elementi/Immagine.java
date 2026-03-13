package elementi;

public class Immagine extends ElementoMultimediale {

    // l'immagine ha una luminosità
    private int luminosità;

    public Immagine(String titolo, int luminosità) {
        super(titolo);

        // tengo la luminosità positiva
        if (luminosità > 0) {
            this.luminosità = luminosità;
        } else {
            this.luminosità = 1;
        }
    }

    public int getLuminosità() {
        // leggo la luminosità
        return luminosità;
    }

    public void aumegetLuminosità() {
        // aumento di uno
        luminosità++;
    }

    public void diminuigetLuminosità() {
        // non scendo sotto 1
        if (luminosità > 1) {
            luminosità--;
        }
    }

    public void show() {
        // preparo gli asterischi in base alla luminosità
        String asterischi = "";

        for (int i = 0; i < luminosità; i++) {
            asterischi += "*";
        }

        System.out.println(getTitolo() + asterischi);
    }

    @Override
    public void esegui() {
        show();
    }
}