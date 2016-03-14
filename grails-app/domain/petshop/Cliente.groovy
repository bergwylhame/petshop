package petshop

class Cliente {

    String nome
    String telefone
    String cpf
    String endereco
    String cidade
    String cep
    String email

    static hasMany = [animais:Animal,atendimentos:Atendimento]

    static constraints = {
        nome nullable: false, maxSize: 70
        telefone nullable: false, maxSize: 11, unique: true
        endereco nullable: true
        cep nullable: true
        cidade nullable: true
        cpf nullable: true, maxSize: 11
        email nullable: true, maxSize: 50, unique: true
    }

    String toString(){
        this.nome
    }
}
