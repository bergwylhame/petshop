package petshop


import static org.springframework.http.HttpStatus.*
import grails.transaction.Transactional

@Transactional(readOnly = true)
class SexoController {

    static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]

    def index(Integer max) {
        params.max = Math.min(max ?: 10, 100)
        respond Sexo.list(params), model: [sexoInstanceCount: Sexo.count()]
    }

    def show(Sexo sexoInstance) {
        respond sexoInstance
    }

    def create() {
        respond new Sexo(params)
    }

    @Transactional
    def save(Sexo sexoInstance) {
        if (sexoInstance == null) {
            notFound()
            return
        }

        if (sexoInstance.hasErrors()) {
            respond sexoInstance.errors, view: 'create'
            return
        }

        sexoInstance.save flush: true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.created.message', args: [message(code: 'sexo.label', default: 'Sexo'), sexoInstance.id])
                redirect sexoInstance
            }
            '*' { respond sexoInstance, [status: CREATED] }
        }
    }

    def edit(Sexo sexoInstance) {
        respond sexoInstance
    }

    @Transactional
    def update(Sexo sexoInstance) {
        if (sexoInstance == null) {
            notFound()
            return
        }

        if (sexoInstance.hasErrors()) {
            respond sexoInstance.errors, view: 'edit'
            return
        }

        sexoInstance.save flush: true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.updated.message', args: [message(code: 'Sexo.label', default: 'Sexo'), sexoInstance.id])
                redirect sexoInstance
            }
            '*' { respond sexoInstance, [status: OK] }
        }
    }

    @Transactional
    def delete(Sexo sexoInstance) {

        if (sexoInstance == null) {
            notFound()
            return
        }

        sexoInstance.delete flush: true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.deleted.message', args: [message(code: 'Sexo.label', default: 'Sexo'), sexoInstance.id])
                redirect action: "index", method: "GET"
            }
            '*' { render status: NO_CONTENT }
        }
    }

    protected void notFound() {
        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.not.found.message', args: [message(code: 'sexo.label', default: 'Sexo'), params.id])
                redirect action: "index", method: "GET"
            }
            '*' { render status: NOT_FOUND }
        }
    }
}
