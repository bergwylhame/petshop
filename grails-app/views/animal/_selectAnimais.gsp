<div class="fieldcontain ${hasErrors(bean: atendimentoInstance, field: 'animal', 'error')} required">
    <label for="animal">
        <g:message code="atendimento.animal.label" default="Animal" />
        <span class="required-indicator">*</span>
    </label>
    <g:if test="$animaisList">
        <g:select id="animal" name="animal.id" from="${animaisList}" optionKey="id" required="" value="${atendimentoInstance?.animal?.id}" class="many-to-one"/>
    </g:if>
    <g:else>
        Nenhum animal selecionado.
    </g:else>

</div>