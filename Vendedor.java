import java.util.*;

public class Vendedor{
    //ATRIBUTOS
    private String nombre;
    private double sueldoBase;
    private double comision;
    private double sueldoFinal;
    private double montoVenta;
    private double porcentajeComision;
    //CONSTRUCTORES
    public Vendedor(){
        this.nombre = "";
        this.sueldoBase = 0.00;
        this.comision = 0.00;
        this.sueldoFinal = 0.00;
    }

    public Vendedor(String nombre, double sueldoBase, double montoVenta){
        this.nombre = nombre;
        this.sueldoBase = sueldoBase;
        this.montoVenta = montoVenta;
    }
    // METODOS PUBLICOS
    private void calcularComision(){
        if(this.montoVenta < 2000){
            this.porcentajeComision = 10;
            this.comision = this.montoVenta * (this.porcentajeComision/100);
        }else{
            if(this.montoVenta >= 2001){
                this.porcentajeComision = 12;
                this.comision = this.montoVenta * (this.porcentajeComision/100);
            }
        }
    }
    public void calcularSueldoFinal(){
        this.calcularComision();
        this.sueldoFinal = this.sueldoBase + comision;
    }
    public String ToString(){
        StringBuilder abMensaje = new StringBuilder();
        abMensaje.append("-------------\nDATOS DEL VENDEDOR\n-----------");
        abMensaje.append("\nNombre: "+nombre);
        abMensaje.append("\nSueldo Base: "+sueldoBase);
        abMensaje.append("\nMonto Venta: "+montoVenta);
        abMensaje.append("\nComision: "+comision);
        abMensaje.append("\nSueldo Final: "+sueldoFinal);

        return abMensaje.toString();
    }
}