package pl.codeleak.samples;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/owners")
public class OwnerResource {

    @Inject
    OwnerRepository ownerRepository;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getAll() {
        return Response.ok(ownerRepository.findAll().list()).build();
    }
}