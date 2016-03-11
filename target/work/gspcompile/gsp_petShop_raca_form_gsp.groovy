import petshop.Raca
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_petShop_raca_form_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/raca/_form.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
expressionOut.print(hasErrors(bean: racaInstance, field: 'nome', 'error'))
printHtmlPart(1)
invokeTag('message','g',7,['code':("raca.nome.label"),'default':("Nome")],-1)
printHtmlPart(2)
invokeTag('textField','g',10,['name':("nome"),'maxlength':("50"),'required':(""),'value':(racaInstance?.nome)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: racaInstance, field: 'animais', 'error'))
printHtmlPart(4)
invokeTag('message','g',16,['code':("raca.animais.label"),'default':("Animais")],-1)
printHtmlPart(5)
for( a in (racaInstance?.animais) ) {
printHtmlPart(6)
createTagBody(2, {->
expressionOut.print(a?.encodeAsHTML())
})
invokeTag('link','g',22,['controller':("animal"),'action':("show"),'id':(a.id)],2)
printHtmlPart(7)
}
printHtmlPart(8)
createTagBody(1, {->
expressionOut.print(message(code: 'default.add.label', args: [message(code: 'animal.label', default: 'Animal')]))
})
invokeTag('link','g',25,['controller':("animal"),'action':("create"),'params':(['raca.id': racaInstance?.id])],1)
printHtmlPart(9)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1457366834021L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
