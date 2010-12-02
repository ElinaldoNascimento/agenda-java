<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Cadastramento de Novo Contato</title>
</head>
<body>
	<form action="contato" method="get">
	<input type="hidden" name="acao" value="salvar"/>
	<p>
	Nome:<input type="text" name="nome"/>
	</p>
	
	<p>
	Sobrenome:<input type="text" name="sobrenome"/>
	</p>
	<p>
	Endereço:<input type="text" name="endereco"/>
	</p>
	
	<p>
	Numero Apatamento:<input type="text" name="numApat"/>
	</p>
	
	<p>
	Bairro:<input type="text" name="bairro"/>
	</p>
	
	<p>
	Cidade:<input type="text" name="cidade"/>
	</p>
	
	<p>
	Estado:<input type="text" name="estado"/>
	</p>
	
	<p>
	Email:<input type="text" name="email"/>
	</p>
	
	<p>
	Telefone:<input type="text" name="telefone"/>
	</p>
	
	<p>
	Observação<textarea rows="4" cols="20">
	
	</textarea>
	</p>
	<input type="submit" value="gravar"/>
	</form>

</body>
</html>