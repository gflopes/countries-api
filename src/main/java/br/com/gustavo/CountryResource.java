package br.com.gustavo;

import java.util.Set;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.eclipse.microprofile.rest.client.inject.RestClient;
import org.jboss.resteasy.annotations.jaxrs.PathParam;

@Path("/api/countries")
@Produces(MediaType.APPLICATION_JSON)
public class CountryResource {

    @Inject
    @RestClient
    CountryService countryService;

    @GET
    @Path("/name/{name}")
    public Set<Country> getByName(@PathParam String name) {
        return countryService.getByName(name);
    }
}