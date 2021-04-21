package at.htl;

import at.htl.entity.Person;

import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.transaction.Transactional;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Path("/hello")
public class GreetingResource {

    @Inject
    EntityManager em;

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return "Hello 4ahif";
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Transactional
    public void createPerson(Person person) {
        em.merge(person);
    }
}