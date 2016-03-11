<%@ page import="petshop.Raca" %>



<div class="fieldcontain ${hasErrors(bean: racaInstance, field: 'nome', 'error')} required">
	<label for="nome">
		<g:message code="raca.nome.label" default="Nome" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="nome" maxlength="50" required="" value="${racaInstance?.nome}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: racaInstance, field: 'animais', 'error')} ">
	<label for="animais">
		<g:message code="raca.animais.label" default="Animais" />
		
	</label>
	
<ul class="one-to-many">
<g:each in="${racaInstance?.animais?}" var="a">
    <li><g:link controller="animal" action="show" id="${a.id}">${a?.encodeAsHTML()}</g:link></li>
</g:each>
<li class="add">
<g:link controller="animal" action="create" params="['raca.id': racaInstance?.id]">${message(code: 'default.add.label', args: [message(code: 'animal.label', default: 'Animal')])}</g:link>
</li>
</ul>


</div>

