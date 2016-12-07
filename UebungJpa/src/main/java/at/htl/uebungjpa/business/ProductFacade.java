package at.htl.uebungjpa.business;

import at.htl.uebungjpa.entity.Product;

import javax.ejb.Singleton;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless
public class ProductFacade {

    @PersistenceContext
    EntityManager em;

    public void save(Product product) {
        em.persist(product);
    }


    public int giveMeTwo() {
        return 2;
    }

}
