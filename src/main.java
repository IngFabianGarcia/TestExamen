
import controlador.personasController;
import modelo.modeloListarAgregar;
import modelo.modeloPersona;
import vista.frmPersonas;
import vista.frmPrincipal;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author umg
 */
public class main {
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        modeloListarAgregar ControlLista = new modeloListarAgregar();
        modeloPersona ModelPersonas = new modeloPersona();
        frmPrincipal VistaPrincipal = new frmPrincipal();
        frmPersonas VistaPersonas = new frmPersonas(VistaPrincipal, true);
    
        personasController controler = new personasController(ControlLista, ModelPersonas, VistaPersonas, VistaPrincipal);
    }
    
}
