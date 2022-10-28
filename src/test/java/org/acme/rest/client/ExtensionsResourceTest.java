package org.acme.rest.client;

import io.quarkus.test.common.QuarkusTestResource;
import io.quarkus.test.junit.QuarkusTest;

import org.acme.rest.client.resources.WireMockExtensions;
import org.junit.jupiter.api.Test;

import javax.inject.Inject;

import java.util.Arrays;
import java.util.Set;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.hasItem;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.Matchers.greaterThan;

@QuarkusTest
@QuarkusTestResource(WireMockExtensions.class)
public class ExtensionsResourceTest {

    @Inject
    ExtensionsResource extensionsResource;

    @Test
    public void customTest() {
        Set<Extension> id = extensionsResource.id("io.quarkus:quarkus-rest-client-reactive");
        if (id == null) {
            throw new RuntimeException("no response");
        }
    }
}
