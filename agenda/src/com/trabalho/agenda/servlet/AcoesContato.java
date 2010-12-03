package com.trabalho.agenda.servlet;

import java.sql.SQLException;
import java.util.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.trabalho.agenda.bean.Contato;
import com.trabalho.agenda.bean.Pessoa;
import com.trabalho.agenda.bean.Telefone;
import com.trabalho.agenda.dao.ContatoDao;
import com.trabalho.agenda.dao.DaoFactory;

public class AcoesContato {
	

	private static Pessoa mapContato(HttpServletRequest request){
		
		Contato contato = new Contato();
		Pessoa pessoa = new Pessoa();
		
		String nome = request.getParameter("nome");
		String sobrenome = request.getParameter("sobrenome");
		String endereco = request.getParameter("endereco");
		String aptNo = request.getParameter("numApat");
		String bairro = request.getParameter("bairro");
		String cidade = request.getParameter("cidade");
		String Cep = request.getParameter("cep");
		String estado = request.getParameter("estado");
		String email = request.getParameter("email");
		String telefone = request.getParameter("telefone");
		String observacao = request.getParameter("observacao");
		
		
		Telefone tele = new Telefone();
		tele.setNumero(telefone);
		
		List<Telefone> telefones = new ArrayList<Telefone>();
		telefones.add(tele);
		pessoa.setNome(nome);
		pessoa.setSobrenome(sobrenome);
		contato.setEndereco(endereco);
		contato.setAptNo(aptNo);
		contato.setBairro(bairro);
		contato.setCEP(Cep);
		contato.setCidade(cidade);
		contato.setTelefones(telefones);
		contato.setEstado(estado);
		contato.setObservacao(observacao);
		contato.setEmail(email);
		pessoa.setContato(contato);
		return pessoa;
		
	}

	public static String salvar(HttpServletRequest request,
			HttpServletResponse response) throws SQLException {
		Pessoa pessoa = mapContato(request);

		
		DaoFactory dao = new DaoFactory();
		
		
		
		dao.getContatoDao().salvar(pessoa.getContato());
		pessoa.setContato(dao.getContatoDao().lastIdContato());
		dao.getPessoaDao().salvar(pessoa);
		
		 
		return "salvo.jsp";
		
	}

	public static String listarTodos(HttpServletRequest request,
			HttpServletResponse response) {

		DaoFactory dao = new DaoFactory();
		List<Pessoa> pessoas  = new ArrayList<Pessoa>();
		
		pessoas = dao.getPessoaDao().getAll();
		
		request.setAttribute("pessoas", pessoas);
		
		return "listarContatos.jsp";
		
	}
	
	
	

}
