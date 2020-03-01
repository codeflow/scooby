
package br.com.codeflow.scooby.ui.model;

import br.com.codeflow.scooby.business.entity.Customer;

import java.util.ArrayList;
import java.util.Collection;

import javax.swing.table.AbstractTableModel;
import java.util.ResourceBundle;

/**
 *
 * @author codeflow
 */
public class CustomerTableModel extends AbstractTableModel {
    
    ResourceBundle bundle = ResourceBundle.getBundle("br/com/codeflow/scooby/resources/i18n/messages_pt_BR");
    
    final String[] columnNames = { bundle.getString("FrmCustomer.tableCustomer.column.name.text") };
    final Class[] columnClasses = {String.class};
    
    final Collection<Customer> data = new ArrayList<>();
    
    public void add(Customer customer) {
        data.add(customer);
        fireTableRowsInserted(data.size()-1, data.size()-1);
    }
   
    public void removeRow(Customer customer) {
        data.remove(customer);
        fireTableDataChanged();
    }
    
    @Override
    public int getColumnCount() {
       return columnNames.length;
    }
          
    @Override
    public int getRowCount() {
       return data.size();
    }
  
    @Override
    public String getColumnName(int col) {
       return columnNames[col];
    }

    @Override
    public Class getColumnClass(int c) {
       return columnClasses[c];
    }

    @Override
    public Object getValueAt(int row, int col) {
       Customer customer = (Customer) ((ArrayList<Customer>)data).get(row);

       return customer;
    }

    @Override
    public boolean isCellEditable(int row, int col) {
       return false;
    }
}
