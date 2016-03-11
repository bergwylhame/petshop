
<%@ page import="petshop.Cliente" %>
<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'cliente.label', default: 'Cliente')}" />
		<title><g:message code="default.list.label" args="[entityName]" /></title>
	</head>
	<body>
		<a href="#list-cliente" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
		<div class="nav" role="navigation">
			<ul>
				<li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
				<li><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></li>
			</ul>
		</div>
		<div id="list-cliente" class="content scaffold-list" role="main">
			<h1><g:message code="default.list.label" args="[entityName]" /></h1>
			<g:if test="${flash.message}">
				<div class="message" role="status">${flash.message}</div>
			</g:if>

			<g:form controller="cliente" action="findClienteNome" method="GET">
				<div class="fieldcontain ${hasErrors(bean: atendimentoInstance, field: 'busca', 'error')} required">
					<label for="busca">
						<g:message code="atendimento.servico.label" default="Buscar" />
						<span class="required-indicator">*</span>
					</label>
					<g:textField name="busca" placeholder="Nome, CPF ou Telefone" style="width: 500px; margin-bottom: 20px;"/> <g:submitButton name="Buscar"/>
				</div>
			</g:form>

			<table>
				<thead>
					<tr>

						<g:sortableColumn property="nome" title="${message(code: 'cliente.nome.label', default: 'Nome')}" />

						<g:sortableColumn property="telefone" title="${message(code: 'cliente.telefone.label', default: 'Telefone')}" />

						<g:sortableColumn property="endereco" title="${message(code: 'cliente.endereco.label', default: 'Endereco')}" />

						<g:sortableColumn property="cep" title="${message(code: 'cliente.cep.label', default: 'Cep')}" />

						<g:sortableColumn property="cidade" title="${message(code: 'cliente.cidade.label', default: 'Cidade')}" />

						<g:sortableColumn property="cpf" title="${message(code: 'cliente.cpf.label', default: 'Cpf')}" />

						<g:sortableColumn property="atendimento" title="Opções" />

					</tr>
				</thead>
				<tbody>
				<g:each in="${clienteInstanceList}" status="i" var="clienteInstance">
					<tr class="${(i % 2) == 0 ? 'even' : 'odd'}">
					
						<td><g:link action="show" id="${clienteInstance.id}">${fieldValue(bean: clienteInstance, field: "nome")}</g:link></td>
					
						<td>${fieldValue(bean: clienteInstance, field: "telefone")}</td>
					
						<td>${fieldValue(bean: clienteInstance, field: "endereco")}</td>
					
						<td>${fieldValue(bean: clienteInstance, field: "cep")}</td>
					
						<td>${fieldValue(bean: clienteInstance, field: "cidade")}</td>
					
						<td>${fieldValue(bean: clienteInstance, field: "cpf")}</td>

						<td>
							<g:link controller="atendimento" action="create" params="['cliente.id': clienteInstance?.id]"><asset:image src="atendimento.png" alt="Novo Atendimento"/></g:link>
							<g:link class="edit" action="edit" resource="${clienteInstance}"><asset:image src="editar.png" alt="Editar Cliente"/></g:link>
							<g:link controller="animal" action="create" params="['cliente.id': clienteInstance?.id]"><asset:image src="add.png" alt="Adicionar Animal"/></g:link>
						</td>

					</tr>
				</g:each>
				</tbody>
			</table>
			<div class="pagination">
				<g:paginate total="${clienteInstanceCount ?: 0}" />
			</div>
		</div>
	</body>
</html>
