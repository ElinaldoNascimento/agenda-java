/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.trabalho.agenda.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import java.sql.PreparedStatement;
import com.trabalho.agenda.bean.Contato;
import com.trabalho.agenda.bean.Pessoa;
import com.trabalho.agenda.bean.Telefone;

/**
 *
 * @author Marcus Vinicius
 */
public class PessoaDao {
	private PreparedStatement stmt;
	private final Connection connection;

	public PessoaDao(Connection connection) {
		this.connection = connection;
	}

	public void salvar(Pessoa pessoa) throws SQLException{
		String sql = "insert into pessoa(nome,sobrenome,id_contato) values(?,?,?)";	
		stmt = connection.prepareStatement(sql);
		stmt.setString(1, pessoa.getNome());
		stmt.setString(2, pessoa.getSobrenome());
		stmt.setLong(3, pessoa.getContato().getId());
		stmt.execute();
		stmt.close();

	}







}
