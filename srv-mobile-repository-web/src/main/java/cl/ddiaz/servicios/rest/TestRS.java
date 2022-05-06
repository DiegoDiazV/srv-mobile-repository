package cl.ddiaz.servicios.rest;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.jboss.logging.Logger;

@Path("/test")
public class TestRS {

	private Logger log = Logger.getLogger(TestRS.class);
	
	@POST
    @Path("/test")
	@Consumes({ MediaType.APPLICATION_JSON })
	@Produces({ MediaType.APPLICATION_JSON })
    public String test(){
        log.info("[TEST] Comienza Ejecucion del metodo!!");
        return "Hola Mecrish";
    }
}
