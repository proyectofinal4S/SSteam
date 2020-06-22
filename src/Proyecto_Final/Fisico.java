/*

 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proyecto_Final;

import java.util.Date;

/**
 *
 * @author YaSabesQuienSoy =D
 */
public class Fisico extends Videojuegos{
    private int NumPedido;
    private int existencias;
    private Envio envio;
    
    public Fisico(int NumPedido, int existencias,Envio envio,String nombre, Date fechaIngreso, int edicion, float descuento, String Sinopsis, Inventario inventario, float precio){
        this.NumPedido=NumPedido;
        this.existencias=existencias;
        this.envio=envio;
    }
    
    
    public Fisico(){
this.NumPedido= getNumPedido();
 this.existencias=0;
 this.envio=envio;
    }
    
       
    public int getNumPedido() { return NumPedido;
    }

    public void setNumPedido(int NumPedido) { this.NumPedido = NumPedido;
   }

    public int getexistencias() { return existencias;
    }

    public void setexistencias(int existencias) { this.existencias = existencias;
    }
}
