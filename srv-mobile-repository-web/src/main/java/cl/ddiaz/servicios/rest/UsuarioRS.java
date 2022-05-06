package cl.ddiaz.servicios.rest;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.jboss.logging.Logger;

import cl.ddiaz.ejb.entity.cmp.UsuarioEntity;
import cl.ddiaz.ejb.patron.to.ResponseTO;
import cl.ddiaz.ejb.session.stateless.facade.interfaces.UsuarioFacadeLocal;

@Path("/usuario")
public class UsuarioRS {

	@Inject UsuarioFacadeLocal usuarioFacadeLocal;
	private Logger log = Logger.getLogger(UsuarioRS.class);
	
	@POST
    @Path("/agregarUsuario")
	@Consumes({ MediaType.APPLICATION_JSON })
	@Produces({ MediaType.APPLICATION_JSON })
	public ResponseTO agregarUsuario(UsuarioEntity usuarioEntity) {
		log.info("Comienza metodo [agregarUsuario]");
		return usuarioFacadeLocal.agregarUsuario(usuarioEntity);
	}
}
