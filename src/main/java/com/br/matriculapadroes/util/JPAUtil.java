package com.br.matriculapadroes.util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JPAUtil {
	
	private static EntityManagerFactory factory;
	
	public static EntityManager getInstancia(){
		if (factory == null ){
			factory = Persistence.createEntityManagerFactory("matriculapadroes");
		}
		
		return factory.createEntityManager();
	}
	
	 public static void main(String[] args) {
	        EntityManagerFactory factory = Persistence
	                .createEntityManagerFactory("matriculapadroes");
	        factory.close();
	    }
}
