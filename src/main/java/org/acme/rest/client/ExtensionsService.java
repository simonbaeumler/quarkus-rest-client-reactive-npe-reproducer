package org.acme.rest.client;

import org.eclipse.microprofile.rest.client.annotation.RegisterProvider;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;
import org.jboss.resteasy.reactive.RestQuery;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import java.util.Set;

@Path("/extensions")
@RegisterRestClient(configKey = "extensions-api")
@RegisterProvider(ApiExceptionMapper.class)
public interface ExtensionsService {



    @GET
    Set<Extension> getById(@RestQuery String id);
}
