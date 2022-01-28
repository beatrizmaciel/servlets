<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.List, br.com.bibs.gerenciador.servlet.Empresa" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%-- usamos o taglib para importar a biblioteca e, por padrão, o nome 
do prefix costuma ser "c", mas poderia ser qualquer outro nome --%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Java Standart Taglib</title>
</head>
<body>

	<c:if test="${not empty empresa}">
		
		Empresa ${ empresa } cadastrada com sucesso!
		
	</c:if>

	Lista de empresas: <br />
	
	
	<ul>
		<%-- a sintaxe abaixo pega o c do prefix da lib --%>
		<c:forEach items="${empresas}" var="empresa">
			
			<%-- não é preciso deixar ${ empresa.getNome() }, podemos simplificar --%>
			<li>
				${empresa.nome} - 
				<fmt:formatDate value="${empresa.dataAbertura}" pattern="dd/mm/yyyy"/>
				<a href="/gerenciador/mostraEmpresa?id=${empresa.id}">editar</a>
				<%-- enviar parâmetro de requisição: ?id="${param}" --%>
				<a href="/gerenciador/removeEmpresa?id=${empresa.id}">remover</a>
			</li>
			
		</c:forEach>
	</ul>
	
</body>
</html>