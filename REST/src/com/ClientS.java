package com;



import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.UriBuilder;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.api.client.config.ClientConfig;
import com.sun.jersey.api.client.config.DefaultClientConfig;
import com.sun.org.apache.xerces.internal.util.URI;

public class ClientS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClientConfig config = new DefaultClientConfig();
		Client client = Client.create(config);
		WebResource service = client.resource(getBaseURI());
		System.out.println(service.path("uebak").accept(MediaType.TEXT_PLAIN).get(String.class));
	}

	private static java.net.URI getBaseURI() {
		// TODO Auto-generated method stub
		
		return UriBuilder.fromUri("http://localhost:8080/REST/Dome/dome").build();
		
	}

}
