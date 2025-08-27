package ui

fun menu(){
    do{
        println("1 - Cadastrar Caixa D'Água")
        println("2 - Editar Caixa D'Água")
        println("3 - Listar Caixa D'Água")
        println("4 - Excluir Caixa D'Água")
        println("0 - Sair")


        var opcao = readln().toInt()
        when(opcao){
            0-> println("Adios...")
            1-> println("Cadasrando Caixa...")
            2-> println("Editar Caixa...")
            3-> println("Listar Caixa...")
            4-> println("Excluir Caixa...")
            else -> println("Opção Inválida")
        }

    } while (opcao != 0)

}