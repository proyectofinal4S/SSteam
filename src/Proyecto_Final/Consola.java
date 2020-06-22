package Proyecto_Final;

/**
 * 
 * @author Josue :3
 */

import java.util.ArrayList;
import java.util.Date;

public class Consola {
    private int codigo;
    private String Modelo;
    private String Marca;
    private String Edicion;
    private String Capacidad;
    private float precio;

//constructor
    public Consola(){
        
    }
    public Consola(int codigo, String Modelo, String Marca, int Inventario, String Edicion, String Capacidad,float precio) {
        this.codigo = codigo;
        this.Modelo = Modelo;
        this.Marca = Marca;
        this.Edicion = Edicion;
        this.Capacidad = Capacidad;
        this.precio = precio;
    }

    //metodos de la clase
    public String getModelo() {
        return Modelo;
    }

    public void setModelo(String Modelo) {
        this.Modelo = Modelo;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    public String getEdicion() {
        return Edicion;
    }

    public void setNumEdicion(String Edicion) {
        this.Edicion = Edicion;
    }

    public String getCapacidad() {
        return Capacidad;
    }

    public void setCapacidad(String Capacidad) {
        this.Capacidad = Capacidad;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
   public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }
    @Override
    public String toString() {
        return codigo +"\t"+precio+"\t"+  Modelo+"\t" + Marca+"\t" + Edicion+"\t"+ Capacidad ;
    }
    

}
