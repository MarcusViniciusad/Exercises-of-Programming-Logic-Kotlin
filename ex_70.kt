fun main() {
    print("Digite o valor da conta: ")
    val conta = readln().toDouble()

    val total = conta * 1.10

    println("Valor total com gorjeta: ${"%.2f".format(total)}")
}