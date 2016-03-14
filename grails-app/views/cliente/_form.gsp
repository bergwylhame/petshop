<%@ page import="petshop.Cliente" %>



<div class="fieldcontain ${hasErrors(bean: clienteInstance, field: 'nome', 'error')} required">
	<label for="nome">
		<g:message code="cliente.nome.label" default="Nome" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="nome" maxlength="70" required="" value="${clienteInstance?.nome}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: clienteInstance, field: 'telefone', 'error')} required">
	<label for="telefone">
		<g:message code="cliente.telefone.label" default="Telefone" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="telefone" maxlength="11" required="" value="${clienteInstance?.telefone}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: clienteInstance, field: 'endereco', 'error')} ">
	<label for="endereco">
		<g:message code="cliente.endereco.label" default="Endereco" />
		
	</label>
	<g:textField name="endereco" value="${clienteInstance?.endereco}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: clienteInstance, field: 'cep', 'error')} ">
	<label for="cep">
		<g:message code="cliente.cep.label" default="CEP" />
		
	</label>
	<g:textField name="cep" value="${clienteInstance?.cep}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: clienteInstance, field: 'cidade', 'error')} ">
	<label for="cidade">
		<g:message code="cliente.cidade.label" default="Cidade" />
		
	</label>
	<g:textField name="cidade" value="${clienteInstance?.cidade}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: clienteInstance, field: 'cpf', 'error')}">
	<label for="cpf">
		<g:message code="cliente.cpf.label" default="CPF" />
	</label>
	<g:textField name="cpf" maxlength="11" value="${clienteInstance?.cpf}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: clienteInstance, field: 'email', 'error')} ">
	<label for="email">
		<g:message code="cliente.email.label" default="Email" />
		
	</label>
	<g:textField name="email" maxlength="50" value="${clienteInstance?.email}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: clienteInstance, field: 'animais', 'error')} ">
	<label for="animais">
		<g:message code="cliente.animais.label" default="Animais" />
		
	</label>
	
<ul class="one-to-many">
<g:each in="${clienteInstance?.animais?}" var="a">
    <li><g:link controller="animal" action="show" id="${a.id}">${a?.encodeAsHTML()}</g:link></li>
</g:each>
<li class="add">
<g:link controller="animal" action="create" params="['cliente.id': clienteInstance?.id]">${message(code: 'default.add.label', args: [message(code: 'animal.label', default: 'Animal')])}</g:link>
</li>
</ul>


</div>

<div class="fieldcontain ${hasErrors(bean: clienteInstance, field: 'atendimentos', 'error')} ">
	<label for="atendimentos">
		<g:message code="cliente.atendimentos.label" default="Atendimentos" />
		
	</label>
	
<ul class="one-to-many">
<g:each in="${clienteInstance?.atendimentos?}" var="a">
    <li><g:link controller="atendimento" action="show" id="${a.id}">${a?.encodeAsHTML()}</g:link></li>
</g:each>
<li class="add">
<g:link controller="atendimento" action="create" params="['cliente.id': clienteInstance?.id]">${message(code: 'default.add.label', args: [message(code: 'atendimento.label', default: 'Atendimento')])}</g:link>
</li>
</ul>


</div>

