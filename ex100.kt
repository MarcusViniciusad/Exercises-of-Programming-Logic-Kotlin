
fun main() {
    print("Digite um número de quatro algarismos: ")
    val numero = readln().toInt()

    val valor = numero / 100

    if (valor % 4 == 0) {
        println("$valor é múltiplo de 4")
    } else {
        println("$valor não é múltiplo de 4")
    }
}
