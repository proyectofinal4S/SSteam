package Proyecto_Final;

/**
 * 
 * @author Josue :3
 */

public class Complemento {
    private int codigo;
    private String Nombre;
    private String marca;
    private String Descripcion;
    private float Precio;

//constructor
    public Complemento(){
        
    }
    public Complemento(int codigo,String Nombre, String marca,String Descripcion, float Precio) {
        this.codigo = codigo;
        this.Nombre = Nombre;
        this.marca = marca;
        this.Descripcion = Descripcion;
        this.Precio = Precio;
    }

    //metodos de la clase
    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        this.Nombre = nombre;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
        public float getPrecio() {
        return Precio;
    }

    public void setPrecio(float Precio) {
        this.Precio = Precio;
    }

    @Override
    public String toString() {
        return codigo+ "\t"+ Precio+"\t"+ Nombre+"\t" + marca+ "\t\t" + Descripcion ;
    
    }
}
