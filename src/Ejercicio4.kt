fun main(){
    var caso1Acciones: Array<String> = arrayOf("correr", "saltar", "correr", "saltar", "correr");
    var caso1Pista:String = "_|_|_"
    carrera(caso1Acciones, caso1Pista)
}

fun carrera(casoAccion:Array<String>, casoPista:String) {

    /*val listaPista:MutableList<Char> = mutableListOf();
        for (i in 0..casoPista.length - 1){
            listaPista.add(casoPista.get(i))
        }
    */

    //Cambio de forma de hacer la lista (visto en los apuntes)(El comentario de arriba es mi antigua forma de hacerlo)
    val listaPistaAux = casoPista.toMutableList()
    val listaPista = casoPista.toMutableList()
    var carreraSuperada = true

    for (k in casoAccion.indices){
        if(k >= listaPistaAux.size){
            listaPista.add('?')
            carreraSuperada = false
        }
    }

    for (i in casoAccion.indices){
        when(casoAccion[i]){
            "correr" -> if(listaPista[i] == '_'){
                            print("_")
                        } else if(listaPista[i] == '|'){
                            print("/")
                            carreraSuperada = false
                        } else {
                            carreraSuperada = false
                            print("?")
                        }

            "saltar" -> if(listaPista[i] == '|'){
                            print("|")
                        } else if(listaPista[i] == '_'){
                            print("x")
                            carreraSuperada = false
                        } else {
                            carreraSuperada = false
                            print("?")
                        }
        }
    }

    if (casoAccion.size < listaPista.size) {
        for (j in casoAccion.size until listaPista.size) {
            print('?')
            carreraSuperada = false
        }
    }
    print(" $carreraSuperada")
}
