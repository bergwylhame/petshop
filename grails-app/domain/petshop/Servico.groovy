package petshop

class Servico {

    String nome
    String descricao

    static hasMany = [atendimento:Atendimento]

    static constraints = {
        nome nullable: false, blank: false, maxSize: 30, unique: true
        descricao nullable: true, maxSize: 100, unique: false
    }

    String toString(){
        this.nome
    }
}
