package com.trabalho.agenda;

import java.sql.Connection; 
import java.util.List;

import com.trabalho.agenda.bean.Telefone;
import com.trabalho.agenda.dao.DaoFactory;
import com.trabalho.agenda.dao.PessoaDao;
import com.trabalho.agenda.lib.ConnectionFactory;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

	
	DaoFactory dao = new DaoFactory();
	
	PessoaDao tele = dao.getPessoaDao();
		
	List<Telefone> telefones = tele.getAll();
	
	for (Telefone telefone : telefones) {
		
		telefone.getNumero();
		
	}
	
	

		
	}

}
