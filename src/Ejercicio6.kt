    fun main() {
        val agenda:MutableList<Contacto> = mutableListOf()
        val maxTamanoAgenda: Int = 4
        menuInicial(agenda, maxTamanoAgenda)
    }

    fun menuInicial(agenda:MutableList<Contacto>, maxTamanoAgenda:Int){
        println("1. Añadir contacto")
        println("2. Listar contacto")
        println("3. Buscar contacto")
        println("4. Existe contacto")
        println("5. Eliminar Contacto")
        println("6. Contactos disponibles")
        println("7. Agenda llena")
        println("8. Salir")
        var choice = readln();

        when(choice.toInt()){
            1 -> anadirContacto(agenda, maxTamanoAgenda)
            2 -> listarContacto(agenda, maxTamanoAgenda)
            3 -> buscarContacto(agenda, maxTamanoAgenda)
            4 -> existeContacto(agenda, maxTamanoAgenda)
            5 -> eliminarContacto(agenda, maxTamanoAgenda)
            6 -> contactosDisponibles(agenda, maxTamanoAgenda)
            7 -> agendaLlena(agenda, maxTamanoAgenda)
            8 -> return
            else -> menuInicial(agenda, maxTamanoAgenda)
        }

    }

    fun anadirContacto(agenda:MutableList<Contacto>, maxTamanoAgenda:Int) {
        println("Escribe un nombre")
        val nombre = readln()
        println("Escribe un telefono")
        val telefono = readln()
        var salir: Boolean = false;

        for (i in agenda) {
            if (i.nombre.uppercase().equals(nombre.uppercase())) {
                println("El contacto con este nombre ya existe")
                salir = true
            }
        }

        if (salir) {
            menuInicial(agenda, maxTamanoAgenda)
        } else if (agenda.size + 1 == maxTamanoAgenda) {
            println("La agenda esta llena, no se pueden meter mas contactos")
            menuInicial(agenda, maxTamanoAgenda)
        } else if (agenda.add(Contacto(nombre, telefono))) {
            println("Se ha añadido el contacto")
            menuInicial(agenda, maxTamanoAgenda)
        }
    }

    fun listarContacto(agenda:MutableList<Contacto>, maxTamanoAgenda:Int){

        if(agenda.size == 0){
            println("No hay contactos que mostrar")
            menuInicial(agenda, maxTamanoAgenda)
        } else {
            for (i in agenda){
                println("Nombre = ${i.nombre}, Teléfono = ${i.numero}")
            }
            menuInicial(agenda, maxTamanoAgenda)
        }
    }

    fun buscarContacto(agenda:MutableList<Contacto>, maxTamanoAgenda:Int){

        println("Escribe un nombre")
        val nombre = readln()
        var existe = false;
        var telContacto:String = "-1"
        for (i in agenda){
            if(nombre.uppercase().equals(i.nombre.uppercase())){
                telContacto = i.numero
                existe = true
            }
        }

        if(existe){
            println("Su telefono es $telContacto")
            menuInicial(agenda, maxTamanoAgenda)
        } else {
            println("No se ha encontrado el contacto")
            menuInicial(agenda, maxTamanoAgenda)
        }
    }

    fun existeContacto(agenda:MutableList<Contacto>, maxTamanoAgenda:Int){

        println("Escribe un nombre")
        val nombre = readln()
        var existe = false;
        for (i in agenda){
            if(nombre.uppercase().equals(i.nombre.uppercase())){
                existe = true
            }
        }

        if(existe){
            println("Existe el contacto")
            menuInicial(agenda, maxTamanoAgenda)
        } else {
            println("No existe el contacto")
            menuInicial(agenda, maxTamanoAgenda)
        }
    }

    fun eliminarContacto(agenda:MutableList<Contacto>, maxTamanoAgenda:Int){
        println("Escribe un nombre")
        val nombre = readln()
        var existe = false;
        var contacto: Contacto? = null
        for (i in agenda){
            if(nombre.uppercase().equals(i.nombre.uppercase())){
                existe = true
                contacto = i
            }
        }

        if(existe){
            if(agenda.remove(contacto)){
                println("Se ha eliminado el contacto")
                menuInicial(agenda, maxTamanoAgenda)
            } else{
                println("No se ha eliminado el contacto")
                menuInicial(agenda, maxTamanoAgenda)
            }
        } else {
            println("No se ha eliminado el contacto")
            menuInicial(agenda, maxTamanoAgenda)
        }
    }

    fun contactosDisponibles(agenda:MutableList<Contacto>, maxTamanoAgenda:Int){
        val counter = maxTamanoAgenda - agenda.size - 1
        println("Hay $counter contacto/s libre/s en la agenda")
        menuInicial(agenda, maxTamanoAgenda)

    }

    fun agendaLlena(agenda:MutableList<Contacto>, maxTamanoAgenda:Int){
        if(agenda.size == 3){
            println("La agenda está llena")
            menuInicial(agenda, maxTamanoAgenda)
        } else {
            println("Aún se pueden meter contactos")
            menuInicial(agenda, maxTamanoAgenda)
        }
    }
