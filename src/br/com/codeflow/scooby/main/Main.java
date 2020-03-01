
package br.com.codeflow.scooby.main;

import br.com.codeflow.scooby.business.entity.Address;
import br.com.codeflow.scooby.business.entity.Contact;
import br.com.codeflow.scooby.business.entity.Customer;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

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
