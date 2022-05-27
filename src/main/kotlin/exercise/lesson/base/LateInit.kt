package exercise.lesson.base

/**
 * Common use cases
 * dependency injection
 * unit testing
 */
fun main() {
    lateinit var networkService: String
    networkService = getNetworkService()
    println(networkService)
}

fun getNetworkService() = "Network Service"