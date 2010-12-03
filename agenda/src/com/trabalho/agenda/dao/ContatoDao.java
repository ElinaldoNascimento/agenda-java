/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.trabalho.agenda.dao;

import java.sql.Connection; 
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


import com.trabalho.agenda.bean.Contato;
import com.trabalho.agenda.bean.Telefone;

/**
 *
 * @author Marcus Vinicius
 */
public class ContatoDao {

    private Connection connection;
    private PreparedStatement stmt;
    

    public ContatoDao(Connection connection) {
        this.connection = connection;
    }

public void salvar(Contato contato) throws SQLException {
		
		String sql =
				"insert into contato(endereco,numeroApart,bairro,cidade,cep," +
				"estado,email) values (?,?,?,?,?,?,?);";
	
		
		
	stmt = connection.prepareStatement(sql);
		
	stmt.setString(1, contato.getEndereco());
	stmt.setString(2, contato.getAptNo());
	stmt.setString(3, contato.getBairro());
	stmt.setString(4, contato.getCidade());
	stmt.setString(5, contato.getEstado());
	stmt.setString(6, contato.getEstado());
	stmt.setString(7, contato.getEmail());
	
	stmt.execute();
	
	
	DaoFactory dao = new DaoFactory();
	Contato contato2 = new Contato();
	
	contato2 = dao.getContatoDao().lastIdContato();
	
	Long id_contato = contato2.getId();
	
	String sql2 = "insert into telefone(telefone,id_contato) values (?,?);";
	
	PreparedStatement stmt2 = connection.prepareStatement(sql2);
	
	
	for (Telefone telefone : contato.getTelefones()) {
		
		stmt2.setString(1, telefone.getNumero());
		stmt2.setLong(2, id_contato);
		
		stmt2.execute();
		
		
	}
	
	
		stmt.close();
		stmt2.close();
	
		
	}
	


    
	public Telefone lastIdTelefone(){
		
		String sql = "select max(id_telefone) from telefone;";
		
		PreparedStatement stmt;
		ResultSet rs;
		Telefone telefone = new Telefone();
		
		try {
			
		 stmt =  (PreparedStatement) connection.prepareStatement(sql);
		 rs = stmt.executeQuery();
			
			if(rs.next()){
				
				telefone.setId(rs.getLong(1));
				
			}
	
		} catch (Exception e) {

		}
		return telefone;
	}
	
	
		public Contato lastIdContato(){
		
		String sql = "select max(id_contato) from contato;";
		
		PreparedStatement stmt;
		ResultSet rs;
		Contato contato = new Contato();
		
		try {
			
		 stmt =  (PreparedStatement) connection.prepareStatement(sql);
		 rs = stmt.executeQuery();
			
			if(rs.next()){
				
				contato.setId(rs.getLong(1));
				
			}
	
		} catch (Exception e) {

		}
		return contato;
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
