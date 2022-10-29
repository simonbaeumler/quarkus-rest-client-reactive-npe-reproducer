Reproducer for a NullPointerException in the quarkus-reactive-rest-client. 
To see the NPE, just execute the test ExtensionsResourceTest.customTest(). 

So far I have pinned down the Exception happens with this two conditions happening:
* The rest-client has a custom exeption handler defined (see class org.acme.rest.client.ApiExceptionMapper in this repo)
* The rest-client runs in a read-timeout. The timeout is triggered here by the respective WireMock command (see org/acme/rest/client/resources/WireMockExtensions.java:63) 

This reproducer was derived from the quarkus guide, see: https://quarkus.io/guides/rest-client-reactive
