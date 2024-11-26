fun main(){
    codigo("{a + b [c] * (2x2)}}}}");
    codigo("{ [ a * ( c + d ) ] - 5 }");
    codigo("{ a * ( c + d ) ] - 5 }");
    codigo("{a^4 + (((ax4)}");
    codigo("{ ] a * ( c + d ) + ( 2 - 3 )[ - 5 }");
    codigo("{{{{{{(}}}}}}");
    codigo("(a");
}

fun codigo(expresion:String){
    var balanceada:Boolean = false;
    val delimitadores = mutableListOf<Char>()
    var contador:Int = 0;
    val contadorMax:Int = expresion.length - 1;
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

    val totalSizeLista:Int = delimitadores.size ;
    var comparadorLista:Int = 0;
    if(delimitadores.size % 2 != 0){
        balanceada = false;
        println("$expresion ¿está balanceada? $balanceada");
    } else {
        var c: Int = 0;
        while(c < delimitadores.size - 1){
            if((delimitadores.get(c) == '{') && (delimitadores.get(c + 1) == '}') ||
                (delimitadores.get(c) == '[') && (delimitadores.get(c + 1) == ']') ||
                (delimitadores.get(c) == '(') && (delimitadores.get(c + 1) == ')')) {
                delimitadores.removeAt(c);
                delimitadores.removeAt(c);
                comparadorLista++;
                c = 0;
            } else {
                c++;
            }
        }

        if (comparadorLista == (totalSizeLista / 2)){
            balanceada = true
            println("$expresion ¿está balanceada? $balanceada");
        } else{
            balanceada = false;
            println("$expresion ¿está balanceada? $balanceada");
        }
    }

}