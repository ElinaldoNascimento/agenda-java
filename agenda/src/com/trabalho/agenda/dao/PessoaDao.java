/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.trabalho.agenda.dao;

import java.io.Serializable;
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

	public Pessoa getById(Integer id){
		
		String sql = "select * from pessoa,contato,telefone where pessoa.id_contato = contato.id_contato " +
				"and telefone.id_contato = contato.id_contato and pessoa.id_pessoa = ?;";
		
		PreparedStatement stmt;
		ResultSet rs;
		Pessoa pessoa = new Pessoa();
		Contato contato = new Contato();
		
		
		
		try {
			
			stmt = connection.prepareStatement(sql);
			stmt.setLong(1, id);
			
			rs = stmt.executeQuery();
			
			if(rs.next()){
				
				Telefone tele = new Telefone();
				tele.setId(rs.getLong("id_telefone"));
				tele.setNumero(rs.getString("telefone"));
				List<Telefone> telefones = new ArrayList<Telefone>();
				telefones.add(tele);
				
				pessoa.setId(rs.getLong("id_pessoa"));
				contato.setId(rs.getLong("id_contato"));
				contato.setAptNo(rs.getString("numeroApart"));
				contato.setBairro(rs.getString("bairro"));
				contato.setCEP(rs.getString("cep"));
				contato.setCidade(rs.getString("cidade"));
				contato.setEmail(rs.getString("email"));
				contato.setEndereco(rs.getString("endereco"));
				contato.setEstado(rs.getString("estado"));
				contato.setObservacao(rs.getString("observacao"));
				
				
				contato.setTelefones(telefones);
				pessoa.setContato(contato);
				pessoa.setNome(rs.getString("nome"));
				pessoa.setSobrenome(rs.getString("sobrenome"));
				
				
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
		
		return pessoa;
	}
	
	public Pessoa lastPessoa(Long id){
		
		String sql = "select * from pessoa,contato,telefone where pessoa.id_contato = contato.id_contato " +
				"and telefone.id_contato = contato.id_contato and pessoa.id_pessoa = ?;";
		
		PreparedStatement stmt;
		ResultSet rs;
		Pessoa pessoa = new Pessoa();
		Contato contato = new Contato();
		
		
		
		try {
			
			stmt = connection.prepareStatement(sql);
			stmt.setLong(1, id);
			
			rs = stmt.executeQuery();
			
			if(rs.next()){
				
				Telefone tele = new Telefone();
				tele.setId(rs.getLong("id_telefone"));
				tele.setNumero(rs.getString("telefone"));
				List<Telefone> telefones = new ArrayList<Telefone>();
				telefones.add(tele);
				
				pessoa.setId(rs.getLong("id_pessoa"));
				contato.setId(rs.getLong("id_contato"));
				contato.setAptNo(rs.getString("numeroApart"));
				contato.setBairro(rs.getString("bairro"));
				contato.setCEP(rs.getString("cep"));
				contato.setCidade(rs.getString("cidade"));
				contato.setEmail(rs.getString("email"));
				contato.setEndereco(rs.getString("endereco"));
				contato.setEstado(rs.getString("estado"));
				contato.setObservacao(rs.getString("observacao"));
				
				
				contato.setTelefones(telefones);
				pessoa.setContato(contato);
				pessoa.setNome(rs.getString("nome"));
				pessoa.setSobrenome(rs.getString("sobrenome"));
				
				
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
		
		return pessoa;
	}


	public List<Pessoa> getAll(){
		
		String sql = "select * from pessoa,contato,telefone where pessoa.id_contato = contato.id_contato " +
				"and telefone.id_contato = contato.id_contato;";
		
		List<Pessoa> listaPessoas = new ArrayList<Pessoa>();
		
		PreparedStatement stmt;
		ResultSet rs = null;
		
		try {
			
			stmt = connection.prepareStatement(sql);
			rs = stmt.executeQuery();
			
			while (rs.next()) {
				
				Pessoa pessoa = new Pessoa();
				Contato contato = new Contato();
				
				Telefone tele = new Telefone();
				tele.setId(rs.getLong("id_telefone"));
				tele.setNumero(rs.getString("telefone"));
				List<Telefone> telefones = new ArrayList<Telefone>();
				telefones.add(tele);
				
				pessoa.setId(rs.getLong("id_pessoa"));
				contato.setId(rs.getLong("id_contato"));
				contato.setAptNo(rs.getString("numeroApart"));
				contato.setBairro(rs.getString("bairro"));
				contato.setCEP(rs.getString("cep"));
				contato.setCidade(rs.getString("cidade"));
				contato.setEmail(rs.getString("email"));
				contato.setEndereco(rs.getString("endereco"));
				contato.setEstado(rs.getString("estado"));
				contato.setObservacao(rs.getString("observacao"));
				
				
				contato.setTelefones(telefones);
				pessoa.setContato(contato);
				pessoa.setNome(rs.getString("nome"));
				pessoa.setSobrenome(rs.getString("sobrenome"));
				
				listaPessoas.add(pessoa);
				
			}
	
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
	
		return listaPessoas;
		
		
		
	}




}
