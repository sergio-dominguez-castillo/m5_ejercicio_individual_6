package cl.bootcamp.ejercicioindividual6

fun main() {
    // Crear cuentas bancarias
    val account1 = CuentaBancaria("Cuenta Corriente", 500000.0)
    val account2 = CuentaBancaria("Cuenta Ahorro", 2000000.0)
    val account3 = CuentaBancaria("Cuenta Joven", 25000.0)

    // Realizar transacciones
    account1.depositMoney(50000.0)
    account1.castOut(450000.0)
    account1.castOut(250000.0) // Retiro fallido

    account2.depositMoney(100000.0)


    account3.depositMoney(50000.0)
    account3.castOut(10000.0)
    account3.castOut(10000.0)
    account3.castOut(10000.0)
    account3.castOut(10000.0)
    account3.castOut(10000.0)
    account3.castOut(10000.0)


    // Mostrar saldos e historiales
    println("Cuenta1")
    account1.showAvailableBalance()
    account1.showDetail()
    println("Cuenta2")
    account2.showAvailableBalance()
    account2.showDetail()
    println("Cuenta3")
    account3.showAvailableBalance()
    account3.showDetail()
}
