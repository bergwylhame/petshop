package petshop

class Atendimento {

    Double valor
    Boolean concluido
    String observacao
    Date data

    static belongsTo = [cliente:Cliente,servico:Servico,animal:Animal]

    static constraints = {
        observacao nullable: true, maxSize: 150
        valor nullable: false
    }

    static mapping = {
        concluido defaultValue: Boolean.FALSE
        valor defaultValue: 0.0
    }

    String toString(){
        data?.toString() + " - " + this.servico?.nome
    }
}
