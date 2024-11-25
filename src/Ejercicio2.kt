class Ejercicio2 {
    fun main(){
        fun main(){
            print("Introduzca una palabra: ")
            var palabra1:String = readln()

            print("Introduzca otra palabra: ")
            var palabra2:String = readln()

            if(palabra1.length == palabra2.length){
                var sonAnagramas:Boolean = false;
                var contResultado:Int = 0;
                for(i in palabra1){
                    for (k in palabra2){
                        if(k == i){
                            contResultado++
                        }
                    }
                }

                if (contResultado == palabra2.length){
                    sonAnagramas = true;
                }

                println("Las palabras $palabra1 y $palabra2 son un anagrama? = $sonAnagramas")
            } else {
                println("Las 2 palabras que has introducido no son de la misma lungitud, por lo que no son anagramas.")
            }
        }
    }
}