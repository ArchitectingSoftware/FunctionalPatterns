data class Event(val source: String)

typealias EventHandler = (Event) -> Unit

val kbHandler = fun(next: EventHandler): EventHandler = { evnt ->
    when(evnt.source)  {
        "keyboard" -> println("Keyboard Handler")
    }
    next(evnt)
}


val mouseHandler = fun(next: EventHandler): EventHandler = { evnt ->
    when(evnt.source)  {
        "mouse" -> println("Mouse Handler")
    }
    next(evnt)
}


val defaultHandler =  fun() = fun(_:Event) = println("default handler")
val finalResponse = fun() = fun(_ : Event) = println("Try git-blame.")



val chain = kbHandler(mouseHandler(defaultHandler()))


val e = Event("mouse")

chain(e)
