import java.time.LocalDate

class Libro(duracion:Int, titulo: String, autor: String, fecha: LocalDate): Publicacion() {
    /*De ésta heredarán la clase Libro que además tendrá como atributo el número de páginas*/
    override fun equals(other: Any?): Boolean {
        return super.equals(other)
    }

    override fun hashCode(): Int {
        return super.hashCode()
    }

    override val titulo: String
        get() = TODO("Not yet implemented")
    override val autor: String
        get() = TODO("Not yet implemented")
    override val fecha: LocalDate
        get() = TODO("Not yet implemented")

    override fun toString(): String {
        return super.toString()
    }
}