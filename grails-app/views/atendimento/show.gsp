
<%@ page import="petshop.Atendimento" %>
<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'atendimento.label', default: 'Atendimento')}" />
		<title><g:message code="default.show.label" args="[entityName]" /></title>
	</head>
	<body>
		<a href="#show-atendimento" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
		<div class="nav" role="navigation">
			<ul>
				<li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
				<li><g:link class="list" action="index"><g:message code="default.list.label" args="[entityName]" /></g:link></li>
				<li><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></li>
			</ul>
		</div>
		<div id="show-atendimento" class="content scaffold-show" role="main">
			<h1><g:message code="default.show.label" args="[entityName]" /></h1>
			<g:if test="${flash.message}">
			<div class="message" role="status">${flash.message}</div>
			</g:if>
			<ol class="property-list atendimento">

				<g:if test="${atendimentoInstance?.cliente}">
					<li class="fieldcontain">
						<span id="cliente-label" class="property-label"><g:message code="atendimento.cliente.label" default="Cliente" /></span>

						<span class="property-value" aria-labelledby="cliente-label"><g:link controller="cliente" action="show" id="${atendimentoInstance?.cliente?.id}">${atendimentoInstance?.cliente?.encodeAsHTML()}</g:link></span>

					</li>
				</g:if>

				<g:if test="${atendimentoInstance?.animal}">
					<li class="fieldcontain">
						<span id="animal-label" class="property-label"><g:message code="atendimento.animal.label" default="Animal" /></span>

						<span class="property-value" aria-labelledby="animal-label"><g:link controller="animal" action="show" id="${atendimentoInstance?.animal?.id}">${atendimentoInstance?.animal?.encodeAsHTML()}</g:link></span>

					</li>
				</g:if>

				<g:if test="${atendimentoInstance?.data}">
					<li class="fieldcontain">
						<span id="data-label" class="property-label"><g:message code="atendimento.data.label" default="Data" /></span>

						<span class="property-value" aria-labelledby="data-label"><g:formatDate date="${atendimentoInstance?.data}" /></span>

					</li>
				</g:if>

				<g:if test="${atendimentoInstance?.servico}">
					<li class="fieldcontain">
						<span id="servico-label" class="property-label"><g:message code="atendimento.servico.label" default="Servico" /></span>

						<span class="property-value" aria-labelledby="servico-label"><g:link controller="servico" action="show" id="${atendimentoInstance?.servico?.id}">${atendimentoInstance?.servico?.encodeAsHTML()}</g:link></span>

					</li>
				</g:if>

				<g:if test="${atendimentoInstance?.observacao}">
				<li class="fieldcontain">
					<span id="observacao-label" class="property-label"><g:message code="atendimento.observacao.label" default="Observacao" /></span>
					
						<span class="property-value" aria-labelledby="observacao-label"><g:fieldValue bean="${atendimentoInstance}" field="observacao"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${atendimentoInstance?.valor}">
				<li class="fieldcontain">
					<span id="valor-label" class="property-label"><g:message code="atendimento.valor.label" default="Valor" /></span>
					
						<span class="property-value" aria-labelledby="valor-label"><g:fieldValue bean="${atendimentoInstance}" field="valor"/></span>
					
				</li>
				</g:if>

				<g:if test="${atendimentoInstance?.concluido}">
					<li class="fieldcontain">
						<span id="concluido-label" class="property-label"><g:message code="atendimento.concluido.label" default="Concluido" /></span>

						<span class="property-value" aria-labelledby="concluido-label"><g:formatBoolean boolean="${atendimentoInstance?.concluido}" /></span>

					</li>
				</g:if>

			</ol>

			<g:form url="[resource:atendimentoInstance, action:'delete']" method="DELETE">
				<fieldset class="buttons">
					<g:link class="edit" action="edit" resource="${atendimentoInstance}"><g:message code="default.button.edit.label" default="Edit" /></g:link>
					<g:actionSubmit class="delete" action="delete" value="${message(code: 'default.button.delete.label', default: 'Delete')}" onclick="return confirm('${message(code: 'default.button.delete.confirm.message', default: 'Are you sure?')}');" />
				</fieldset>
			</g:form>
		</div>
	</body>
</html>
