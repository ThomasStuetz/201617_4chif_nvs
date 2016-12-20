package at.htl.zoo.business;

import at.htl.zoo.entity.Elephant;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless
public class ElephantFacade {

    @PersistenceContext
    EntityManager em;

    public void save(Elephant elephant) {
        em.persist(elephant);
    }


}
