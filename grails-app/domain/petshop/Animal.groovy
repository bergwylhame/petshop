package petshop

class Animal {

    String nome
    int idade
    Sexo sexo

    static belongsTo = [cliente:Cliente, raca:Raca]

    static constraints = {
        nome nullable: false, maxSize: 50
        raca nullable: false
    }

    String toString(){
        this.nome + " (" + cliente?.nome + ")"
    }
}

