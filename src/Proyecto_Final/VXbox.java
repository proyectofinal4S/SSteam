package Proyecto_Final;

/**
 * 
 * @author Josue :3
 */

import java.util.ArrayList;
import java.util.Date;

public class VXbox {
    private String nombre;
    private Date fechaIngreso;
    private int edicion;
    private float descuento;
    private String sinopsis;
    private Inventario inventario;
    private float precio;

    public VXbox(String nombre, Date fechaIngreso, int edicion, float descuento, String sinopsis, Inventario inventario, float precio) {
        this.nombre = nombre;
        this.fechaIngreso = fechaIngreso;
        this.edicion = edicion;
        this.descuento = descuento;
        this.sinopsis = sinopsis;
        this.inventario = inventario;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(Date fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public int getEdicion() {
        return edicion;
    }

    public void setEdicion(int edicion) {
        this.edicion = edicion;
    }

    public float getDescuento() {
        return descuento;
    }

    public void setDescuento(float descuento) {
        this.descuento = descuento;
    }

    public String getSinopsis() {
        return sinopsis;
    }

    public void setSinopsis(String sinopsis) {
        this.sinopsis = sinopsis;
    }

    public Inventario getInventario() {
        return inventario;
    }

    public void setInventario(Inventario inventario) {
        this.inventario = inventario;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }
    

}
