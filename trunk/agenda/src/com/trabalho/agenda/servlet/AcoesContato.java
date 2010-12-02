package com.trabalho.agenda.servlet;

import java.sql.SQLException;
import java.util.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.trabalho.agenda.bean.Contato;
import com.trabalho.agenda.bean.Telefone;
import com.trabalho.agenda.dao.ContatoDao;
import com.trabalho.agenda.dao.DaoFactory;

public class AcoesContato {
	

	private static Contato mapContato(HttpServletRequest request){
		
		Contato contato = new Contato();
		
	
		String endereco = request.getParameter("endereco");
		String aptNo = request.getParameter("aptNo");
		String bairro = request.getParameter("bairro");
		String cidade = request.getParameter("cidade");
		String Cep = request.getParameter("cep");
		String estado = request.getParameter("estado");
		String email = request.getParameter("email");
		String telefone = request.getParameter("telefone");
		String observacao = request.getParameter("observacao");
		
		
		Telefone tele = new Telefone();
		tele.setNumero(telefone);
		
		List<Telefone> telefones = null;
		telefones.add(tele);
		
		contato.setEndereco(endereco);
		contato.setAptNo(aptNo);
		contato.setBairro(bairro);
		contato.setCEP(Cep);
		contato.setCidade(cidade);
		contato.setTelefones(telefones);
		contato.setEstado(estado);
		contato.setObservacao(observacao);
		contato.setEmail(email);
		
		return contato;
		
	}

	public static String salvar(HttpServletRequest request,
			HttpServletResponse response) throws SQLException {
		
		Contato contato = mapContato(request);
		
		DaoFactory dao = new DaoFactory();
		
		
		dao.getContatoDao().salvar(contato);
		
		return "salvo";
		
	}

}
