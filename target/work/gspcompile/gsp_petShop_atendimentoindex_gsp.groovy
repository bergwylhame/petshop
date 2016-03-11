import petshop.Atendimento
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_petShop_atendimentoindex_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/atendimento/index.gsp" }
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
invokeTag('set','g',7,['var':("entityName"),'value':(message(code: 'atendimento.label', default: 'Atendimento'))],-1)
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
invokeTag('message','g',27,['code':("atendimento.cliente.label"),'default':("Cliente")],-1)
printHtmlPart(13)
invokeTag('message','g',29,['code':("atendimento.animal.label"),'default':("Animal")],-1)
printHtmlPart(14)
invokeTag('sortableColumn','g',31,['property':("data"),'title':(message(code: 'atendimento.data.label', default: 'Data'))],-1)
printHtmlPart(15)
invokeTag('sortableColumn','g',33,['property':("valor"),'title':(message(code: 'atendimento.valor.label', default: 'Valor'))],-1)
printHtmlPart(16)
invokeTag('sortableColumn','g',35,['property':("observacao"),'title':(message(code: 'atendimento.observacao.label', default: 'Observacao'))],-1)
printHtmlPart(16)
invokeTag('sortableColumn','g',37,['property':("concluido"),'title':(message(code: 'atendimento.concluido.label', default: 'Concluido'))],-1)
printHtmlPart(17)
loop:{
int i = 0
for( atendimentoInstance in (atendimentoInstanceList) ) {
printHtmlPart(18)
expressionOut.print((i % 2) == 0 ? 'even' : 'odd')
printHtmlPart(19)
createTagBody(3, {->
expressionOut.print(fieldValue(bean: atendimentoInstance, field: "cliente"))
printHtmlPart(20)
expressionOut.print(fieldValue(bean: atendimentoInstance, field: "animal"))
printHtmlPart(20)
invokeTag('formatDate','g',49,['date':(atendimentoInstance.data)],-1)
printHtmlPart(20)
expressionOut.print(fieldValue(bean: atendimentoInstance, field: "valor"))
printHtmlPart(21)
expressionOut.print(fieldValue(bean: atendimentoInstance, field: "observacao"))
})
invokeTag('link','g',53,['action':("show"),'id':(atendimentoInstance.id)],3)
printHtmlPart(21)
invokeTag('formatBoolean','g',55,['boolean':(atendimentoInstance.concluido)],-1)
printHtmlPart(22)
i++
}
}
printHtmlPart(23)
invokeTag('paginate','g',62,['total':(atendimentoInstanceCount ?: 0)],-1)
printHtmlPart(24)
})
invokeTag('captureBody','sitemesh',65,[:],1)
printHtmlPart(25)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1457451327073L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
