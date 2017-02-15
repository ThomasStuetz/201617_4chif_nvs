package at.htl.landwirtschaft.business;

import at.htl.landwirtschaft.entity.Ereignis;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless
public class EreignisFacade {

    @PersistenceContext
    EntityManager em;

    public void save(Ereignis ereignis) {
        em.persist(ereignis);
    }

    public void remove(Ereignis ereignis) {
        em.remove(ereignis);
    }

    public void detach(Ereignis ereignis) {
        em.detach(ereignis);
    }

    public Ereignis findById(long id) {
        return em.find(Ereignis.class, id);
    }

}
