package cl.ddiaz.ejb.patron.dao;

import java.util.Date;

import javax.persistence.EntityManager;

import cl.ddiaz.ejb.entity.cmp.UsuarioEntity;
import cl.ddiaz.ejb.patron.to.ResponseTO;
import cl.ddiaz.util.UtilEncriptacion;

public class UsuarioDAO extends BaseDAO<UsuarioEntity>{

	public UsuarioDAO(Class<UsuarioEntity> entityClass, EntityManager em) {
		super(entityClass, em);
	}
	
	public ResponseTO agregarUsuario(UsuarioEntity usuarioEntity) {
		ResponseTO response = new ResponseTO();
		try {
			UtilEncriptacion encriptador = new UtilEncriptacion();
			usuarioEntity.setContrasena(encriptador.encriptar(usuarioEntity.getContrasena()));
			usuarioEntity.setEstado("ACT");
			usuarioEntity.setFechaCreacion(new Date());
			this.getEm().persist(usuarioEntity);
			response.setStatus(true);
			response.setMessage("Usuario creado correctamente");
		} catch (Exception e) {
			e.printStackTrace();
			response.setStatus(false);
			response.setMessage("Ocurrió un error al crear el usuario");
		}
		return response;
	}

}
