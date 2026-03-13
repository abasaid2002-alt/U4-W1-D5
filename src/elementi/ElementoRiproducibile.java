package elementi;

import interfaces.Riproducibile;

public abstract class ElementoRiproducibile extends ElementoMultimediale implements Riproducibile {

    // audio e video avranno in comune la durata
    private int durata;

    public ElementoRiproducibile(String titolo, int durata) {
        super(titolo);

        // tengo la durata positiva
        if (durata > 0) {
            this.durata = durata;
        } else {
            this.durata = 1;
        }
    }

    public int getDurata() {
        // serve per leggere la durata
        return durata;
    }

    @Override
    public void esegui() {
        play();
    }
}