package at.htl.zoo.business;

import at.htl.zoo.entity.Animal;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.util.List;

@Stateless
public class AnimalFacade {

    @PersistenceContext
    EntityManager em;

    public List<Animal> findAll() {
        TypedQuery<Animal> query = em
                .createNamedQuery("Animal.findAll", Animal.class);
        return query.getResultList();

    }


}
