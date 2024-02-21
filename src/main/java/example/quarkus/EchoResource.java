package example.quarkus;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;

@Path("/")
public class EchoResource {
	
//	@GET
//	public String hi() {
//		return "Hi!";
//	}
	
	@GET
	@Path("/greeting")
	public String hi() {
		return "Hi!";
	}
	
	@GET
	@Path("/morning")
	public String morning() {
		return "Good morning!";
	}
	
	@GET
	@Path("/night")
	public String afternoon() {
		return "Good night!";
	}

}
