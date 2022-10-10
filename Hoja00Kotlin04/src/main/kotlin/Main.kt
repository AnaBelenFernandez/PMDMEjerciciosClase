fun main(args: Array<String>) {
   var libro=Libro("123845795323745", "El Quijote", "Cervantes" )
    print(libro.toString())
    if(libro.esEspañol()) println("Es Español")
    /*• Crea un objeto de tipo Masa
• Crea una pizza pasándole la masa anterior y los datos de los dos ingredientes
• Modifica el ingrediente2 con el método set
• Obtén el ingrediente1y modifica únicamente sus calorías
• Muestra los datos de la pizza por pantalla*/
    var masa=Masa(TipoMasa.fina,1000.00)
    var pizza=Pizza(masa,"Pepperoni",200.00,"Aceitunas",300.00)
    println(pizza.toString())
}