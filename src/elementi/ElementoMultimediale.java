package elementi;

public abstract class ElementoMultimediale {

    private final String titolo;

    public ElementoMultimediale(String titolo) {
        // salvo il titolo
        this.titolo = titolo;
    }

    public String getTitolo() {
        // leggo il titolo
        return titolo;
    }

    public abstract void esegui();
}