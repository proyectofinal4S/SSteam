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

public class Digital  {

    private int numPedido;
   private int keyProducto;
    private int Existencias;

   public Digital(int numPedido, int keyProducto, int existencias, String nombre, Date fechaIngreso, int edicion, float descuento, String Sinopsis, Inventario inventario, float precio) {
       //super(nombre, fechaIngreso, edicion, descuento, Sinopsis, inventario, precio);
        this.numPedido = numPedido;
       this.keyProducto = keyProducto;
        this.Existencias = Existencias;
    }

    Digital() {
      this.Existencias= getExistencias();
      this.keyProducto= getkeyProducto();
      this.numPedido=getNumPedido();
    }

    public int getNumPedido() {
        return numPedido;
    }

   public void setNumPedido(int numPedido) {
       this.numPedido = numPedido;
   }

    public int getkeyProducto() {
        return keyProducto;
   }

   public void setkeyProducto(int keyProducto) {
        this.keyProducto = keyProducto;
   }

    public int getExistencias() {
        return Existencias;
    }

   public void setExistencias(int Existencias) {
        this.Existencias = Existencias;
    }

    public String toString() {
       return "Digital{" + "numPedido=" + numPedido + ", idProducto=" + keyProducto + ", Existencias=" + Existencias + '}';
    }
}
