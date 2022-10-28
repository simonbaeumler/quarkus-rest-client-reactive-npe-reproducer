package org.acme.rest.client;

import io.smallrye.common.annotation.Blocking;
import io.smallrye.mutiny.Uni;
import org.eclipse.microprofile.rest.client.inject.RestClient;

import javax.enterprise.context.ApplicationScoped;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import java.util.Set;
import java.util.concurrent.CompletionStage;

@ApplicationScoped
public class ExtensionsResource {

    @RestClient
    ExtensionsService extensionsService;


    public Set<Extension> id(String id) {
        return extensionsService.getById("token", id);
    }
}
