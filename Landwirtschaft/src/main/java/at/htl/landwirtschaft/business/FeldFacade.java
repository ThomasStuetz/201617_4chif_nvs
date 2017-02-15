package at.htl.landwirtschaft.business;

import at.htl.landwirtschaft.entity.Feld;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless
public class FeldFacade {

    @PersistenceContext
    EntityManager em;

    public FeldFacade() {
    }

    public void save(Feld feld) {
        em.persist(feld);
        System.out.println(feld);
    }
}
