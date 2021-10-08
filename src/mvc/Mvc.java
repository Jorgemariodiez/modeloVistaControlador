
package mvc;

import mvc.controlador.Controlador;
import mvc.modelos.Modelo;
import mvc.vistas.Vista; 


public class Mvc {

    public static void main(String[] args) {
        Vista vista= new Vista();
        vista.setVisible(true);
        Modelo modelo= new Modelo();
        Controlador controlador = new Controlador(modelo,vista);
    }
    
}