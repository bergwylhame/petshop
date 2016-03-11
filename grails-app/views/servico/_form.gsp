<%@ page import="petshop.Servico" %>



<div class="fieldcontain ${hasErrors(bean: servicoInstance, field: 'nome', 'error')} required">
	<label for="nome">
		<g:message code="servico.nome.label" default="Nome" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="nome" maxlength="30" required="" value="${servicoInstance?.nome}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: servicoInstance, field: 'descricao', 'error')} ">
	<label for="descricao">
		<g:message code="servico.descricao.label" default="Descricao" />
		
	</label>
	<g:textField name="descricao" maxlength="100" value="${servicoInstance?.descricao}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: servicoInstance, field: 'atendimento', 'error')} ">
	<label for="atendimento">
		<g:message code="servico.atendimento.label" default="Atendimento" />
		
	</label>
	
<ul class="one-to-many">
<g:each in="${servicoInstance?.atendimento?}" var="a">
    <li><g:link controller="atendimento" action="show" id="${a.id}">${a?.encodeAsHTML()}</g:link></li>
</g:each>
<li class="add">
<g:link controller="atendimento" action="create" params="['servico.id': servicoInstance?.id]">${message(code: 'default.add.label', args: [message(code: 'atendimento.label', default: 'Atendimento')])}</g:link>
</li>
</ul>


</div>

