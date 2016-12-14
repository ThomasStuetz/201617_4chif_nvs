package at.htl.uebungjpa.business;

import at.htl.uebungjpa.entity.Product;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ProductFacadeIT { // Integration Test


    ProductFacade productFacade = new ProductFacade();

    public ProductFacadeIT() {

        productFacade.em = Persistence
                .createEntityManagerFactory("myTestPU")
                .createEntityManager();

    }

    @Test
    public void t010saveProductOk() {

        Product product = new Product("birne", 100.0, 25);

        productFacade.em.getTransaction().begin();
        productFacade.save(product);
        productFacade.em.getTransaction().commit();

        Product p = productFacade.findByName("birne");
        assertThat(p.getName(), is("birne"));

    }

}