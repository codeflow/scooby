
package br.com.codeflow.scooby.main;

import br.com.codeflow.scooby.business.entity.Customer;

import java.util.ArrayList;
import java.util.Collection;
import java.util.ResourceBundle;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author codeflow
 */
public class Bootstrap {
    
    public static final String APPLICATION_PU = "ScoobyPU";
    public static final String CUSTOMER_FIND_ALL_QUERY = "Customer.findAll";
    public static final String CUSTOMER_FIND_BY_ID_QUERY = "Customer.findById";
    
    public static Collection<Customer> customers;
    
    private static final EntityManagerFactory factory;
    public static final EntityManager entityManager;
    
    public static ResourceBundle bundle;
    
    static {
        customers = new ArrayList<>();
        
        factory = Persistence.createEntityManagerFactory(Bootstrap.APPLICATION_PU);
        entityManager = factory.createEntityManager();
        
        customers = entityManager.createNamedQuery(CUSTOMER_FIND_ALL_QUERY, Customer.class).getResultList();
        
        bundle = ResourceBundle.getBundle("br/com/codeflow/scooby/resources/i18n/messages_pt_BR");
    }
}
