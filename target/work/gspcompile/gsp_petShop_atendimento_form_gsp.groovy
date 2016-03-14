import petshop.Atendimento
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_petShop_atendimento_form_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/atendimento/_form.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
invokeTag('setProvider','g',2,['library':("jquery")],-1)
printHtmlPart(1)
expressionOut.print(hasErrors(bean: atendimentoInstance, field: 'cliente', 'error'))
printHtmlPart(2)
invokeTag('message','g',6,['code':("atendimento.cliente.label"),'default':("Cliente")],-1)
printHtmlPart(3)
invokeTag('select','g',17,['id':("cliente"),'name':("cliente.id"),'from':(petshop.Cliente.list()),'optionKey':("id"),'required':(""),'noSelection':(['':'Selecione o cliente']),'onchange':(remoteFunction(
					  controller: 'animal',
					  action: 'getAnimais',
					  params: '\'id=\' + this.value',
					  update: 'animalDiv'
			  )),'value':(atendimentoInstance?.cliente?.id),'class':("many-to-one")],-1)
printHtmlPart(4)
if(true && ("$atendimentoInstance.animal")) {
printHtmlPart(5)
invokeTag('include','g',22,['controller':("animal"),'action':("getAnimais"),'id':(atendimentoInstance?.animal?.cliente?.id)],-1)
printHtmlPart(6)
}
printHtmlPart(7)
expressionOut.print(hasErrors(bean: atendimentoInstance, field: 'data', 'error'))
printHtmlPart(8)
invokeTag('message','g',28,['code':("atendimento.data.label"),'default':("Data")],-1)
printHtmlPart(3)
invokeTag('datePicker','g',31,['name':("data"),'precision':("minute"),'value':(atendimentoInstance?.data)],-1)
printHtmlPart(9)
expressionOut.print(hasErrors(bean: atendimentoInstance, field: 'servico', 'error'))
printHtmlPart(10)
invokeTag('message','g',37,['code':("atendimento.servico.label"),'default':("Servico")],-1)
printHtmlPart(3)
invokeTag('select','g',40,['id':("servico"),'name':("servico.id"),'from':(petshop.Servico.list()),'optionKey':("id"),'required':(""),'value':(atendimentoInstance?.servico?.id),'class':("many-to-one")],-1)
printHtmlPart(9)
expressionOut.print(hasErrors(bean: atendimentoInstance, field: 'valor', 'error'))
printHtmlPart(11)
invokeTag('message','g',46,['code':("atendimento.valor.label"),'default':("Valor")],-1)
printHtmlPart(3)
invokeTag('field','g',49,['name':("valor"),'value':(fieldValue(bean: atendimentoInstance, field: 'valor')),'required':("")],-1)
printHtmlPart(9)
expressionOut.print(hasErrors(bean: atendimentoInstance, field: 'observacao', 'error'))
printHtmlPart(12)
invokeTag('message','g',55,['code':("atendimento.observacao.label"),'default':("Observacao")],-1)
printHtmlPart(13)
invokeTag('textField','g',58,['name':("observacao"),'maxlength':("150"),'value':(atendimentoInstance?.observacao)],-1)
printHtmlPart(9)
expressionOut.print(hasErrors(bean: atendimentoInstance, field: 'concluido', 'error'))
printHtmlPart(14)
invokeTag('message','g',64,['code':("atendimento.concluido.label"),'default':("Concluido")],-1)
printHtmlPart(13)
invokeTag('checkBox','g',67,['name':("concluido"),'value':(atendimentoInstance?.concluido)],-1)
printHtmlPart(15)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1457969108649L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
