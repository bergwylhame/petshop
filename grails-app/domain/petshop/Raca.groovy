package petshop

class Raca {

    String nome

    static hasMany = [animais:Animal]

    static constraints = {
        nome nullable: false, blank: false, maxSize: 50, unique: true
    }

    String toString(){
        this.nome
    }
}

