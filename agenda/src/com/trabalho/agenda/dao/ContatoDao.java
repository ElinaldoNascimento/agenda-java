/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.trabalho.agenda.dao;

import java.sql.Connection;

import com.trabalho.agenda.bean.Contato;

/**
 *
 * @author Marcus Vinicius
 */
public class ContatoDao {

    private Connection connection;

    public ContatoDao(Connection connection) {
        this.connection = connection;
    }

	public static void salvar(Contato contato) {
		// TODO Auto-generated method stub
		
	}
    
    
}
