package barajas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Baraja {
    private List<Carta> cartas;

    // Constructor
    public Baraja() {
        cartas = new ArrayList<>();
        String[] palos = {"Oros", "Espadas", "Copas", "Bastos"};

        // Inicializamos las cartas en orden
        for (String palo : palos) {
            for (int i = 1; i <= 7; i++) {
                cartas.add(new Carta(palo, i));
            }
            for (int i = 10; i <= 12; i++) {
                cartas.add(new Carta(palo, i));
            }
        }
    }

    // Método para barajar las cartas
    public void barajar() {
        Collections.shuffle(cartas);
    }

    // Método para extraer la carta superior
    public Carta extraerCarta() {
        if (cartas.isEmpty()) {
            return null; // No hay más cartas
        }
        return cartas.remove(0); // Extrae y devuelve la carta superior
    }

    // Método para mostrar la baraja (opcional)
    public void mostrarBaraja() {
        for (Carta carta : cartas) {
            System.out.println(carta);
        }
    }
}
