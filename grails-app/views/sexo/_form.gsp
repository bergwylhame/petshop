<%@ page import="petshop.Sexo" %>



<div class="fieldcontain ${hasErrors(bean: sexoInstance, field: 'nome', 'error')} required">
	<label for="nome">
		<g:message code="sexo.nome.label" default="Nome" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="nome" required="" value="${sexoInstance?.nome}"/>

</div>

