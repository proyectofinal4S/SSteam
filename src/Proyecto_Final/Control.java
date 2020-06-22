package Proyecto_Final;

/**
 * 
 * @author Josue :3
 */

public class Control {

    private String CodPedido;
    private String Producto;

    public Control(String CodPedido, String Producto) {
        this.CodPedido = CodPedido;
        this.Producto = Producto;
    }

    //metodos de la clase
    public String getCodPedido() {
        return CodPedido;
    }

    public void setCodPedido(String CodPedido) {
        this.CodPedido = CodPedido;
    }

    public String getProducto() {
        return Producto;
    }

    public void setProducto(String Producto) {
        this.Producto = Producto;
    }

}
