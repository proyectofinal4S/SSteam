package Proyecto_Final;

/**
 * 
 * @author Josue :3
 */

public class VPC {

    private String CodProducto;
    private Float Precio;
    private int Existencias;
    private int Modelo;
    private int Capacidad;
    private String Caracteristicas;
    private Inventario inventario;

    public VPC(String CodProducto, float Precio, int Existencias, int Modelo, int Capacidad, String Caracteristicas) {

        this.CodProducto = CodProducto;
        this.Precio = Precio;
        this.Existencias = Existencias;
        this.Modelo = Modelo;
        this.Capacidad = Capacidad;
        this.Caracteristicas = Caracteristicas;
          this.inventario = inventario;

    }

    //metodos de la clase
    public String getCodProducto() {
        return CodProducto;
    }

    public void setCodProducto(String CodProducto) {
        this.CodProducto = CodProducto;
    }

    public float getPrecio() {
        return Precio;
    }

    public void setPrecio(float Precio) {
        this.Precio = Precio;
    }

    public int getExistencias() {
        return Existencias;
    }

    public void setExistencias(int Existencias) {
        this.Existencias = Existencias;
    }

    public int getModelo() {
        return Modelo;
    }

    public void setModelo(int Modelo) {
        this.Modelo = Modelo;
    }

    public int getCapacidad() {
        return Capacidad;
    }

    public void setCapacidad(int Capacidad) {
        this.Capacidad = Capacidad;
    }

    public String getCaracteristicas() {
        return Caracteristicas;
    }

    public void setCaracteristicas(String Caracteristicas) {
        this.Caracteristicas = Caracteristicas;
    }

}
