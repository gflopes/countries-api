package br.com.gustavo;

import java.util.Set;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;
import org.jboss.resteasy.annotations.jaxrs.PathParam;

@Path("/v2")
@RegisterRestClient(configKey="country-api")
public interface CountryService {

    @GET
    @Path("name/{name}")
    @Produces(MediaType.APPLICATION_JSON)
    Set<Country> getByName(@PathParam String name);
}