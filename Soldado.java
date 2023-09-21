import java.util.*;

public class Soldado{
    //ATRIBUTOS
    private String nombre;
    private int nivelVida;
    //CONSTRUCTORES
    public Soldado(){
        this.nombre = "";
        this.nivelVida = 0;
    }

    public Soldado(String nombre, int nivelVida){
        this.nombre = nombre;
        this.nivelVida = nivelVida;
    }

    public String ToString(){
        StringBuilder abMensaje = new StringBuilder();
        abMensaje.append("-------------\nDATOS DEL SOLDADO\n-----------");
        abMensaje.append("\nNombre: "+nombre);
        abMensaje.append("\nNivel de vida: "+nivelVida);

        return abMensaje.toString();
    }
}