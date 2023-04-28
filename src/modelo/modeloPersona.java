/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author umg
 */
public class modeloPersona {
    private String Apellidos;
    private String Nombres;
    private int Telefono;

    public modeloPersona(){
        
    }
    
    public modeloPersona(String Apellidos, String Nombres, int Telefono) {
        this.Apellidos = Apellidos;
        this.Nombres = Nombres;
        this.Telefono = Telefono;
    }

    public int getTelefono() {
        return Telefono;
    }

    public void setTelefono(int Telefono) {
        this.Telefono = Telefono;
    }

    public String getApellidos() {
        return Apellidos;
    }

    public void setApellidos(String Apellidos) {
        this.Apellidos = Apellidos;
    }

    public String getNombres() {
        return Nombres;
    }

    public void setNombres(String Nombres) {
        this.Nombres = Nombres;
    }
    
       
}
