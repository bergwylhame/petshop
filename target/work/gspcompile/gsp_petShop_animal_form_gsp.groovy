import petshop.Animal
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_petShop_animal_form_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/animal/_form.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
expressionOut.print(hasErrors(bean: animalInstance, field: 'nome', 'error'))
printHtmlPart(1)
invokeTag('message','g',7,['code':("animal.nome.label"),'default':("Nome")],-1)
printHtmlPart(2)
invokeTag('textField','g',10,['name':("nome"),'maxlength':("50"),'required':(""),'value':(animalInstance?.nome)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: animalInstance, field: 'raca', 'error'))
printHtmlPart(4)
invokeTag('message','g',16,['code':("animal.raca.label"),'default':("Raca")],-1)
printHtmlPart(2)
invokeTag('select','g',19,['id':("raca"),'name':("raca.id"),'from':(petshop.Raca.list()),'optionKey':("id"),'required':(""),'value':(animalInstance?.raca?.id),'class':("many-to-one")],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: animalInstance, field: 'cliente', 'error'))
printHtmlPart(5)
invokeTag('message','g',25,['code':("animal.cliente.label"),'default':("Cliente")],-1)
printHtmlPart(2)
invokeTag('select','g',28,['id':("cliente"),'name':("cliente.id"),'from':(petshop.Cliente.list()),'optionKey':("id"),'required':(""),'value':(animalInstance?.cliente?.id),'class':("many-to-one")],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: animalInstance, field: 'idade', 'error'))
printHtmlPart(6)
invokeTag('message','g',34,['code':("animal.idade.label"),'default':("Idade")],-1)
printHtmlPart(2)
invokeTag('field','g',37,['name':("idade"),'type':("number"),'value':(animalInstance.idade),'required':("")],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: animalInstance, field: 'sexo', 'error'))
printHtmlPart(7)
invokeTag('message','g',43,['code':("animal.sexo.label"),'default':("Sexo")],-1)
printHtmlPart(2)
invokeTag('select','g',46,['id':("sexo"),'name':("sexo.id"),'from':(petshop.Sexo.list()),'optionKey':("id"),'required':(""),'value':(animalInstance?.sexo?.id),'class':("many-to-one")],-1)
printHtmlPart(8)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1457366921549L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
