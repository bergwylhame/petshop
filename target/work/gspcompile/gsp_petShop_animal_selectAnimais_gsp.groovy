import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_petShop_animal_selectAnimais_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/animal/_selectAnimais.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
expressionOut.print(hasErrors(bean: atendimentoInstance, field: 'animal', 'error'))
printHtmlPart(1)
invokeTag('message','g',3,['code':("atendimento.animal.label"),'default':("Animal")],-1)
printHtmlPart(2)
if(true && ("$animaisList")) {
printHtmlPart(3)
invokeTag('select','g',7,['id':("animal"),'name':("animal.id"),'from':(animaisList),'optionKey':("id"),'required':(""),'value':(atendimentoInstance?.animal?.id),'class':("many-to-one")],-1)
printHtmlPart(4)
}
else {
printHtmlPart(5)
}
printHtmlPart(6)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1457969357487L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
