import java.time.LocalDate

abstract class Publicacion() {
    /*Crear una clase abstracta Publicacion que tenga un título, autor y fecha (LocalDate)*/
    abstract val titulo:String
        abstract val autor:String
        abstract val fecha:LocalDate
    override fun toString(): String {
        return "Publicacion(titulo='$titulo', autor='$autor', fecha=$fecha)"
    }


}