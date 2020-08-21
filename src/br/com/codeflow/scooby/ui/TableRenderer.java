
package br.com.codeflow.scooby.ui;

import java.awt.Color;
import java.awt.Component;

import javax.swing.JLabel;
import javax.swing.JTable;

import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.TableCellRenderer;

/**
 *
 * @author codeflow
 */
public class TableRenderer implements TableCellRenderer {
    public static final DefaultTableCellRenderer DEFAULT_RENDERER = new DefaultTableCellRenderer();
    
    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        Component renderer = DEFAULT_RENDERER.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
        ((JLabel) renderer).setOpaque(true);
      
        if(isSelected) {
            Color foreground, background;
            
            foreground = Color.WHITE;
            background = Color.LIGHT_GRAY;
            
            renderer.setForeground(foreground);
            renderer.setBackground(background);
            
            ((JLabel) renderer).setText(value.toString());
        } else {
            if (row % 2 == 0) {
                Color foreground, background;
                
                foreground = Color.BLACK;
                background = Color.WHITE;
                
                renderer.setForeground(foreground);
                renderer.setBackground(background);
            } else {
                Color foreground, background;
                
                foreground = Color.BLACK;
                background = new Color(255, 255, 230);
                
                renderer.setForeground(foreground);
                renderer.setBackground(background);
            }
        }
    
        return renderer;
    }
}

