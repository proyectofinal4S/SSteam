package Proyecto_Final;

/**
 * 
 * @author Josue :3
 */

import java.util.Date;

public class VPlayStation {
    private String nombre;
    private Date fechaIngreso;
    private int edicion;
    private float descuento;
    private String sinopsis;
    private Inventario inventario;
    private float precio;

    public VPlayStation(String nombre, Date fechaIngreso, int edicion, float descuento, String sinopsis, Inventario inventario, float precio) {
        this.nombre = nombre;
        this.fechaIngreso = fechaIngreso;
        this.edicion = edicion;
        this.descuento = descuento;
        this.sinopsis = sinopsis;
        this.inventario = inventario;
        this.precio = precio;
    }


}
