package crud

import enumeradores.Material

fun cadastrarCaixa(){
    /*
 val material: Material,
    val capacidade: Double?,
    val altura: Double,
    val largura: Double,
    val profundida: Double,


    PLASTICO, PVC, METAL, ARGAMASSA
     */
    println("Escolha o matrial do qual a caixa é feita ")
    println("1 - Plástico")
    println("2 - PVC")
    println("3 - Metal")
    println("4 - Argamassa")

    val opcao = readln().toInt()
    var material : Material
    when(opcao){
        1 -> material = Material.PLASTICO
        2 -> material = Material.PVC
        3 -> material = Material.METAL
        4 -> material = Material.ARGAMASSA
        else -> material = Material.PLASTICO
    }



    println("Capacidade da Caixa em Litros: ")
    val litros = readln().toDouble()

    println("Altura da Caixa : ")
    val altura = readln().toDouble()

    println("Largura da Caixa : ")
    val largura = readln().toDouble()

    println("Profundidade da Caixa : ")
    val profundidade = readln().toDouble()

    
}


fun editarCaixa(){

}

fun listarCaixa(){

}

fun excluirCaixa(){

}