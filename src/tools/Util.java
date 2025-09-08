/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tools;

import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JFormattedTextField;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author u86117213573
 */
public class Util {
    
    public static void habilitar(boolean valor, JComponent... componentes) {
        for (int i = 0; i < componentes.length; i++) {
            componentes[i].setEnabled(true);
        }
    }

    public static void desabilitar(JComponent... componentes) {
        for (int i = 0; i < componentes.length; i++) {
            componentes[i].setEnabled(false);
        }
    }

    public static void limpar(JComponent... componentes) {
        for (int i = 0; i < componentes.length; i++) {
            //instaceof
            if (componentes[i] instanceof JTextField) {
           ((JTextField) componentes[i]).setText("");
            }
             if (componentes[i] instanceof JComboBox) {
           ((JComboBox) componentes[i]).setSelectedIndex(-1);
            }
        }
    }
   public static void mensagem(String cad){
       JOptionPane.showMessageDialog(null, cad);
   }
   public static boolean perguntar(String cad){
       JOptionPane.showConfirmDialog(null, cad);
       return true;
   }
}