package com.trabalho.agenda;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.trabalho.agenda.bean.Contato;
import com.trabalho.agenda.bean.Pessoa;
import com.trabalho.agenda.bean.Telefone;
import com.trabalho.agenda.dao.DaoFactory;
import com.trabalho.agenda.dao.PessoaDao;
import com.trabalho.agenda.lib.ConnectionFactory;

public class Main {

	/**
	 * @param args
	 * @throws SQLException 
	 */
	public static void main(String[] args) throws SQLException {
	/*
		DaoFactory dao = new DaoFactory();
		Telefone telefone = new Telefone();
		
		telefone = dao.getContatoDao().lastIdTelefone();
		
		System.out.println(telefone.getId());
		
		Contato contato = new Contato();
		
		contato = dao.getContatoDao().lastIdContato();
		
		System.out.println(contato.getId());
		
		Contato contato = new Contato();
		
		contato.setEstado("Maranhão");
		contato.setBairro("Parque Piauí");
		contato.setCidade("Timon ");
		contato.setEmail("elinaldo.java@gmail.com");
		
		DaoFactory dao = new DaoFactory();
		
		dao.getContatoDao().salvar(contato);*/
		/*
		
		DaoFactory dao = new DaoFactory();
		Pessoa pessoa = new Pessoa();
		
		pessoa = dao.getPessoaDao().getById(5);
		
		System.out.println(pessoa.getNome());
		*/
		
		DaoFactory dao = new DaoFactory();
		List<Pessoa> pessoas  = new ArrayList<Pessoa>();
		List<Telefone> telefones = new ArrayList<Telefone>();
		
		pessoas = dao.getPessoaDao().getAll();
		
	
		for (Pessoa pessoa : pessoas) {
		
			System.out.println(pessoa.getNome()+" "+pessoa.getSobrenome());
		
		
			
		}
		
		
	}

}
