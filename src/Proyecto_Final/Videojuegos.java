
package Proyecto_Final;

import java.util.Date;

/**
 *
 * @author YaSabesQuienSoy =D
 */
public class Videojuegos extends Digital {
    private int codigoV;
    private String nombre;
    private Date fechaIngreso;
    private String edicion;
    private String sinopsis;
    private Inventario inventario;
    private float precio;
    private String plat;
    private String tipo;

         
        public Videojuegos(){
        this.nombre = "........";
        this.codigoV = 0;
        this.fechaIngreso = getFechaIngreso();
        this.edicion = "....";
        this.sinopsis = " ";
        this.inventario = getInventario();
        this.precio = 0.0f;
        this.plat = plat;
        this.tipo=tipo;
    }
    
    public Videojuegos(int codigoV,String nombre, Date fechaIngreso, String edicion, float descuento, String sinopsis, Inventario inventario, float precio, String plat) {
        this.nombre = nombre;
        this.codigoV = codigoV;
        this.fechaIngreso = fechaIngreso;
        this.edicion = edicion;
        this.sinopsis = sinopsis;
        this.inventario = inventario;
        this.precio = precio;
        this.plat = plat;
          this.tipo=tipo;
    }
   public Videojuegos(Videojuegos v) {
        this.nombre = v.nombre;
        this.codigoV = v.codigoV;
        this.fechaIngreso = v.fechaIngreso;
        this.edicion = v.edicion;
        this.sinopsis = v.sinopsis;
        this.inventario = v.inventario;
        this.precio = v.precio;
        this.plat = v.plat;
          this.tipo=v.tipo;
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

    public String getEdicion() {
        return edicion;
    }

    public void setEdicion(String edicion) {
        this.edicion = edicion;
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
     public int getCodigoV() {
        return codigoV;
    }

    public void setCodigoV(int codigoV) {
        this.codigoV = codigoV;
    }
      public String getPlat() {
        return plat;
    }

    public void setPlat(String plat) {
        this.plat = plat;
    }
    
    public String gettipo(){
        return tipo;
   }
    
    public void settipo(String tipo){
         this.tipo=tipo;
    }

    @Override
    public String toString() {
        return " " + getCodigoV() + "\t" + getPlat()+ "\t\t" + getNombre() + "\t" + getPrecio() + "\t" + getEdicion()+ "\t" + getSinopsis() + "\t\t\t" + getFechaIngreso()
            + "\t" + gettipo()    + "\t" + getkeyProducto();
    }  
}

