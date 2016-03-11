import petshop.Cliente
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_petShop_cliente_form_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/cliente/_form.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
expressionOut.print(hasErrors(bean: clienteInstance, field: 'nome', 'error'))
printHtmlPart(1)
invokeTag('message','g',7,['code':("cliente.nome.label"),'default':("Nome")],-1)
printHtmlPart(2)
invokeTag('textField','g',10,['name':("nome"),'maxlength':("70"),'required':(""),'value':(clienteInstance?.nome)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: clienteInstance, field: 'telefone', 'error'))
printHtmlPart(4)
invokeTag('message','g',16,['code':("cliente.telefone.label"),'default':("Telefone")],-1)
printHtmlPart(2)
invokeTag('textField','g',19,['name':("telefone"),'maxlength':("11"),'required':(""),'value':(clienteInstance?.telefone)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: clienteInstance, field: 'endereco', 'error'))
printHtmlPart(5)
invokeTag('message','g',25,['code':("cliente.endereco.label"),'default':("Endereco")],-1)
printHtmlPart(6)
invokeTag('textField','g',28,['name':("endereco"),'value':(clienteInstance?.endereco)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: clienteInstance, field: 'cep', 'error'))
printHtmlPart(7)
invokeTag('message','g',34,['code':("cliente.cep.label"),'default':("Cep")],-1)
printHtmlPart(6)
invokeTag('textField','g',37,['name':("cep"),'value':(clienteInstance?.cep)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: clienteInstance, field: 'cidade', 'error'))
printHtmlPart(8)
invokeTag('message','g',43,['code':("cliente.cidade.label"),'default':("Cidade")],-1)
printHtmlPart(6)
invokeTag('textField','g',46,['name':("cidade"),'value':(clienteInstance?.cidade)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: clienteInstance, field: 'cpf', 'error'))
printHtmlPart(9)
invokeTag('message','g',52,['code':("cliente.cpf.label"),'default':("Cpf")],-1)
printHtmlPart(10)
invokeTag('textField','g',54,['name':("cpf"),'maxlength':("11"),'value':(clienteInstance?.cpf)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: clienteInstance, field: 'email', 'error'))
printHtmlPart(11)
invokeTag('message','g',60,['code':("cliente.email.label"),'default':("Email")],-1)
printHtmlPart(6)
invokeTag('textField','g',63,['name':("email"),'maxlength':("50"),'value':(clienteInstance?.email)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: clienteInstance, field: 'animais', 'error'))
printHtmlPart(12)
invokeTag('message','g',69,['code':("cliente.animais.label"),'default':("Animais")],-1)
printHtmlPart(13)
for( a in (clienteInstance?.animais) ) {
printHtmlPart(14)
createTagBody(2, {->
expressionOut.print(a?.encodeAsHTML())
})
invokeTag('link','g',75,['controller':("animal"),'action':("show"),'id':(a.id)],2)
printHtmlPart(15)
}
printHtmlPart(16)
createTagBody(1, {->
expressionOut.print(message(code: 'default.add.label', args: [message(code: 'animal.label', default: 'Animal')]))
})
invokeTag('link','g',78,['controller':("animal"),'action':("create"),'params':(['cliente.id': clienteInstance?.id])],1)
printHtmlPart(17)
expressionOut.print(hasErrors(bean: clienteInstance, field: 'atendimentos', 'error'))
printHtmlPart(18)
invokeTag('message','g',87,['code':("cliente.atendimentos.label"),'default':("Atendimentos")],-1)
printHtmlPart(13)
for( a in (clienteInstance?.atendimentos) ) {
printHtmlPart(14)
createTagBody(2, {->
expressionOut.print(a?.encodeAsHTML())
})
invokeTag('link','g',93,['controller':("atendimento"),'action':("show"),'id':(a.id)],2)
printHtmlPart(15)
}
printHtmlPart(16)
createTagBody(1, {->
expressionOut.print(message(code: 'default.add.label', args: [message(code: 'atendimento.label', default: 'Atendimento')]))
})
invokeTag('link','g',96,['controller':("atendimento"),'action':("create"),'params':(['cliente.id': clienteInstance?.id])],1)
printHtmlPart(19)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1457632136361L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
