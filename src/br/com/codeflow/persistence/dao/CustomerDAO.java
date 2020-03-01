
package br.com.codeflow.persistence.dao;

import br.com.codeflow.scooby.business.entity.Customer;
import br.com.codeflow.scooby.main.Bootstrap;

/**
 *
 * @author scooby
 */
public class CustomerDAO {
    
    public Customer findById(Long id) {
        return (Customer) Bootstrap.entityManager.createNamedQuery(Bootstrap.CUSTOMER_FIND_BY_ID_QUERY).
                setParameter("id", id).getSingleResult();
    }
    
    public void merge(Customer customer) {
        Bootstrap.entityManager.merge(customer);
    }
    
    public void remove(Customer customer) {
        Bootstrap.entityManager.remove(customer);
    }
}
