package com.br.matriculapadroes.dao;

import javax.persistence.EntityManager;

import com.br.matriculapadroes.models.Aluno;
import com.br.matriculapadroes.util.JPAUtil;

public class AlunoDAO {
	
	EntityManager manager = JPAUtil.getInstancia();
	
	public void salvar(Aluno aluno){
		manager.getTransaction().begin();
		
		manager.persist(aluno);
		
		manager.getTransaction().commit();
		manager.close();
	}

}
