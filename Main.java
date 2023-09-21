import java.util.Scanner;
public class Main {
    private static Scanner consola = new Scanner (System.in);
    private static Vendedor objVendedor;
    private static final int N = 3;
    private static Vendedor [] listaVendedores = new Vendedor[N];
    private static int posicion = 0;

    private static void crearVendedores(){
        for(int i=0; i<listaVendedores.length; i++){
            String nombre;
            double sueldoBase, montoVentas;
            System.out.println("Ingrese el Nombre: ");
            nombre = consola.next();
            System.out.println("Ingrese el Sueldo: ");
            sueldoBase = consola.nextDouble();
            System.out.println("Ingrese el Monto de Ventas: ");
            montoVentas = consola.nextDouble();
            //CREAMOS INSTANCIA Y LE PASAMOS LOS DATOS
            objVendedor = new Vendedor(nombre, sueldoBase, montoVentas);
            objVendedor.calcularSueldoFinal();
            //AGREGAMOS OBJETO AL ARREGLO DE OBJETOS
            listaVendedores[i] = objVendedor;
        }
    }

    private static void imprimirVendedores(){
        for(int con = 0; con < listaVendedores.length; con++){
            Vendedor objVendedor1 = listaVendedores[con];
            System.out.println(objVendedor1.ToString());
        }
    }
    public static void main(String[] args){
        crearVendedores();
        imprimirVendedores();
    }
}
