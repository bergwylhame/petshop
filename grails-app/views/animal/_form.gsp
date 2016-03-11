<%@ page import="petshop.Animal" %>



<div class="fieldcontain ${hasErrors(bean: animalInstance, field: 'nome', 'error')} required">
	<label for="nome">
		<g:message code="animal.nome.label" default="Nome" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="nome" maxlength="50" required="" value="${animalInstance?.nome}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: animalInstance, field: 'raca', 'error')} required">
	<label for="raca">
		<g:message code="animal.raca.label" default="Raca" />
		<span class="required-indicator">*</span>
	</label>
	<g:select id="raca" name="raca.id" from="${petshop.Raca.list()}" optionKey="id" required="" value="${animalInstance?.raca?.id}" class="many-to-one"/>

</div>

<div class="fieldcontain ${hasErrors(bean: animalInstance, field: 'cliente', 'error')} required">
	<label for="cliente">
		<g:message code="animal.cliente.label" default="Cliente" />
		<span class="required-indicator">*</span>
	</label>
	<g:select id="cliente" name="cliente.id" from="${petshop.Cliente.list()}" optionKey="id" required="" value="${animalInstance?.cliente?.id}" class="many-to-one"/>

</div>

<div class="fieldcontain ${hasErrors(bean: animalInstance, field: 'idade', 'error')} required">
	<label for="idade">
		<g:message code="animal.idade.label" default="Idade" />
		<span class="required-indicator">*</span>
	</label>
	<g:field name="idade" type="number" value="${animalInstance.idade}" required=""/>

</div>

<div class="fieldcontain ${hasErrors(bean: animalInstance, field: 'sexo', 'error')} required">
	<label for="sexo">
		<g:message code="animal.sexo.label" default="Sexo" />
		<span class="required-indicator">*</span>
	</label>
	<g:select id="sexo" name="sexo.id" from="${petshop.Sexo.list()}" optionKey="id" required="" value="${animalInstance?.sexo?.id}" class="many-to-one"/>

</div>

