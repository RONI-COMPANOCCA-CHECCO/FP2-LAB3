import java.util.*;

public class DemoBatalla {
    public static void main(String[] args) {
        Nave[] misNaves = new Nave[10];
        Scanner sc = new Scanner(System.in);
        String nomb, col;
        int fil, punt;
        boolean est;
        
        for (int i = 0; i < misNaves.length; i++) {
            System.out.println("Nave " + (i + 1));
            System.out.print("Nombre: ");
            nomb = sc.next();
            System.out.print("Fila: ");
            fil = sc.nextInt();
            System.out.print("Columna: ");
            col = sc.next();
            System.out.print("Estado: ");
            est = sc.nextBoolean();
            System.out.print("Puntos: ");
            punt = sc.nextInt();
            
            misNaves[i] = new Nave();
            //Se crea un objeto Nave y se asigna su referencia a misNaves
            misNaves[i].setNombre(nomb);
            misNaves[i].setFila(fil);
            misNaves[i].setColumna(col);
            misNaves[i].setEstado(est);
            misNaves[i].setPuntos(punt);
        }
        
        System.out.println("\nNaves creadas:");
        mostrarNaves(misNaves);
        
        System.out.print("\nIngrese un nombre para mostrar todas las naves con ese nombre: ");
        String BuscarPorNombre = sc.next();
        mostrarPorNombre(misNaves, BuscarPorNombre);
        
        System.out.print("\nIngrese el numero de puntos para mostrar naves que tengan puntos iguales o menores: ");
        int BuscarPorPuntos = sc.nextInt();
        mostrarPorPuntos(misNaves, BuscarPorPuntos);
        
        Nave naveMayorPuntos = mostrarMayorPuntos(misNaves);
        System.out.println("\nNave con mayor numero de puntos: " + naveMayorPuntos);
        
        Nave[] navesDesordenadas = NavesDesordenadas(misNaves);
        System.out.println("\nla lista de naves desordenadas es: ");
        mostrarNaves(navesDesordenadas);
    }
    
    // Método para mostrar todas las naves
    public static void mostrarNaves(Nave[] flota) {
        for (Nave nave : flota) {
            System.out.println(nave);
        }
    }
    
    // Método para mostrar todas las naves de un nombre que se pide por teclado
    public static void mostrarPorNombre(Nave[] flota, String BuscarPorNombre) {
        for (Nave nave : flota) {
            if (nave.getNombre().equalsIgnoreCase(BuscarPorNombre)) {
                System.out.println(nave);
            }
        }
    }
    
    // Método para mostrar todas las naves con un número de puntos inferior o igual
    // al número de puntos que se pide por teclado
    public static void mostrarPorPuntos(Nave[] flota, int BuscarPorPuntos) {
        for (Nave nave : flota) {
            if (nave.getPuntos() <= BuscarPorPuntos) {
                System.out.println(nave);
            }
        }
    }
    
    // Método que devuelve la Nave con mayor número de Puntos
    public static Nave mostrarMayorPuntos(Nave[] flota) {
        Nave mayorPuntos = null;
        int maxPuntos = Integer.MIN_VALUE;
        
        for (Nave nave : flota) {
            if (nave.getPuntos() > maxPuntos) {
                maxPuntos = nave.getPuntos();
                mayorPuntos = nave;
            }
        }
        
        return mayorPuntos;
    }
    
    // Crear un método que devuelva un nuevo arreglo de objetos con todos los objetos previamente ingresados
    // pero aleatoriamente desordenados
    public static Nave[] NavesDesordenadas(Nave[] flota) {
        Nave[] navesDesordenadas = Arrays.copyOf(flota, flota.length); // Crear una copia del arreglo original
        Random random = new Random();
    
        // Realizar una permutación aleatoria del arreglo
        for (int i = navesDesordenadas.length - 1; i > 0; i--) {
            int j = random.nextInt(i + 1);
            Nave aux = navesDesordenadas[i];
            navesDesordenadas[i] = navesDesordenadas[j];
            navesDesordenadas[j] = aux;
        }
    
        return navesDesordenadas;
    }
}
