enum class Level(val msg: String){
    WARNING( "WARNING>> "),
    ERROR( "ERROR>> ")
}

object Logger {
    fun echo(level: Level, message: String) = println(level.msg +" "+message)
}

fun Logger.warning(message: String) = echo(Level.WARNING, message)
fun Logger.error(message: String) = echo(Level.ERROR, message)



Logger.echo(Level.WARNING, "This is from the new logger interface - warning")
Logger.echo(Level.ERROR, "This is from the nbew logger interface - error")

Logger.warning( "This is from the old logger interface warning")
Logger.error("This is from the old logger interface error")


