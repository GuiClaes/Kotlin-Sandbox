package exercise.lesson.oo

class UserAccount {

    constructor() {
        this.userName = "No username"
        this.balance = 0.00
    }

    constructor(userName: String) {
        this.userName = userName
        this.balance = 0.00
    }

    constructor(userName: String, balance: Double) {
        this.userName = userName
        this.balance = balance
    }


    var userName: String
    var balance: Double
}