package Proyecto_Final;

/**
 * 
 * @author Josue :3
 */

import java.util.ArrayList;
import java.util.Date;

public class Cliente {

    private String Nombre;
    private Date FechaNac;
    private String CorreoElec;
    private int NumTelefono;

    //constructor
    public Cliente(String Nombre, Date FechaNac, String CorreoElec, int NumTelefono) {
        this.Nombre = Nombre;
        this.FechaNac = FechaNac;
        this.CorreoElec = CorreoElec;
        this.NumTelefono = NumTelefono;
    }

    //metodos de la clase
    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        this.Nombre = nombre;
    }

    public Date getFechaNac() {
        return FechaNac;
    }

    public void setFechaNac(Date FechaNac) {
        this.FechaNac = FechaNac;
    }

    public String getCorreoElec() {
        return CorreoElec;
    }

    public void setCorreoElec(String CorreoElec) {
        this.CorreoElec = CorreoElec;
    }

    public int getNumTelefono() {
        return NumTelefono;
    }

    public void setNumTelefono(int NumTelefono) {
        this.NumTelefono = NumTelefono;
    }

}
