package at.htl.uebungjpa.business;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ProductFacadeIT {


    ProductFacade productFacade = new ProductFacade();

    public ProductFacadeIT() {

        productFacade.em = Persistence
                .createEntityManagerFactory("myTestPU")
                .createEntityManager();

    }

    @Test
    public void t010saveProductOk() {

        fail();

        //assertThat(number, is(2));

    }

}