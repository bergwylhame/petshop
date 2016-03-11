package petshop



import static org.springframework.http.HttpStatus.*
import grails.transaction.Transactional

@Transactional(readOnly = true)
class RacaController {

    static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]

    def index(Integer max) {
        params.max = Math.min(max ?: 10, 100)
        respond Raca.list(params), model:[racaInstanceCount: Raca.count()]
    }

    def show(Raca racaInstance) {
        respond racaInstance
    }

    def create() {
        respond new Raca(params)
    }

    @Transactional
    def save(Raca racaInstance) {
        if (racaInstance == null) {
            notFound()
            return
        }

        if (racaInstance.hasErrors()) {
            respond racaInstance.errors, view:'create'
            return
        }

        racaInstance.save flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.created.message', args: [message(code: 'raca.label', default: 'Raca'), racaInstance.id])
                redirect racaInstance
            }
            '*' { respond racaInstance, [status: CREATED] }
        }
    }

    def edit(Raca racaInstance) {
        respond racaInstance
    }

    @Transactional
    def update(Raca racaInstance) {
        if (racaInstance == null) {
            notFound()
            return
        }

        if (racaInstance.hasErrors()) {
            respond racaInstance.errors, view:'edit'
            return
        }

        racaInstance.save flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.updated.message', args: [message(code: 'Raca.label', default: 'Raca'), racaInstance.id])
                redirect racaInstance
            }
            '*'{ respond racaInstance, [status: OK] }
        }
    }

    @Transactional
    def delete(Raca racaInstance) {

        if (racaInstance == null) {
            notFound()
            return
        }

        racaInstance.delete flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.deleted.message', args: [message(code: 'Raca.label', default: 'Raca'), racaInstance.id])
                redirect action:"index", method:"GET"
            }
            '*'{ render status: NO_CONTENT }
        }
    }

    protected void notFound() {
        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.not.found.message', args: [message(code: 'raca.label', default: 'Raca'), params.id])
                redirect action: "index", method: "GET"
            }
            '*'{ render status: NOT_FOUND }
        }
    }
}
