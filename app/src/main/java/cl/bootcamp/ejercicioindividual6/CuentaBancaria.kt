package cl.bootcamp.ejercicioindividual6

class CuentaBancaria(
    val nameAccount: String,
    var availableBalance: Double
) {
    private val detail = mutableListOf<String>()

    fun depositMoney(amount: Double) {
        availableBalance += amount
        detail.add("Deposito: $amount , Saldo Disponible: $availableBalance")
    }

    fun castOut(amount: Double) {
        if (amount <= availableBalance) {
            availableBalance -= amount
            detail.add("Retiro: $amount , Saldo Disponible: $availableBalance")
        } else {
            detail.add("Saldo insuficiente -> " +
                    "Retiro: $amount , Saldo Disponible: $availableBalance")
        }
    }

    fun showAvailableBalance() {
        println("Saldo disponible: $availableBalance")
    }

    fun showDetail() {
        println("Historial de transacciones para cuenta: $nameAccount")
        detail.forEach { println(it) }
    }
}