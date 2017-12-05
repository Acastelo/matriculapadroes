package com.br.matriculapadroes.bean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import com.br.matriculapadroes.models.Aluno;

@ManagedBean
@RequestScoped
public class AlunoBean {
	
	private Aluno aluno = new Aluno();
	
	public void salvar(){
		System.out.println("Aluno salvo " + aluno);
	}
	
	public Aluno getAluno() {
		return aluno;
	}

	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}

}
