package exercise.lesson.oo

fun main(args: Array<String>) {
    val calculator = Calculator()
    calculator.add(12.0)
    println(calculator.total)
    calculator.sub(12.0)
    println(calculator.total)
    calculator.add(12.0)
    println(calculator.total)
    calculator.time(12.0)
    println(calculator.total)
    calculator.div(12.0)
    println(calculator.total)
    calculator.reset()
    println(calculator.total)


    if(DatabaseAccess.connected) {
        DatabaseAccess.disconnect()
    } else {
        DatabaseAccess.connect()
    }


    val doc: Job = Doctor(2000.0, 1500.0)
    val eng: Job = Engineer(3600.0, 2600.0)

    doc.study()
    println(doc.name)
    println(doc.revenue)
    println(doc.salary)

    eng.study()
    println(eng.name)
    println(eng.revenue)
    println(eng.salary)

    val user1 = UserAccount("Guigui", 1234.5)
    println(user1.userName)
    println(user1.balance)

    val user2 = UserAccount("Tom")
    println(user2.userName)
    println(user2.balance)

    val user3 = UserAccount()
    println(user3.userName)
    println(user3.balance)


    val bu = BankUser("Gui")
    println(bu.username)
    println(bu.interest)
    println(bu.balance)
    bu.balance = 12000.0
    println(bu.interest)
    println(bu.balance)

    println(BankUser.describe())

    val book = Book(Book.getEditor())
    println(book.editor.editorName)
}

object DatabaseAccess {
    var connected = false
    fun connect() {
        connected = true
        println("Connected to the database")
    }

    fun disconnect() {
        connected = false
        println("Disconnected from the database")
    }
}