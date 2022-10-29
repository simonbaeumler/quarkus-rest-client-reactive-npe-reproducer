package org.acme.rest.client;

import org.eclipse.microprofile.rest.client.inject.RestClient;

import javax.enterprise.context.ApplicationScoped;
import java.util.Set;

@ApplicationScoped
public class ExtensionsResource {

    @RestClient
    ExtensionsService extensionsService;


    public Set<Extension> id(String id) {
        return extensionsService.getById(id);
    }
}
