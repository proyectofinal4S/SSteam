package Proyecto_Final;

/**
 * 
 * @author Josue :3
 */

import java.util.ArrayList;
import java.util.Date;

public class Venta {

    private int NoPedido;
    private Direccion direccion;
    private int Cantidad;

    public Venta(int NoPedido, String Direccion, int Cantidad) {
        this.NoPedido = NoPedido;
        this.direccion = direccion;
        this.Cantidad = Cantidad;

    }

    public int getNoPedido() {
        return NoPedido;
    }

    public void setNoPedido(int NoPedido) {
        this.NoPedido = NoPedido;
    }

    public Direccion getdireccion() {
        return direccion;
    }

    public void setdireccion(String Direccion) {
        this.direccion = direccion;
    }

    public int getCantidad() {
        return Cantidad;
    }

    public void setCantidad(int Cantidad) {
        this.Cantidad = Cantidad;
    }

}
