package at.htl.landwirtschaft.business;

import at.htl.landwirtschaft.entity.Ereignis;
import at.htl.landwirtschaft.entity.Feld;
import at.htl.landwirtschaft.entity.enumeration.EreignisArt;

import javax.annotation.PostConstruct;
import javax.ejb.Singleton;
import javax.ejb.Startup;
import javax.inject.Inject;

@Startup
@Singleton
public class InitBean {

    @Inject
    FeldFacade feldFacade;

    @Inject
    EreignisFacade ereignisFacade;

    public InitBean() {
    }

    @PostConstruct
    public void init() {
        Feld kleineFeld = new Feld("kleines Feld");
        //feldFacade.save(kleineFeld);

        Ereignis aussaatAmKleinenFeld = new Ereignis("Weizen", EreignisArt.AUSSAAT, kleineFeld);
        ereignisFacade.save(aussaatAmKleinenFeld);
        //ereignisFacade.remove(aussaatAmKleinenFeld);
        System.out.println(aussaatAmKleinenFeld);
        ereignisFacade.detach(aussaatAmKleinenFeld);
        aussaatAmKleinenFeld.setDescription("geänderte Description");
        long id = aussaatAmKleinenFeld.getId();
        aussaatAmKleinenFeld = null;
        aussaatAmKleinenFeld = ereignisFacade.findById(id);
        System.out.println(aussaatAmKleinenFeld);
    }
}
