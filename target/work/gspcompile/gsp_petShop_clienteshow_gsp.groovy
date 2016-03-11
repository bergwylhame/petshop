import petshop.Cliente
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_petShop_clienteshow_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/cliente/show.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
printHtmlPart(1)
createTagBody(1, {->
printHtmlPart(2)
invokeTag('captureMeta','sitemesh',6,['gsp_sm_xmlClosingForEmptyTag':(""),'name':("layout"),'content':("main")],-1)
printHtmlPart(2)
invokeTag('set','g',7,['var':("entityName"),'value':(message(code: 'cliente.label', default: 'Cliente'))],-1)
printHtmlPart(2)
createTagBody(2, {->
createTagBody(3, {->
invokeTag('message','g',8,['code':("default.show.label"),'args':([entityName])],-1)
})
invokeTag('captureTitle','sitemesh',8,[:],3)
})
invokeTag('wrapTitleTag','sitemesh',8,[:],2)
printHtmlPart(3)
})
invokeTag('captureHead','sitemesh',9,[:],1)
printHtmlPart(3)
createTagBody(1, {->
printHtmlPart(4)
invokeTag('message','g',11,['code':("default.link.skip.label"),'default':("Skip to content&hellip;")],-1)
printHtmlPart(5)
expressionOut.print(createLink(uri: '/'))
printHtmlPart(6)
invokeTag('message','g',14,['code':("default.home.label")],-1)
printHtmlPart(7)
createTagBody(2, {->
invokeTag('message','g',15,['code':("default.list.label"),'args':([entityName])],-1)
})
invokeTag('link','g',15,['class':("list"),'action':("index")],2)
printHtmlPart(8)
createTagBody(2, {->
invokeTag('message','g',16,['code':("default.new.label"),'args':([entityName])],-1)
})
invokeTag('link','g',16,['class':("create"),'action':("create")],2)
printHtmlPart(9)
invokeTag('message','g',20,['code':("default.show.label"),'args':([entityName])],-1)
printHtmlPart(10)
if(true && (flash.message)) {
printHtmlPart(11)
expressionOut.print(flash.message)
printHtmlPart(12)
}
printHtmlPart(13)
if(true && (clienteInstance?.nome)) {
printHtmlPart(14)
invokeTag('message','g',28,['code':("cliente.nome.label"),'default':("Nome")],-1)
printHtmlPart(15)
invokeTag('fieldValue','g',30,['bean':(clienteInstance),'field':("nome")],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (clienteInstance?.telefone)) {
printHtmlPart(18)
invokeTag('message','g',37,['code':("cliente.telefone.label"),'default':("Telefone")],-1)
printHtmlPart(19)
invokeTag('fieldValue','g',39,['bean':(clienteInstance),'field':("telefone")],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (clienteInstance?.endereco)) {
printHtmlPart(20)
invokeTag('message','g',46,['code':("cliente.endereco.label"),'default':("Endereco")],-1)
printHtmlPart(21)
invokeTag('fieldValue','g',48,['bean':(clienteInstance),'field':("endereco")],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (clienteInstance?.cep)) {
printHtmlPart(22)
invokeTag('message','g',55,['code':("cliente.cep.label"),'default':("Cep")],-1)
printHtmlPart(23)
invokeTag('fieldValue','g',57,['bean':(clienteInstance),'field':("cep")],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (clienteInstance?.cidade)) {
printHtmlPart(24)
invokeTag('message','g',64,['code':("cliente.cidade.label"),'default':("Cidade")],-1)
printHtmlPart(25)
invokeTag('fieldValue','g',66,['bean':(clienteInstance),'field':("cidade")],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (clienteInstance?.cpf)) {
printHtmlPart(26)
invokeTag('message','g',73,['code':("cliente.cpf.label"),'default':("Cpf")],-1)
printHtmlPart(27)
invokeTag('fieldValue','g',75,['bean':(clienteInstance),'field':("cpf")],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (clienteInstance?.email)) {
printHtmlPart(28)
invokeTag('message','g',82,['code':("cliente.email.label"),'default':("Email")],-1)
printHtmlPart(29)
invokeTag('fieldValue','g',84,['bean':(clienteInstance),'field':("email")],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (clienteInstance?.animais)) {
printHtmlPart(30)
invokeTag('message','g',91,['code':("cliente.animais.label"),'default':("Animais")],-1)
printHtmlPart(31)
for( a in (clienteInstance.animais) ) {
printHtmlPart(32)
createTagBody(4, {->
expressionOut.print(a?.encodeAsHTML())
})
invokeTag('link','g',94,['controller':("animal"),'action':("show"),'id':(a.id)],4)
printHtmlPart(33)
}
printHtmlPart(34)
}
printHtmlPart(17)
if(true && (clienteInstance?.atendimentos)) {
printHtmlPart(35)
invokeTag('message','g',102,['code':("cliente.atendimentos.label"),'default':("Atendimentos")],-1)
printHtmlPart(31)
for( a in (clienteInstance.atendimentos) ) {
printHtmlPart(36)
createTagBody(4, {->
expressionOut.print(a?.encodeAsHTML())
})
invokeTag('link','g',105,['controller':("atendimento"),'action':("show"),'id':(a.id)],4)
printHtmlPart(33)
}
printHtmlPart(34)
}
printHtmlPart(37)
createTagBody(2, {->
printHtmlPart(38)
createTagBody(3, {->
invokeTag('message','g',114,['code':("default.button.edit.label"),'default':("Edit")],-1)
})
invokeTag('link','g',114,['class':("edit"),'action':("edit"),'resource':(clienteInstance)],3)
printHtmlPart(39)
invokeTag('actionSubmit','g',115,['class':("delete"),'action':("delete"),'value':(message(code: 'default.button.delete.label', default: 'Delete')),'onclick':("return confirm('${message(code: 'default.button.delete.confirm.message', default: 'Are you sure?')}');")],-1)
printHtmlPart(40)
})
invokeTag('form','g',117,['url':([resource:clienteInstance, action:'delete']),'method':("DELETE")],2)
printHtmlPart(41)
})
invokeTag('captureBody','sitemesh',119,[:],1)
printHtmlPart(42)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1457451327047L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
