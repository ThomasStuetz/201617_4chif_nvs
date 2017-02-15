package at.htl.zoo.rest;

import at.htl.zoo.business.AnimalFacade;
import at.htl.zoo.entity.Animal;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.List;

@Path("animal")
public class AnimalEndpoint {

    @Inject
    AnimalFacade animalFacade;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response findAll() {
        List<Animal> animals = animalFacade.findAll();
        return Response.ok().entity(animals).build();
    }

}
