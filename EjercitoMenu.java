import java.util.Random;

public class EjercitoMenu {
    public static void main(String[] args) {
        Random aleatorio = new Random();

        // Crear dos ejércitos con un número aleatorio de soldados entre 1 y 5
        int Ejercito1 = aleatorio.nextInt(5) + 1;
        int Ejercito2 = aleatorio.nextInt(5) + 1;

        Ejercito ejercito1 = new Ejercito(Ejercito1);
        Ejercito ejercito2 = new Ejercito(Ejercito2);

        // Mostrar los datos de ambos ejércitos
        System.out.println("Ejército 1:");
        mostrarEjercito(ejercito1);

        System.out.println("\nEjército 2:");
        mostrarEjercito(ejercito2);

        // DETERMINAMOS EL EJERCITO GANADOR
        int numeroSoldadosEjercito1 = ejercito1.getNumeroDeSoldados();
        int numeroSoldadosEjercito2 = ejercito2.getNumeroDeSoldados();

        if (numeroSoldadosEjercito1 > numeroSoldadosEjercito2) {
            System.out.println("\nEl Ejército 1 es el ganador.");
        } else if (numeroSoldadosEjercito2 > numeroSoldadosEjercito1) {
            System.out.println("\nEl Ejército 2 es el ganador.");
        } else {
            System.out.println("\nLa batalla no tuvo victorioso a ningun ejercito");
        }
    }

    public static void mostrarEjercito(Ejercito ejercito) {
        Soldados[] soldados = ejercito.getSoldados();
        for (int i = 0; i < soldados.length; i++) {
            System.out.println("Soldado " + i + ": " + soldados[i].getNombre());
        }
    }
}



