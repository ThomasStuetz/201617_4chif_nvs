package at.htl.uebungjpa.business;

import at.htl.uebungjpa.entity.Product;

import javax.annotation.PostConstruct;
import javax.ejb.Singleton;
import javax.ejb.Startup;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Startup
@Singleton
public class InitBean {

    @Inject
    ProductFacade productFacade;

    public InitBean() {
    }

    @PostConstruct
    private void init() {
        productFacade.save(new Product("apple", 1.0, 300));
    }

}
