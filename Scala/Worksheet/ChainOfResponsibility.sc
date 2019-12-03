case class Event(source: String)

type EventHandler = PartialFunction[Event, Unit]

//the default handler just returns the only value for a Unit
//type -- in scala its "()

val defaultHandler: EventHandler = {
  case _ => println("Im the end of the road")
}


val keyboardHandler: EventHandler = {
  case Event("keyboard") => println("KB Handler")
}

def mouseHandler(delay: Int): EventHandler = {
  case Event("mouse") => println("MOUSE Handler")
}

val result = keyboardHandler.
        orElse(mouseHandler(100)).
        orElse(defaultHandler)

result(new Event("mouse"))
result(new Event("keyboard"))
result(new Event("bogus"))
