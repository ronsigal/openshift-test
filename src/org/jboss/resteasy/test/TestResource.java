package org.jboss.resteasy.test;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("")
public class TestResource {
	
	@GET
	@Path("hello")
	public String hello() {
		return "hello baby";
	}
}
