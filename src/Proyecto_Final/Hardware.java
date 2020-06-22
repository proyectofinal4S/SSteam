package Proyecto_Final;

/**
 * 
 * @author Josue :3
 */

public class Hardware {

    private String Nombre;
    private String Modelo;
    private String Descripcion;
    private int CodigoProducto;
    private Float Precio;

    public Hardware(){
        
    }
    public Hardware(String Nombre, String Modelo, String Descripcion, int CodigoProducto, Float Precio) {
        this.CodigoProducto = CodigoProducto;
        this.Nombre = Nombre;
        this.Modelo = Modelo;
        this.Descripcion = Descripcion;
        this.Precio = Precio;

    }

    //metodos de la clase
    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getModelo() {
        return Modelo;
    }

    public void setModelo(String Modelo) {
        this.Modelo = Modelo;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    public int getCodigoProducto() {
        return CodigoProducto;
    }

    public void setCodigoProducto(int CodigoProducto) {
        this.CodigoProducto = CodigoProducto;
    }

    public float getPrecio() {
        return Precio;
    }

    public void setPrecio(float Precio) {
        this.Precio = Precio;
    }

    @Override
    public String toString() {
        return CodigoProducto + "\t"+ Nombre + "\t\t" + Modelo + "\t" + Precio + "\t"  +  Descripcion ;
    }
    
}
