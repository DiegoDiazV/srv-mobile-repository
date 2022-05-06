package cl.ddiaz.ejb.session.stateless.facade.interfaces;

import cl.ddiaz.ejb.entity.cmp.UsuarioEntity;
import cl.ddiaz.ejb.patron.to.ResponseTO;

public interface UsuarioFacadeLocal {
	public ResponseTO agregarUsuario(UsuarioEntity usuarioEntity);
}
