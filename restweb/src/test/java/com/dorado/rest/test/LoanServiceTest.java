/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dorado.rest.test;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.api.client.config.ClientConfig;
import com.sun.jersey.api.client.config.DefaultClientConfig;
import java.net.URI;
import java.security.Principal;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.UriBuilder;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

/**
 *
 * @author 160665
 */
public class LoanServiceTest {

    public static final String SERVER_URL = "http://localhost:8181";
    public static final String WEB_CONTEXT_PATH = "/restweb";
    public static final String BASE_REST_PATH = "/service/loan";
    private WebResource service;
    RestTemplate restTemplate = new RestTemplate();

    public LoanServiceTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        ClientConfig config = new DefaultClientConfig();
        Client client = Client.create(config);
        service = client.resource(getBaseURI());
    }

    @After
    public void tearDown() {
    }

    private static URI getBaseURI() {
        return UriBuilder.fromUri(SERVER_URL + WEB_CONTEXT_PATH + BASE_REST_PATH + "/loan").build();
    }

    public ResponseEntity<Principal> authenticate(String username, String pass) {
        HttpEntity<Principal> entity = new HttpEntity<Principal>(createHeaders(username, pass));
        return restTemplate.exchange(getBaseURI(), HttpMethod.GET, entity, Principal.class);
    }

    HttpHeaders createHeaders(String email, String password) {
        HttpHeaders acceptHeaders = new HttpHeaders();
        String authorization = "temporary" + ':' + "temporary";
        //String basic = new String(Base64.encodeBase64
        //    (authorization.getBytes(Charset.forName('US-ASCII'))));
        acceptHeaders.set("Authorization", authorization);

        return acceptHeaders;
    }

    //@Test
    public void testGetLoanDetails() {

        //authenticate("temporary","temporary");

        /*ClientResponse response = service.path("get").path("1")
                .accept(MediaType.APPLICATION_XML)
                .get(ClientResponse.class);*/
        System.out.println(service.path("get").path("1")
                .accept(MediaType.APPLICATION_XML).get(String.class));
        //System.out.println("Form response " + response.getEntity(String.class));
        //assertEquals(200, response.getStatus());
    }

}