/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import com.roxket.domain.Persona;
import java.util.List;
import javax.persistence.EntityManagerFactory;
import javax.persistence.*;

/**
 *
 * @author roxket
 */
public class HolaMundoHibernate {
	public static void main(String[] args){
		// HQL Hibernate Query Language
		String hql = "SELECT p FROM Persona p From p";
		
		//Entity Manager Factory
		EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("HibernateEjemplo1");
		EntityManager entityManager = fabrica.createEntityManager();
		
		//Select from..
		Query query = entityManager.createQuery(hql);
		List<Persona> personas = query.getResultList();
		
		for(Persona p: personas){
			System.out.println("Persona: " + p);
		}
	}
	
}
