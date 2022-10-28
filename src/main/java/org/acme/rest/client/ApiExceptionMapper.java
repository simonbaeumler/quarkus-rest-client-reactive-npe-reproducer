package org.acme.rest.client;

import org.eclipse.microprofile.rest.client.ext.ResponseExceptionMapper;

import javax.ws.rs.core.MultivaluedMap;
import javax.ws.rs.core.Response;

/**
 * A response-exception mapper for API clients
 */
public class ApiExceptionMapper implements ResponseExceptionMapper<RuntimeException> {

    @Override
    public RuntimeException toThrowable(Response response) {
        int statusCode = response.getStatus();

        return new IllegalStateException("API returned status code " + statusCode);
    }

    @Override
    public boolean handles(int status, MultivaluedMap<String, Object> headers) {
        return (status != Response.Status.OK.getStatusCode());
    }
}
