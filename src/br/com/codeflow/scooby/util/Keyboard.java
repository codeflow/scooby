
package br.com.codeflow.scooby.util;

/**
 *
 * @author codeflow
 */
public enum Keyboard {
    
    ENTER(10);
    
    private int key;
    
    Keyboard(int key) {
        this.key = key;
    }
    
    public int getKey() {
        return key;
    }
}
