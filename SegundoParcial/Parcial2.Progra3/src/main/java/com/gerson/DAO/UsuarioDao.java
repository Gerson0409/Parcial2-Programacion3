package com.gerson.DAO;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.gerson.Model.Usuario;

public class UsuarioDao {

	
	
	public List<Usuario> ingresoUsuario(Usuario usu){
		
		List<Usuario> listaU = new ArrayList<>();
			
			EntityManager em;
			EntityManagerFactory emf;
			emf = Persistence.createEntityManagerFactory("Parcial2.Progra3");
			em = emf.createEntityManager();
			
			try {
				em.getTransaction().begin();
				
				listaU = em.createQuery(" from Usuario as u where  u.nombre = '"+usu.getNombre()+"' and u.contrasenia= '"+usu.getContrasenia()+"'").getResultList();
				em.getTransaction().commit();
				
				
		
				
				
				
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println(e+"Error");
			}
			
		return listaU;	
		}
}
