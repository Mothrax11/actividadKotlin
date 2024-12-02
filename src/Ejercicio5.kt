fun main() {
    var listaTotal:MutableList<MutableList<String>> = mutableListOf()
    var fila1:MutableList<String> = mutableListOf("O", "O", "")
    var fila2:MutableList<String> = mutableListOf("", "", "")
    var fila3:MutableList<String> = mutableListOf("", "", "")
    listaTotal.add(fila1)
    listaTotal.add(fila2)
    listaTotal.add(fila3)
    println(fila1)
    println(fila2)
    println(fila3)
    codigo(listaTotal)
}

fun codigo(listaTotal:MutableList<MutableList<String>>){

    var countX = 0;
    var countO = 0;
    var noParidad = false;

    for(i in listaTotal) {
        for (k in i.indices) {
            if (i[k].equals("X")) {
                countX++;
            } else if (i[k].equals("O")) {
                countO++;
            }
        }
    }
    if(countO > countX){
        if(countX + 1 != countO){
            noParidad = true;
        }
    } else if (countX > countO) {
        if (countO + 1 != countX) {
            noParidad = true;
        }
    }

    var ganaX = false
    var ganaY = false

    //FILA 1
    if(listaTotal.get(0).get(0).equals("X") && listaTotal.get(0).get(1).equals("X") && listaTotal.get(0).get(2).equals("X")){
        ganaX = true
    } else if(listaTotal.get(0).get(0).equals("O") && listaTotal.get(0).get(1).equals("O") && listaTotal.get(0).get(2).equals("O")){
        ganaY = true
    }

    //FILA 2
        if(listaTotal.get(1).get(0).equals("X") && listaTotal.get(1).get(1).equals("X") && listaTotal.get(1).get(2).equals("X")){
            ganaX = true
        } else if(listaTotal.get(1).get(0).equals("O") && listaTotal.get(1).get(1).equals("O") && listaTotal.get(1).get(2).equals("O")){
            ganaY = true
        }

    //FILA 3
            if(listaTotal.get(2).get(0).equals("X") && listaTotal.get(2).get(1).equals("X") && listaTotal.get(2).get(2).equals("X")){
                ganaX = true
            } else if(listaTotal.get(2).get(0).equals("O") && listaTotal.get(2).get(1).equals("O") && listaTotal.get(2).get(2).equals("O")){
                ganaY = true
            }

    //COLUMNA 1
                if(listaTotal.get(0).get(0).equals("X") && listaTotal.get(1).get(0).equals("X") && listaTotal.get(2).get(0).equals("X")){
                    ganaX = true
                } else if(listaTotal.get(0).get(0).equals("O") && listaTotal.get(1).get(0).equals("O") && listaTotal.get(2).get(0).equals("O")){
                    ganaY = true
                }

    //COLUMNA 2
                    if(listaTotal.get(0).get(2).equals("X") && listaTotal.get(1).get(1).equals("X") && listaTotal.get(2).get(1).equals("X")){
                        ganaX = true
                    } else if(listaTotal.get(0).get(1).equals("O") && listaTotal.get(1).get(1).equals("O") && listaTotal.get(2).get(1).equals("O")){
                        ganaY = true
                    }

    //COLUMNA 3
                        if(listaTotal.get(0).get(2).equals("X") && listaTotal.get(1).get(2).equals("X") && listaTotal.get(2).get(2).equals("X")){
                            ganaX = true
                        } else if(listaTotal.get(0).get(2).equals("O") && listaTotal.get(1).get(2).equals("O") && listaTotal.get(2).get(2).equals("O")){
                            ganaY = true
                        }

    //DIAGONAL 1 A 9
                            if(listaTotal.get(0).get(0).equals("X") && listaTotal.get(1).get(1).equals("X") && listaTotal.get(2).get(2).equals("X")){
                                ganaX = true
                            } else if(listaTotal.get(0).get(0).equals("O") && listaTotal.get(1).get(1).equals("O") && listaTotal.get(2).get(2).equals("O")){
                                ganaY = true
                            }

    //DIAGONAL 3 A 7
                                if(listaTotal.get(0).get(2).equals("X") && listaTotal.get(1).get(1).equals("X") && listaTotal.get(2).get(0).equals("X")){
                                    ganaX = true
                                } else if(listaTotal.get(0).get(2).equals("O") && listaTotal.get(1).get(1).equals("O") && listaTotal.get(2).get(0).equals("O")){
                                    ganaY = true
                                }

    if(noParidad){
        println("Null")
    } else if (ganaX == true && ganaY == true){
        println("Empate")
    } else if(ganaX){
        println("X")
    } else if(ganaY){
        println("O")
    } else{
        println("No gana ninguno")
    }
}