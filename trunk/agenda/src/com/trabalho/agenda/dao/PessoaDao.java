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

import com.mysql.jdbc.PreparedStatement;
import com.trabalho.agenda.bean.Telefone;

/**
 *
 * @author Marcus Vinicius
 */
public class PessoaDao {
    private final Connection connection;

    public PessoaDao(PessoaDao pessoaDao) {
        this.connection = pessoaDao;
    }

	public void salvar(Object pessoa) {
		
		String sql = "insert into telefone(numero) values(?);" +
				"insert into contato(endereco,numeroApart,bairro,cidade,cep" +
				"estado,email,id_telefone)values (?,?,?,?,?,?,?,?);" +
				"insert pessoa(nome,sobrenome,id_contato) values(?,?,?);";
		
	
		
		
	}

    
	public Telefone lastId_telefone(){
		
		String sql = "select max(id_telefone) from telefone;";
		
		PreparedStatement stmt;
		ResultSet rs;
		Telefone telefone = new Telefone();
		
		try {
			
		 stmt =  (PreparedStatement) connection.prepareStatement(sql);
		 rs = stmt.executeQuery();
			
			if(rs.next()){
				
				telefone.setId(rs.getInt("id_telefone"));
				
			}
	
		} catch (Exception e) {
		// TODO: handle exception
		}
		return telefone;
	}
	
	public List<Telefone> getAll(){
		
		String sql = "select * from telefone";
		List<Telefone> listaTelefones = new ArrayList<Telefone>();
		
		java.sql.PreparedStatement stmt;
		ResultSet rs = null;
		
		try {
			
			stmt = connection.prepareStatement(sql);
			rs = stmt.executeQuery();
			
			while (rs.next()){
				
				Telefone c1 = new Telefone();
				
				c1.setNumero(rs.getString("numero"));
				
				listaTelefones.add(c1);
			}
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		return listaTelefones;
		
	}
	
	
}
