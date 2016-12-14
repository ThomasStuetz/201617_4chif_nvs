package at.htl.uebungjpa.business;

import at.htl.uebungjpa.entity.Product;

import javax.ejb.Singleton;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

@Stateless
public class ProductFacade {

    @PersistenceContext
    EntityManager em;

    public void save(Product product) {
        em.persist(product);
    }

    public Product findByName(String name){

        return em
                .createNamedQuery("Product.findByName", Product.class)
                .setParameter("NAME", name)
                .getSingleResult();

    }


}
