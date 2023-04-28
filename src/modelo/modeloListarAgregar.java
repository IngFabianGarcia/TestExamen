/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.ArrayList;
import javafx.css.Size;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author umg
 */
public class modeloListarAgregar {
    DefaultTableModel modeloTabla= new DefaultTableModel();
    String[] ColumnNames = {"Apellidos","Nombres","Telefono"};

    
    
ArrayList<modeloPersona> PersonaLista = new ArrayList();

public void AgregarUsuario (String apellido, String nom, int num){
    modeloPersona PersonaLista = new modeloPersona(apellido, nom, num);
    this.PersonaLista.add(PersonaLista);
}

public void MostrarPersonas(){
    Object[] fila = new Object[this.modeloTabla.getColumnCount()];
            ArrayList <modeloPersona> personas = new ArrayList();
            
            for(int i = 0; i<personas.size();i++){
                fila[0] = personas.get(i).getApellidos();
                fila[1] = personas.get(i).getNombres();
                fila[2] = personas.get(i).getTelefono();
                this.modeloTabla.addRow(fila);
            }
    
}
    

    
}
