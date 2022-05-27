package exercise.lesson.oo

class BankUser {

    companion object {
        fun describe(): String {
            return "This is BankUser class :D"
        }
    }

    constructor(username: String) {
        this.username = username
        this.balance = 0.0
        this.interest = 0.0
    }

    val username: String

    var balance: Double
    set(value) {
        field = value
        if(value >= 10000) {
            interest = 0.2
        } else if(value < 1000) {
            interest = 1.0
        } else {
            interest = 0.5
        }
    }

    var interest: Double


}