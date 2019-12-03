
interface HistoryCommand {
    fun execute()
}

typealias CommandFnType = () -> Unit



val FooCommand : CommandFnType = fun() = println("Hello Foo")


val BarCommand : CommandFnType = fun() = println("Hello Bar")


class CommandProcessor {

    private val queue = ArrayList<CommandFnType>()

    fun addToQueue(orderCommand: CommandFnType): CommandProcessor
            = apply { queue.add(orderCommand) }

    fun processCommands(): CommandProcessor = apply {
        queue.forEach { fn -> fn() }
        queue.clear()
    }
}



    CommandProcessor()
            .addToQueue(FooCommand)
            .addToQueue(BarCommand)
            .processCommands()

