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
expressionOut.print(hasErrors(bean: atendimentoInstance, field: 'cliente', 'error'))
printHtmlPart(1)
invokeTag('message','g',5,['code':("atendimento.cliente.label"),'default':("Cliente")],-1)
printHtmlPart(2)
invokeTag('select','g',8,['id':("cliente"),'name':("cliente.id"),'from':(petshop.Cliente.list()),'optionKey':("id"),'required':(""),'value':(atendimentoInstance?.cliente?.id),'class':("many-to-one")],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: atendimentoInstance, field: 'animal', 'error'))
printHtmlPart(4)
invokeTag('message','g',14,['code':("atendimento.animal.label"),'default':("Animal")],-1)
printHtmlPart(2)
invokeTag('select','g',17,['id':("animal"),'name':("animal.id"),'from':(petshop.Animal.list()),'optionKey':("id"),'required':(""),'value':(atendimentoInstance?.animal?.id),'class':("many-to-one")],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: atendimentoInstance, field: 'data', 'error'))
printHtmlPart(5)
invokeTag('message','g',23,['code':("atendimento.data.label"),'default':("Data")],-1)
printHtmlPart(2)
invokeTag('datePicker','g',26,['name':("data"),'precision':("minute"),'value':(atendimentoInstance?.data)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: atendimentoInstance, field: 'servico', 'error'))
printHtmlPart(6)
invokeTag('message','g',32,['code':("atendimento.servico.label"),'default':("Servico")],-1)
printHtmlPart(2)
invokeTag('select','g',35,['id':("servico"),'name':("servico.id"),'from':(petshop.Servico.list()),'optionKey':("id"),'required':(""),'value':(atendimentoInstance?.servico?.id),'class':("many-to-one")],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: atendimentoInstance, field: 'valor', 'error'))
printHtmlPart(7)
invokeTag('message','g',41,['code':("atendimento.valor.label"),'default':("Valor")],-1)
printHtmlPart(2)
invokeTag('field','g',44,['name':("valor"),'value':(fieldValue(bean: atendimentoInstance, field: 'valor')),'required':("")],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: atendimentoInstance, field: 'observacao', 'error'))
printHtmlPart(8)
invokeTag('message','g',50,['code':("atendimento.observacao.label"),'default':("Observacao")],-1)
printHtmlPart(9)
invokeTag('textField','g',53,['name':("observacao"),'maxlength':("150"),'value':(atendimentoInstance?.observacao)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: atendimentoInstance, field: 'concluido', 'error'))
printHtmlPart(10)
invokeTag('message','g',59,['code':("atendimento.concluido.label"),'default':("Concluido")],-1)
printHtmlPart(9)
invokeTag('checkBox','g',62,['name':("concluido"),'value':(atendimentoInstance?.concluido)],-1)
printHtmlPart(11)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1457622534684L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
