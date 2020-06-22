package Proyecto_Final;

/**
 * 
 * @author Josue :3
 */

import java.util.ArrayList;
import java.util.Date;


public class Direccion extends Envio {

    private String Calle;
    private int CP;
    private String Colonia;
    private String Ciudad;
    private String Estado;
    private String Referencia;
    
          
    public Direccion(String Calle, int CP, String Colonia, String Ciudad, String Estado, String Referencia) {
        
        this.Calle = Calle;
        this.CP = CP;
        this.Colonia = Colonia;
         this.Ciudad = Ciudad;
        this.Estado = Estado;
        this.Referencia = Referencia;
        
    }

      public Direccion(){
          
         this.Calle = getCalle();
        this.CP = getCP();
        this.Colonia = getColonia();
         this.Ciudad = getCiudad();
        this.Estado = getEstado();
        this.Referencia = getReferencia();
    }
 //metodos de la clase
    public String getCalle() {return Calle;
            }

    public void setCalle(String Calle) { this.Calle = Calle;
           }

    public String getColonia() { return Colonia;
           }

    public void setColonia(String Colonia) {   this.Colonia = Colonia;
         }

    public int getCP() {  return CP;
          }

    public void setCP(int CP) {this.CP = CP;
            }

    public String getCiudad() {  return Ciudad;
          }

    public void setCiudad(String Ciudad) {this.Ciudad = Ciudad;
            }

     public String getEstado() {  return Estado;
          }

    public void setEstado(String Estado) {this.Estado = Estado;
            }
    
     public String getReferencia() {  return Referencia;
          }

    public void setReferencia(String Referencia) {this.Referencia = Referencia;
            }
    
   }

