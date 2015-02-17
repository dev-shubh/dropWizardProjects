package resources;

import java.util.concurrent.atomic.AtomicLong;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import com.codahale.metrics.annotation.Timed;
import com.google.common.base.Optional;

import core.MyJaxBean;
import core.Saying;

@Path("/hello-shubh")
@Produces(MediaType.APPLICATION_JSON)
public class HelloWorldResource {
	private final String template;
	private final String defaultName;
	private final AtomicLong counter;

	public HelloWorldResource(String template, String defaultName) {
		this.template = template;
		this.defaultName = defaultName;
		counter = new AtomicLong();
	}

	@GET
	@Timed
	@Path("/hello")
	public Saying sayHello(@QueryParam("name") Optional<String> name) {
		final String value = String.format(template, name.or(defaultName));
		System.out.println("shubham mishra");
		return new Saying(counter.incrementAndGet(), value);
	}

	@POST
	@Path("/create")
	@Consumes(MediaType.APPLICATION_JSON)
	public MyJaxBean create(final MyJaxBean input) {
		String s1 = input.param1;
		String s2 = input.param2;

		System.out.println("param 1 = " + input.getParam1());
		System.out.println("param 2 = " + input.getParam2());

		return new MyJaxBean(s1, s2);
	}
}