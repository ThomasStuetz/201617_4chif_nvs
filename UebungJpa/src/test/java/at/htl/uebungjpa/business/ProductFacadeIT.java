package at.htl.uebungjpa.business;

import at.htl.uebungjpa.entity.Product;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

import java.util.List;

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

    @Test
    public void t020findAllProductsOk() {
        productFacade.em.getTransaction().begin();
        productFacade.save(new Product("pfirsich", 100.0, 25));
        productFacade.save(new Product("zitrone", 200.0, 35));
        productFacade.save(new Product("kokosnuss", 300.0, 45));
        productFacade.em.getTransaction().commit();

        List<Product> products = productFacade.findAll();
        assertThat(products.size(), is(5));

    }

}