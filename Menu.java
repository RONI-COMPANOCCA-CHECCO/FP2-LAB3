// RONI COMPANOCCA CHECCO
// CUI: 20210558
// LABORATORIO 03
// FUNDAMENTOS DE PROGRAMACION 
import java.util.Scanner;
public class Menu {
    private static Scanner consola = new Scanner (System.in);
    private static Soldado objSoldado;
    private static final int N = 5;
    private static Soldado [] soldadito = new Soldado[N];

    private static void crearSoldados(){
        for(int i=0; i<soldadito.length; i++){
            String nombre;
            int nivelVida;
            System.out.println("Ingrese el Nombre: ");
            nombre = consola.next();
            System.out.println("Ingrese el nivel de Vida: ");
            nivelVida = consola.nextInt();
            //CREAMOS INSTANCIA Y LE PASAMOS LOS DATOS
            objSoldado = new Soldado(nombre, nivelVida);
            //AGREGAMOS OBJETO AL ARREGLO DE OBJETOS
            soldadito[i] = objSoldado;
        }
    }

    private static void imprimirSoldados(){
        for(int con = 0; con < soldadito.length; con++){
            Soldado objSoldado1 = soldadito[con];
            System.out.println(objSoldado1.ToString());
        }
    }
    public static void main(String[] args){
        crearSoldados();
        imprimirSoldados();
    }
}