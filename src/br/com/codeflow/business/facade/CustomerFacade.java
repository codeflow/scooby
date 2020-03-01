
package br.com.codeflow.business.facade;

import br.com.codeflow.persistence.dao.CustomerDAO;
import br.com.codeflow.scooby.business.entity.Customer;

/**
 *
 * @author scooby
 */
public class CustomerFacade {
    
    private final CustomerDAO customerDAO;
    
    public CustomerFacade() {
        customerDAO = new CustomerDAO();
    }
    
    public Customer findById(Long id) {
        return customerDAO.findById(id);
    }
    
    public void merge(Customer customer) {
        customerDAO.merge(customer);
    }
    
    public void remove(Customer customer) {
        customerDAO.remove(customer);
    }
}
