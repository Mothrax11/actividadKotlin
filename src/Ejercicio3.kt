import java.sql.SQLOutput

fun main(){

    var expresion:String = "{ ] a * ( c + d ) + ( 2 - 3 )[ - 5 }";
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
    var contadorResta:Int = delimitadores.size ;
    var comparador:Int = delimitadores.size ;

    if(delimitadores.size % 2 != 0){
        println("Falta alguna llave de apertura o de cierre")
    }
    for (i in 0..delimitadores.size){
        if((delimitadores.get(i) == '{') && (delimitadores.get(contadorResta) == '}')){
            delimitadores.removeAt(i)
            delimitadores.removeAt(contadorResta)
            contadorResta--;
            contador++;
        } else if((delimitadores.get(i) == '[') && (delimitadores.get(contadorResta) == ']')){
            delimitadores.removeAt(i)
            delimitadores.removeAt(contadorResta)
            contadorResta--;
            contador++;
        } else if((delimitadores.get(i) == '(') && (delimitadores.get(contadorResta) == ')')){
            delimitadores.removeAt(i)
            delimitadores.removeAt(contadorResta)
            contadorResta--;
            contador++;
        }
    }

    if (contador == (comparador / 2)){
        println("true")
    } else{
        println("false")
    }

}