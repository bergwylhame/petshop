
<%@ page import="petshop.Atendimento" %>
<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'atendimento.label', default: 'Atendimento')}" />
		<title><g:message code="default.list.label" args="[entityName]" /></title>
	</head>
	<body>
		<a href="#list-atendimento" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
		<div class="nav" role="navigation">
			<ul>
				<li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
				<li><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></li>
			</ul>
		</div>
		<div id="list-atendimento" class="content scaffold-list" role="main">
			<h1><g:message code="default.list.label" args="[entityName]" /></h1>
			<g:if test="${flash.message}">
				<div class="message" role="status">${flash.message}</div>
			</g:if>
			<table>
			<thead>
					<tr>

						<th><g:message code="atendimento.cliente.label" default="Cliente" /></th>

						<th><g:message code="atendimento.animal.label" default="Animal" /></th>

						<g:sortableColumn property="data" title="${message(code: 'atendimento.data.label', default: 'Data')}" />

						<g:sortableColumn property="valor" title="${message(code: 'atendimento.valor.label', default: 'Valor')}" />
					
						<g:sortableColumn property="observacao" title="${message(code: 'atendimento.observacao.label', default: 'Observacao')}" />
					
						<g:sortableColumn property="concluido" title="${message(code: 'atendimento.concluido.label', default: 'Concluido')}" />
					
					</tr>
				</thead>
				<tbody>
				<g:each in="${atendimentoInstanceList}" status="i" var="atendimentoInstance">
					<tr class="${(i % 2) == 0 ? 'even' : 'odd'}">

						<td><g:link action="show" id="${atendimentoInstance.id}">${fieldValue(bean: atendimentoInstance, field: "cliente")}</td>

						<td>${fieldValue(bean: atendimentoInstance, field: "animal")}</td>

						<td><g:formatDate date="${atendimentoInstance.data}" /></td>

						<td>${fieldValue(bean: atendimentoInstance, field: "valor")}</td>
					
						<td>${fieldValue(bean: atendimentoInstance, field: "observacao")}</g:link></td>
					
						<td><g:formatBoolean boolean="${atendimentoInstance.concluido}" /></td>
					
					</tr>
				</g:each>
				</tbody>
			</table>
			<div class="pagination">
				<g:paginate total="${atendimentoInstanceCount ?: 0}" />
			</div>
		</div>
	</body>
</html>
