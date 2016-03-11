import petshop.Cliente
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_petShop_clienteindex_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/cliente/index.gsp" }
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
invokeTag('message','g',8,['code':("default.list.label"),'args':([entityName])],-1)
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
invokeTag('message','g',15,['code':("default.new.label"),'args':([entityName])],-1)
})
invokeTag('link','g',15,['class':("create"),'action':("create")],2)
printHtmlPart(8)
invokeTag('message','g',19,['code':("default.list.label"),'args':([entityName])],-1)
printHtmlPart(9)
if(true && (flash.message)) {
printHtmlPart(10)
expressionOut.print(flash.message)
printHtmlPart(11)
}
printHtmlPart(12)
createTagBody(2, {->
printHtmlPart(13)
expressionOut.print(hasErrors(bean: atendimentoInstance, field: 'busca', 'error'))
printHtmlPart(14)
invokeTag('message','g',27,['code':("atendimento.servico.label"),'default':("Buscar")],-1)
printHtmlPart(15)
invokeTag('textField','g',30,['name':("busca"),'placeholder':("Nome, CPF ou Telefone"),'style':("width: 500px; margin-bottom: 20px;")],-1)
printHtmlPart(16)
invokeTag('submitButton','g',30,['name':("Buscar")],-1)
printHtmlPart(17)
})
invokeTag('form','g',32,['controller':("cliente"),'action':("findClienteNome"),'method':("GET")],2)
printHtmlPart(18)
invokeTag('sortableColumn','g',38,['property':("nome"),'title':(message(code: 'cliente.nome.label', default: 'Nome'))],-1)
printHtmlPart(19)
invokeTag('sortableColumn','g',40,['property':("telefone"),'title':(message(code: 'cliente.telefone.label', default: 'Telefone'))],-1)
printHtmlPart(19)
invokeTag('sortableColumn','g',42,['property':("endereco"),'title':(message(code: 'cliente.endereco.label', default: 'Endereco'))],-1)
printHtmlPart(19)
invokeTag('sortableColumn','g',44,['property':("cep"),'title':(message(code: 'cliente.cep.label', default: 'Cep'))],-1)
printHtmlPart(19)
invokeTag('sortableColumn','g',46,['property':("cidade"),'title':(message(code: 'cliente.cidade.label', default: 'Cidade'))],-1)
printHtmlPart(19)
invokeTag('sortableColumn','g',48,['property':("cpf"),'title':(message(code: 'cliente.cpf.label', default: 'Cpf'))],-1)
printHtmlPart(19)
invokeTag('sortableColumn','g',50,['property':("atendimento"),'title':("Opções")],-1)
printHtmlPart(20)
loop:{
int i = 0
for( clienteInstance in (clienteInstanceList) ) {
printHtmlPart(21)
expressionOut.print((i % 2) == 0 ? 'even' : 'odd')
printHtmlPart(22)
createTagBody(3, {->
expressionOut.print(fieldValue(bean: clienteInstance, field: "nome"))
})
invokeTag('link','g',58,['action':("show"),'id':(clienteInstance.id)],3)
printHtmlPart(23)
expressionOut.print(fieldValue(bean: clienteInstance, field: "telefone"))
printHtmlPart(23)
expressionOut.print(fieldValue(bean: clienteInstance, field: "endereco"))
printHtmlPart(23)
expressionOut.print(fieldValue(bean: clienteInstance, field: "cep"))
printHtmlPart(23)
expressionOut.print(fieldValue(bean: clienteInstance, field: "cidade"))
printHtmlPart(23)
expressionOut.print(fieldValue(bean: clienteInstance, field: "cpf"))
printHtmlPart(24)
createTagBody(3, {->
invokeTag('image','asset',71,['src':("atendimento.png"),'alt':("Novo Atendimento")],-1)
})
invokeTag('link','g',71,['controller':("atendimento"),'action':("create"),'params':(['cliente.id': clienteInstance?.id])],3)
printHtmlPart(25)
createTagBody(3, {->
invokeTag('image','asset',72,['src':("editar.png"),'alt':("Editar Cliente")],-1)
})
invokeTag('link','g',72,['class':("edit"),'action':("edit"),'resource':(clienteInstance)],3)
printHtmlPart(25)
createTagBody(3, {->
invokeTag('image','asset',73,['src':("add.png"),'alt':("Adicionar Animal")],-1)
})
invokeTag('link','g',73,['controller':("animal"),'action':("create"),'params':(['cliente.id': clienteInstance?.id])],3)
printHtmlPart(26)
i++
}
}
printHtmlPart(27)
invokeTag('paginate','g',81,['total':(clienteInstanceCount ?: 0)],-1)
printHtmlPart(28)
})
invokeTag('captureBody','sitemesh',84,[:],1)
printHtmlPart(29)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1457627816157L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
