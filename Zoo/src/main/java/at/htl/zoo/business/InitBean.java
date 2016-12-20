package at.htl.zoo.business;

import at.htl.zoo.entity.Elephant;

import javax.annotation.PostConstruct;
import javax.ejb.Singleton;
import javax.ejb.Startup;
import javax.inject.Inject;

@Startup
@Singleton
public class InitBean {

    @Inject
    ElephantFacade elephantFacade;

    @PostConstruct
    private void init() {
        elephantFacade.save(new Elephant("Dumbo", 150));
    }

}
