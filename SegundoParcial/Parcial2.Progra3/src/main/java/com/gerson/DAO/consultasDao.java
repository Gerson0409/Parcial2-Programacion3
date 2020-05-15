package com.gerson.DAO;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.gerson.Model.Consulta;




public class consultasDao {

	
	public List<Consulta> ConsultaLista (){
	List<Consulta> listacd = new ArrayList<>();
	
	EntityManager em;
	EntityManagerFactory emf;
	emf = Persistence.createEntityManagerFactory("Parcial2.Progra3");
	em = emf.createEntityManager();
	
	try {
		em.getTransaction().begin();
		
		listacd = em.createQuery(" from Consulta").getResultList();
		em.getTransaction().commit();
		
		
		
		
	} catch (Exception e) {
		// TODO: handle exception
		System.out.println(e);	
	
		
	}
		
	return listacd;	
	
}
	
	
	
	
	
	
	
	public void agregarDatos(Consulta con) {
		
		EntityManager em;
		EntityManagerFactory emf;
		emf = Persistence.createEntityManagerFactory("Parcial2.Progra3");
		em = emf.createEntityManager();
		
		
		em.getTransaction().begin();
		em.persist(con);
		em.flush();
		em.getTransaction().commit();
				
	}
	
	public void actualizarDatos(Consulta con) {
		EntityManager em;
		EntityManagerFactory emf;
		emf = Persistence.createEntityManagerFactory("Parcial2.Progra3");
		em = emf.createEntityManager();
		
		con.getId();
		con.getNombre();
		con.getApellido();

		
		em.getTransaction().begin();
		em.merge(con);
		em.flush();
		em.getTransaction().commit();
		
		
	}
	
	public void eliminarDatos(Consulta con) {
		EntityManager em;
		EntityManagerFactory emf;
		emf = Persistence.createEntityManagerFactory("Parcial2.Progra3");
		em = emf.createEntityManager();
		

		em.getTransaction().begin();		
		con=em.getReference(Consulta.class, con.getId());
		em.remove(con);
		em.flush();
		em.getTransaction().commit();
		
		
	}
	

}



