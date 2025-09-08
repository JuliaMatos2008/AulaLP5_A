
import javax.swing.JComponent;
import javax.swing.JTextField;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author u08317670147
 */
public class Util {
    public static void habilitar(boolean valor,JComponent ... componentes){
        for (int i = 0; i < componentes.length; i++) {
         componentes[i].setEnabled(valor);
            
        }
    }
}
