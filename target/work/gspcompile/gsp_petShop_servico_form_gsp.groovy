import petshop.Servico
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_petShop_servico_form_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/servico/_form.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
expressionOut.print(hasErrors(bean: servicoInstance, field: 'nome', 'error'))
printHtmlPart(1)
invokeTag('message','g',7,['code':("servico.nome.label"),'default':("Nome")],-1)
printHtmlPart(2)
invokeTag('textField','g',10,['name':("nome"),'maxlength':("30"),'required':(""),'value':(servicoInstance?.nome)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: servicoInstance, field: 'descricao', 'error'))
printHtmlPart(4)
invokeTag('message','g',16,['code':("servico.descricao.label"),'default':("Descricao")],-1)
printHtmlPart(5)
invokeTag('textField','g',19,['name':("descricao"),'maxlength':("100"),'value':(servicoInstance?.descricao)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: servicoInstance, field: 'atendimento', 'error'))
printHtmlPart(6)
invokeTag('message','g',25,['code':("servico.atendimento.label"),'default':("Atendimento")],-1)
printHtmlPart(7)
for( a in (servicoInstance?.atendimento) ) {
printHtmlPart(8)
createTagBody(2, {->
expressionOut.print(a?.encodeAsHTML())
})
invokeTag('link','g',31,['controller':("atendimento"),'action':("show"),'id':(a.id)],2)
printHtmlPart(9)
}
printHtmlPart(10)
createTagBody(1, {->
expressionOut.print(message(code: 'default.add.label', args: [message(code: 'atendimento.label', default: 'Atendimento')]))
})
invokeTag('link','g',34,['controller':("atendimento"),'action':("create"),'params':(['servico.id': servicoInstance?.id])],1)
printHtmlPart(11)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1457367020323L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
