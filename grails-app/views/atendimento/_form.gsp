<%@ page import="petshop.Atendimento" %>

<div class="fieldcontain ${hasErrors(bean: atendimentoInstance, field: 'cliente', 'error')} required">
	<label for="cliente">
		<g:message code="atendimento.cliente.label" default="Cliente" />
		<span class="required-indicator">*</span>
	</label>
	<g:select id="cliente" name="cliente.id" from="${petshop.Cliente.list()}" optionKey="id" required="" value="${atendimentoInstance?.cliente?.id}" class="many-to-one"/>

</div>

<div class="fieldcontain ${hasErrors(bean: atendimentoInstance, field: 'animal', 'error')} required">
	<label for="animal">
		<g:message code="atendimento.animal.label" default="Animal" />
		<span class="required-indicator">*</span>
	</label>
	<g:select id="animal" name="animal.id" from="${petshop.Animal.list()}" optionKey="id" required="" value="${atendimentoInstance?.animal?.id}" class="many-to-one"/>

</div>

<div class="fieldcontain ${hasErrors(bean: atendimentoInstance, field: 'data', 'error')} required">
	<label for="data">
		<g:message code="atendimento.data.label" default="Data" />
		<span class="required-indicator">*</span>
	</label>
	<g:datePicker name="data" precision="minute"  value="${atendimentoInstance?.data}"  />

</div>

<div class="fieldcontain ${hasErrors(bean: atendimentoInstance, field: 'servico', 'error')} required">
	<label for="servico">
		<g:message code="atendimento.servico.label" default="Servico" />
		<span class="required-indicator">*</span>
	</label>
	<g:select id="servico" name="servico.id" from="${petshop.Servico.list()}" optionKey="id" required="" value="${atendimentoInstance?.servico?.id}" class="many-to-one"/>

</div>

<div class="fieldcontain ${hasErrors(bean: atendimentoInstance, field: 'valor', 'error')} required">
	<label for="valor">
		<g:message code="atendimento.valor.label" default="Valor" />
		<span class="required-indicator">*</span>
	</label>
	<g:field name="valor" value="${fieldValue(bean: atendimentoInstance, field: 'valor')}" required=""/>

</div>

<div class="fieldcontain ${hasErrors(bean: atendimentoInstance, field: 'observacao', 'error')} ">
	<label for="observacao">
		<g:message code="atendimento.observacao.label" default="Observacao" />

	</label>
	<g:textField name="observacao" maxlength="150" value="${atendimentoInstance?.observacao}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: atendimentoInstance, field: 'concluido', 'error')} ">
	<label for="concluido">
		<g:message code="atendimento.concluido.label" default="Concluido" />

	</label>
	<g:checkBox name="concluido" value="${atendimentoInstance?.concluido}" />

</div>

