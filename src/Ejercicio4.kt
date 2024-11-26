fun main(){
    var caso1Acciones: Array<String> = arrayOf("correr", "saltar", "correr", "saltar", "correr");
    var caso1Pista:String = "_|_|_"
    carrera(caso1Acciones, caso1Pista)


}

fun carrera(casoAccion:Array<String>, casoPista:String) {

    val listaPista:MutableList<Char> = mutableListOf();
    for (i in 0..casoPista.length - 1){
        listaPista.add(casoPista.get(i))
    }

    var diferencia = 0;

    /*crear when para cada accion (correr o saltar),
    que compare con casoPista y realice lo oportuno */

    if(casoPista.length > listaPista.size){
        diferencia = casoPista.length - listaPista.size
        /*creacion de pista auxiliar para complementar las diferencias de tamaño
        (lo que antes eran huecos ahora serán null) para
        facilitar el cambio en pista a las interrogaciones
         */
        for(i in 0..diferencia) {

        }
    } else if (casoPista.length < listaPista.size){
        diferencia = listaPista.size - casoPista.length
    }

    for (k in casoAccion.indices){

    }
}