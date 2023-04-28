/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import modelo.*;
import vista.*;
/**
 *
 * @author umg
 */
public class personasController implements ActionListener{
    modeloListarAgregar ControlLista;
    modeloPersona ModelPersonas;
    frmPersonas VistaPersonas;
    frmPrincipal VistaPrincipal;
    DefaultTableModel modeloTabla= new DefaultTableModel();
    String[] ColumnNames = {"Apellidos","Nombres","Telefono"};

    public personasController(modeloListarAgregar ControlLista, modeloPersona ModelPersonas, frmPersonas VistaPersonas, frmPrincipal VistaPrincipal) {
        this.ControlLista = ControlLista;
        this.ModelPersonas = ModelPersonas;
        this.VistaPersonas = VistaPersonas;
        this.VistaPrincipal = VistaPrincipal;
        
        this.modeloTabla.setColumnIdentifiers(ColumnNames);
       
        
        this.VistaPrincipal.btnIngresarPersonas.addActionListener(this);
        
        this.VistaPrincipal.setVisible(true);
        this.VistaPrincipal.setLocationRelativeTo(null);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==this.VistaPrincipal.btnIngresarPersonas){
            this.VistaPersonas.btnIngresar.addActionListener(this);
            this.VistaPersonas.btnListar.addActionListener(this);
            this.VistaPersonas.setVisible(true);
            this.VistaPersonas.setLocationRelativeTo(null);            
        }
        
        if(e.getSource()==this.VistaPersonas.btnIngresar){
            this.ControlLista.AgregarUsuario(this.VistaPersonas.txtApellidos.getText(), 
                    this.VistaPersonas.txtNombres.getText(), Integer.parseInt(this.VistaPersonas.txtTelefono.getText()));
            this.VistaPersonas.txtApellidos.setText("");
            this.VistaPersonas.txtNombres.setText("");
            this.VistaPersonas.txtTelefono.setText("");
        }
        
        if(e.getSource() == this.VistaPersonas.btnListar){
            
            Object[] fila = new Object[this.modeloTabla.getColumnCount()];
            ArrayList <modeloPersona> listaLocal = new ArrayList();
            
            for(int i = 0; i<listaLocal.size();i++){
                fila[0] = listaLocal.get(i).getApellidos();
                fila[1] = listaLocal.get(i).getNombres();
                fila[2] = listaLocal.get(i).getTelefono();
                this.modeloTabla.addRow(fila);
            }
            this.VistaPersonas.JtPersonas.setModel(modeloTabla);   
        }
    }
}