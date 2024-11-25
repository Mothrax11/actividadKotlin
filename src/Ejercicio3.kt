import java.sql.SQLOutput

fun main(){

    var expresion:String = "{ [ a * ( c + d ) ] - 5 }";
    var balanceada:Boolean = false;
    var delimitadores: MutableList<Char> = mutableListOf()
    var contador:Int = 0;
    var contadorMax:Int = expresion.length - 1;
    while (contador <= contadorMax){
        when(expresion.get(contador)){
            '{' -> delimitadores.add(expresion.get(contador))
            '[' -> delimitadores.add(expresion.get(contador))
            '(' -> delimitadores.add(expresion.get(contador))
            ')' -> delimitadores.add(expresion.get(contador))
            ']' -> delimitadores.add(expresion.get(contador))
            '}' -> delimitadores.add(expresion.get(contador))
        }
        contador++;
    }

    println(delimitadores)
    
    if(delimitadores.size % 2 != 0){
        println("Falta alguna llave de apertura o de cierre")
    }

}