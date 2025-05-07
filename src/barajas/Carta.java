package barajas;

public class Carta {
    private String palo;
    private int numero;

    // Constructor
    public Carta(String palo, int numero) {
        this.palo = palo;
        this.numero = numero;
    }

    // Método toString para representar la carta
    @Override
    public String toString() {
        return numero + " de " + palo;
    }

    // Getters
    public String getPalo() {
        return palo;
    }

    public int getNumero() {
        return numero;
    }
}
