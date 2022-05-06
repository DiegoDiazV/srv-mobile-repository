package cl.ddiaz.ejb.session.stateless.facade;

import javax.ejb.Local;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import cl.ddiaz.ejb.entity.cmp.UsuarioEntity;
import cl.ddiaz.ejb.patron.dao.UsuarioDAO;
import cl.ddiaz.ejb.patron.to.ResponseTO;
import cl.ddiaz.ejb.session.stateless.facade.interfaces.UsuarioFacadeLocal;

@Stateless
@Local(UsuarioFacadeLocal.class)
public class UsuarioFacade implements UsuarioFacadeLocal{

	@PersistenceContext(unitName = "primary")
	private EntityManager em;

	@Override
	public ResponseTO agregarUsuario(UsuarioEntity usuarioEntity) {
		UsuarioDAO usuarioDAO = new UsuarioDAO(UsuarioEntity.class, this.em);
		return usuarioDAO.agregarUsuario(usuarioEntity);
	}

}
