
package br.com.codeflow.scooby.main;

import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author Codeflow
 */
public class Main {

    public static void main(String[] args) {
        Main.setTheme();
        
        ScoobyForm scooby = new ScoobyForm();
        scooby.setVisible(true);
    }
    
    private static void setTheme() {
        try {
            UIManager.setLookAndFeel("de.muntjak.tinylookandfeel.TinyLookAndFeel");
        } catch(ClassNotFoundException | 
                IllegalAccessException | 
                InstantiationException | 
                UnsupportedLookAndFeelException error) {
            Logger.getLogger(ScoobyForm.class.getName()).log(Level.SEVERE, null, error);
        }
    }
}
