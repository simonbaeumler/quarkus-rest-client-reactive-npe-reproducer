package org.acme.rest.client;

import java.util.Set;

import javax.ws.rs.*;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.MediaType;

import org.eclipse.microprofile.rest.client.annotation.RegisterProvider;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;
import org.jboss.resteasy.reactive.RestQuery;

@Path("/extensions")
@RegisterRestClient(configKey = "extensions-api")
@RegisterProvider(ApiExceptionMapper.class)
public interface ExtensionsService {



    @GET
    Set<Extension> getById(@HeaderParam(HttpHeaders.AUTHORIZATION) String BEARER_TOKEN, @RestQuery String id);
}
