package Proyecto_Final;

/**
 * 
 * @author Josue :3
 */

import java.util.ArrayList;

public class Envio extends Fisico {

    private int  Cantidad;
        private int NoPedido;

public Envio (int Cantidad, int NoPedido,String Calle, int CP, String Colonia, String Ciudad, String Estado, String Referencia){

       this.NoPedido= NoPedido;
      this.Cantidad=Cantidad;
}

public Envio(){
    this.NoPedido= getNoPedido();
      this.Cantidad=0;
}

 //metodos de la clase
    public int getCantidad() {return Cantidad;
            }

    public void setCantidad(int Cantidad) { this.Cantidad = Cantidad;
           }

    public int getNoPedido() { return NoPedido;
           }

    public void setNoPedido(int NoPedido) {   this.NoPedido = NoPedido;
         }

}

