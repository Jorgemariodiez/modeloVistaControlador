
package mvc.controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import mvc.modelos.Modelo;
import mvc.vistas.Vista;


public class Controlador implements ActionListener{
    private Vista vista= new Vista();
    private Modelo modelo= new Modelo();

    public Controlador() {
        
    }
    
    public Controlador(Modelo modelo, Vista vista) {
        this.modelo = modelo;
        this.vista = vista;
        vista.boton.addActionListener(this);
               
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        
       
       Integer.parseInt( vista.cajauno.getText());
       modelo.setNumero1(Integer.parseInt( vista.cajauno.getText()));
       Integer.parseInt( vista.cajados.getText());
       modelo.setNumero2(Integer.parseInt( vista.cajados.getText()));
      
       vista.cajaresultado.setText(String.valueOf(modelo.sumar()));
    }
    
    
}
