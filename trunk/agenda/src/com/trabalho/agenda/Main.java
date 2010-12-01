package com.trabalho.agenda;

import com.trabalho.agenda.dao.DaoFactory;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		DaoFactory dao = new DaoFactory();
		dao.getPessoaDao();
		dao.getContatoDao();
		
		

	}

}
